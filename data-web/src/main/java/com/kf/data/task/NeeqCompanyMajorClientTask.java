package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyMajorClientOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyMajorClient;
import com.kf.data.service.online.NeeqCompanyMajorClientOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyMajorClientService;

/**
 * @Title: NeeqCompanyMajorClientTask.java
 * @Package com.kf.data.task
 * @Description: 主要客户
 * @author: liangyt
 * @date: 2018年3月15日 下午6:56:04
 * @version V1.0
 */
 @Component
 @EnableScheduling
public class NeeqCompanyMajorClientTask {

	private static String tableName = "neeq_company_major_client";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyMajorClientOnlineService neeqCompanyMajorClientOnlineService;

	@Autowired
	TdxCompanyMajorClientService tdxCompanyMajorClientService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyMajorClientOnline> neeqCompanyMajorClientOnlines = neeqCompanyMajorClientOnlineService
				.readNeeqCompanyMajorClientOnlines(tdxUpIndexOnline);
		if (neeqCompanyMajorClientOnlines.size() > 0) {

			for (NeeqCompanyMajorClientOnline neeqCompanyMajorClientOnline : neeqCompanyMajorClientOnlines) {
				try {
					TdxCompanyMajorClient tdxCompanyMajorClient = new TdxCompanyMajorClient();
					tdxCompanyMajorClient.setClientName(neeqCompanyMajorClientOnline.getClientName());
					tdxCompanyMajorClient.setCompanyId(neeqCompanyMajorClientOnline.getCompanyId());
					tdxCompanyMajorClient.setCompanyName(neeqCompanyMajorClientOnline.getCompanyName());
					tdxCompanyMajorClient.setReportDate(neeqCompanyMajorClientOnline.getDate());
					tdxCompanyMajorClient.setSalesAmount(neeqCompanyMajorClientOnline.getSalesAmount());
					tdxCompanyMajorClient.setSalesAmountRatio(neeqCompanyMajorClientOnline.getSalesAmountRatio());
					tdxCompanyMajorClient.setStockCode(neeqCompanyMajorClientOnline.getStockCode());
					// tdxCompanyMajorClient.setUpdatedAt(updatedAt);
					tdxCompanyMajorClientService.saveTdxCompanyMajorClient(tdxCompanyMajorClient);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyMajorClientOnline neeqCompanyMajorClientOnline = neeqCompanyMajorClientOnlines
						.get(neeqCompanyMajorClientOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyMajorClientOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyMajorClientOnline.getUpdatedAt());
				tdxUpIndexOnlineService.saveTdxUpIndexOnline(tdxUpIndexOnline);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			try {
				Thread.sleep(5 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}
