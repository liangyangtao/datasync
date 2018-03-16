package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyMainBusinessOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyMainBusiness;
import com.kf.data.service.online.NeeqCompanyMainBusinessOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyMainBusinessService;

/**
 * @Title: NeeqCompanyMainBusinessTask.java
 * @Package com.kf.data.task
 * @Description: 主要业务
 * @author: liangyt
 * @date: 2018年3月15日 下午6:40:30
 * @version V1.0
 */
// @Component
// @EnableScheduling
public class NeeqCompanyMainBusinessTask {

	private static String tableName = "neeq_company_main_business";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyMainBusinessOnlineService neeqCompanyMainBusinessOnlineService;

	@Autowired
	TdxCompanyMainBusinessService tdxCompanyMainBusinessService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyMainBusinessOnline> neeqCompanyMainBusinessOnlines = neeqCompanyMainBusinessOnlineService
				.readNeeqCompanyMainBusinessOnlines(tdxUpIndexOnline);
		if (neeqCompanyMainBusinessOnlines.size() > 0) {

			for (NeeqCompanyMainBusinessOnline neeqCompanyMainBusinessOnline : neeqCompanyMainBusinessOnlines) {
				try {
					TdxCompanyMainBusiness tdxCompanyMainBusiness = new TdxCompanyMainBusiness();
					tdxCompanyMainBusiness.setCompanyId(neeqCompanyMainBusinessOnline.getCompanyId());
					tdxCompanyMainBusiness.setCompanyName(neeqCompanyMainBusinessOnline.getCompanyName());
					tdxCompanyMainBusiness.setMainBusiness(neeqCompanyMainBusinessOnline.getMainBusiness());
					tdxCompanyMainBusiness.setReportDate(neeqCompanyMainBusinessOnline.getDate());
					tdxCompanyMainBusiness.setStockCode(neeqCompanyMainBusinessOnline.getStockCode());
					// tdxCompanyMainBusiness.setUpdatedAt(updatedAt);
					tdxCompanyMainBusinessService.saveTdxCompanyMainBusiness(tdxCompanyMainBusiness);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyMainBusinessOnline neeqCompanyMainBusinessOnline = neeqCompanyMainBusinessOnlines
						.get(neeqCompanyMainBusinessOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyMainBusinessOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyMainBusinessOnline.getUpdatedAt());
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
