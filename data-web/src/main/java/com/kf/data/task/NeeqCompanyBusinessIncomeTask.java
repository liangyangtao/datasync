package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyBusinessIncomeOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyBusinessIncome;
import com.kf.data.service.online.NeeqCompanyBusinessIncomeOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyBusinessIncomeService;

/**
 * @Title: NeeqCompanyBusinessIncomeTask.java
 * @Package com.kf.data.task
 * @Description: 营收来源
 * @author: liangyt
 * @date: 2018年3月15日 下午6:49:48
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqCompanyBusinessIncomeTask {

	private static String tableName = "neeq_company_business_income";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyBusinessIncomeOnlineService neeqCompanyBusinessIncomeOnlineService;

	@Autowired
	TdxCompanyBusinessIncomeService tdxCompanyBusinessIncomeService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyBusinessIncomeOnline> neeqCompanyBusinessIncomeOnlines = neeqCompanyBusinessIncomeOnlineService
				.readNeeqCompanyBusinessIncomeOnlines(tdxUpIndexOnline);
		if (neeqCompanyBusinessIncomeOnlines.size() > 0) {
			for (NeeqCompanyBusinessIncomeOnline neeqCompanyBusinessIncomeOnline : neeqCompanyBusinessIncomeOnlines) {
				try {
					// 先保存高管基本信息
					TdxCompanyBusinessIncome tdxCompanyBusinessIncome = new TdxCompanyBusinessIncome();
					tdxCompanyBusinessIncome.setBusiness(neeqCompanyBusinessIncomeOnline.getBusiness());
					tdxCompanyBusinessIncome.setBusinessIncome(neeqCompanyBusinessIncomeOnline.getBusinessIncome());
					tdxCompanyBusinessIncome
							.setBusinessIncomeRatio(neeqCompanyBusinessIncomeOnline.getBusinessIncomeRatio());
					tdxCompanyBusinessIncome.setCompanyId(neeqCompanyBusinessIncomeOnline.getCompanyId());
					tdxCompanyBusinessIncome.setCompanyName(neeqCompanyBusinessIncomeOnline.getCompanyName());
					tdxCompanyBusinessIncome.setReportDate(neeqCompanyBusinessIncomeOnline.getDate());
					// tdxCompanyBusinessIncome.setUpdatedAt(updatedAt);
					tdxCompanyBusinessIncomeService.saveTdxCompanyBusinessIncome(tdxCompanyBusinessIncome);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyBusinessIncomeOnline neeqCompanyBusinessIncomeOnline = neeqCompanyBusinessIncomeOnlines
						.get(neeqCompanyBusinessIncomeOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyBusinessIncomeOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyBusinessIncomeOnline.getUpdatedAt());
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
