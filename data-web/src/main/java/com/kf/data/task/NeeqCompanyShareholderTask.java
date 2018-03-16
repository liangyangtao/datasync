package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyShareholdersContributiveOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyShareholdersOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyShareholders;
import com.kf.data.service.online.NeeqCompanyShareholdersContributiveOnlineService;
import com.kf.data.service.online.NeeqCompanyShareholdersOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyShareholdersService;

/**
 * @Title: NeeqCompanyExecutiveTask.java
 * @Package com.kf.data.task
 * @Description: 高管数据同步
 * @author: liangyt
 * @date: 2018年3月14日 下午4:07:32
 * @version V1.0
 */

//@Component
//@EnableScheduling
public class NeeqCompanyShareholderTask {

	private static String tableName = "neeq_company_shareholders";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyShareholdersOnlineService neeqCompanyShareholdersOnlineService;

	@Autowired
	NeeqCompanyShareholdersContributiveOnlineService neeqCompanyShareholdersContributiveOnlineService;

	@Autowired
	TdxCompanyShareholdersService tdxCompanyShareholdersService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyShareholdersOnline> neeqCompanyShareholdersOnlines = neeqCompanyShareholdersOnlineService
				.readNeeqCompanyShareholdersOnlines(tdxUpIndexOnline);
		if (neeqCompanyShareholdersOnlines.size() > 0) {

			for (NeeqCompanyShareholdersOnline neeqCompanyShareholdersOnline : neeqCompanyShareholdersOnlines) {

				try {
					TdxCompanyShareholders tdxCompanyShareholders = new TdxCompanyShareholders();
					tdxCompanyShareholders.setCompanyId(neeqCompanyShareholdersOnline.getCompanyId());
					tdxCompanyShareholders.setCompanyShortname(neeqCompanyShareholdersOnline.getCompanyName());
					tdxCompanyShareholders.setId(neeqCompanyShareholdersOnline.getId());
					tdxCompanyShareholders.setName(neeqCompanyShareholdersOnline.getName());
					tdxCompanyShareholders.setQuantity(neeqCompanyShareholdersOnline.getQuantity());
					tdxCompanyShareholders.setRatio(neeqCompanyShareholdersOnline.getRatio());
					tdxCompanyShareholders.setReportDate(neeqCompanyShareholdersOnline.getDate());
					tdxCompanyShareholders.setStockCode(neeqCompanyShareholdersOnline.getStockCode());
					// tdxCompanyShareholders.setUpdatedAt(updatedAt);
					tdxCompanyShareholders.setStockholderDescribe(neeqCompanyShareholdersOnline.getStockholderType());
//					List<NeeqCompanyShareholdersContributiveOnline> neeqCompanyShareholdersContributives = neeqCompanyShareholdersContributiveOnlineService
//							.readNeeqCompanyShareholdersContributiveOnlineById(
//									neeqCompanyShareholdersOnline.getStockholderId());
//					if (neeqCompanyShareholdersContributives.size() > 0) {
//						tdxCompanyShareholders.setMoney(neeqCompanyShareholdersContributives.get(0).getMoney());
//					}
					tdxCompanyShareholdersService.saveTdxCompanyShareholders(tdxCompanyShareholders);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyShareholdersOnline neeqCompanyShareholdersOnline = neeqCompanyShareholdersOnlines
						.get(neeqCompanyShareholdersOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyShareholdersOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyShareholdersOnline.getUpdatedAt());
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
