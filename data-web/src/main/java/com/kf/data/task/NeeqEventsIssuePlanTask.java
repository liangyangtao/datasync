package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqEventsIssueEffectOnline;
import com.kf.data.mybatis.entity.online.NeeqEventsIssuePlanOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxEventsIssuePlan;
import com.kf.data.service.online.NeeqEventsIssueEffectOnlineService;
import com.kf.data.service.online.NeeqEventsIssuePlanOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxEventsIssuePlanService;

/**
 * @Title: NeeqCompanyExecutiveTask.java
 * @Package com.kf.data.task
 * @Description: 股票增发预案
 * @author: liangyt
 * @date: 2018年3月14日 下午4:07:32
 * @version V1.0
 */

@Component
@EnableScheduling
public class NeeqEventsIssuePlanTask {

	private static String tableName = "neeq_events_issue_plan";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqEventsIssuePlanOnlineService neeqEventsIssuePlanOnlineService;

	@Autowired
	NeeqEventsIssueEffectOnlineService neeqEventsIssueEffectOnlineService;

	@Autowired
	TdxEventsIssuePlanService tdxEventsIssuePlanService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqEventsIssuePlanOnline> NeeqEventsIssuePlanOnlines = neeqEventsIssuePlanOnlineService
				.readNeeqEventsIssuePlanOnlines(tdxUpIndexOnline);
		if (NeeqEventsIssuePlanOnlines.size() > 0) {

			for (NeeqEventsIssuePlanOnline neeqEventsIssuePlanOnline : NeeqEventsIssuePlanOnlines) {

				try {
					TdxEventsIssuePlan tdxEventsIssuePlan = new TdxEventsIssuePlan();
					tdxEventsIssuePlan.setCompanyId(neeqEventsIssuePlanOnline.getCompanyId());
					tdxEventsIssuePlan.setCompanyShortname(neeqEventsIssuePlanOnline.getCompanyShortname());
					tdxEventsIssuePlan.setDateNew(neeqEventsIssuePlanOnline.getDateNew());
					tdxEventsIssuePlan.setDatePlan(neeqEventsIssuePlanOnline.getDatePlan());
					tdxEventsIssuePlan.setFund(neeqEventsIssuePlanOnline.getFundMin());
					tdxEventsIssuePlan.setIfDependent(neeqEventsIssuePlanOnline.getIfDependent());
					tdxEventsIssuePlan.setObjName(neeqEventsIssuePlanOnline.getObjName());
					tdxEventsIssuePlan.setPrice(neeqEventsIssuePlanOnline.getPriceMin());
					tdxEventsIssuePlan.setProgressName(neeqEventsIssuePlanOnline.getProgressName());
					tdxEventsIssuePlan.setPurpose(neeqEventsIssuePlanOnline.getPurpose());
					tdxEventsIssuePlan.setQuant(neeqEventsIssuePlanOnline.getQuantMin());
					tdxEventsIssuePlan.setStockCode(neeqEventsIssuePlanOnline.getStockCode());
					// tdxEventsIssuePlan.setUpdatedAt(updatedAt);
					List<NeeqEventsIssueEffectOnline> neeqEventsIssueEffectOnlines = neeqEventsIssueEffectOnlineService
							.readNeeqEventsIssueEffectOnlineByid(neeqEventsIssuePlanOnline.getEventsId());
					if (neeqEventsIssueEffectOnlines.size() > 0) {
						NeeqEventsIssueEffectOnline neeqEventsIssueEffectOnline = neeqEventsIssueEffectOnlines.get(0);
						tdxEventsIssuePlan.setDateEffNotice(neeqEventsIssueEffectOnline.getDateEffect());
						tdxEventsIssuePlan.setDateRegist(neeqEventsIssueEffectOnline.getDateRegist());
						tdxEventsIssuePlan.setRatioChange(neeqEventsIssueEffectOnline.getRatioChange());
					}
					tdxEventsIssuePlanService.saveTdxEventsIssuePlan(tdxEventsIssuePlan);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqEventsIssuePlanOnline neeqEventsIssuePlanOnline = NeeqEventsIssuePlanOnlines
						.get(NeeqEventsIssuePlanOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqEventsIssuePlanOnline.getId());
				tdxUpIndexOnline.setUptime(neeqEventsIssuePlanOnline.getUpdatedAt());
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
