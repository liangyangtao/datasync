package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyResearchStatOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyResearchStat;
import com.kf.data.service.online.NeeqCompanyResearchStatOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyResearchStatService;

/**
 * @Title: NeeqCompanyResearchStatTask.java
 * @Package com.kf.data.task
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午3:12:35
 * @version V1.0
 */
//@Component
//@EnableScheduling
public class NeeqCompanyResearchStatTask {

	private static String tableName = "neeq_company_research_stat";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyResearchStatOnlineService neeqCompanyResearchStatOnlineService;

	@Autowired
	TdxCompanyResearchStatService tdxCompanyResearchStatService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyResearchStatOnline> neeqCompanyResearchStatOnlines = neeqCompanyResearchStatOnlineService
				.readNeeqCompanyResearchStatOnlines(tdxUpIndexOnline);
		if (neeqCompanyResearchStatOnlines.size() > 0) {

			for (NeeqCompanyResearchStatOnline neeqCompanyResearchStatOnline : neeqCompanyResearchStatOnlines) {
				try {
					TdxCompanyResearchStat tdxCompanyResearchStat = new TdxCompanyResearchStat();
					tdxCompanyResearchStat.setCompanyId(neeqCompanyResearchStatOnline.getCompanyId());
					tdxCompanyResearchStat.setCompanyShortname(neeqCompanyResearchStatOnline.getCompanyShortname());
					tdxCompanyResearchStat.setReportDate(neeqCompanyResearchStatOnline.getDate());
					tdxCompanyResearchStat
							.setResearchExpenseAmount(neeqCompanyResearchStatOnline.getResearchExpenseAmount());
					tdxCompanyResearchStat
							.setResearchExpenseAmountPre(neeqCompanyResearchStatOnline.getResearchExpenseAmountPre());
					tdxCompanyResearchStat
							.setResearchExpenseRatio(neeqCompanyResearchStatOnline.getResearchExpenseRatio());
					tdxCompanyResearchStat
							.setResearchExpenseRatioPre(neeqCompanyResearchStatOnline.getResearchExpenseRatioPre());
					tdxCompanyResearchStat.setStockCode(neeqCompanyResearchStatOnline.getStockCode());
					tdxCompanyResearchStatService.saveTdxCompanyResearchStat(tdxCompanyResearchStat);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyResearchStatOnline neeqCompanyResearchStatOnline = neeqCompanyResearchStatOnlines
						.get(neeqCompanyResearchStatOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyResearchStatOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyResearchStatOnline.getUpdatedAt());
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
