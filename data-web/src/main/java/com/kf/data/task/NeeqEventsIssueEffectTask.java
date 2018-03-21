package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqEventsIssueEffectOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxEventsIssueEffect;
import com.kf.data.service.online.NeeqEventsIssueEffectOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxEventsIssueEffectService;

/**
 * @Title: NeeqEventsIssueEffectTask.java
 * @Package com.kf.data.task
 * @Description: 股票增发实施
 * @author: liangyt
 * @date: 2018年3月21日 上午10:01:10
 * @version V1.0
 */

//@Component
//@EnableScheduling
public class NeeqEventsIssueEffectTask {

	private static String tableName = "neeq_events_issue_effect";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqEventsIssueEffectOnlineService neeqEventsIssueEffectOnlineService;
	@Autowired
	TdxEventsIssueEffectService tdxEventsIssueEffectService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqEventsIssueEffectOnline> NeeqEventsIssueEffectOnlines = neeqEventsIssueEffectOnlineService
				.readNeeqEventsIssueEffectOnlines(tdxUpIndexOnline);
		if (NeeqEventsIssueEffectOnlines.size() > 0) {

			for (NeeqEventsIssueEffectOnline neeqEventsIssueEffectOnline : NeeqEventsIssueEffectOnlines) {

				try {
					TdxEventsIssueEffect tdxEventsIssueEffect = new TdxEventsIssueEffect();
					tdxEventsIssueEffect.setCompanyId(neeqEventsIssueEffectOnline.getCompanyId());
					tdxEventsIssueEffect.setCompanyName(neeqEventsIssueEffectOnline.getCompanyName());
					tdxEventsIssueEffect.setCompanyShortname(neeqEventsIssueEffectOnline.getCompanyShortname());
					tdxEventsIssueEffect.setDateBuy(neeqEventsIssueEffectOnline.getDateBuy());
					tdxEventsIssueEffect.setDateEffect(neeqEventsIssueEffectOnline.getDateEffect());
					tdxEventsIssueEffect.setDateEffNotice(neeqEventsIssueEffectOnline.getDateEffNotice());
					tdxEventsIssueEffect.setDatePlan(neeqEventsIssueEffectOnline.getDatePlan());
					tdxEventsIssueEffect.setDateRegist(neeqEventsIssueEffectOnline.getDateRegist());
					tdxEventsIssueEffect.setDtDelayPay(neeqEventsIssueEffectOnline.getDtDelayPay());
					tdxEventsIssueEffect.setDtReport(neeqEventsIssueEffectOnline.getDtReport());
					tdxEventsIssueEffect.setFundCash(neeqEventsIssueEffectOnline.getFundCash());
					tdxEventsIssueEffect.setFundTotal(neeqEventsIssueEffectOnline.getFundTotal());
					tdxEventsIssueEffect.setIfDependent(neeqEventsIssueEffectOnline.getIfDependent());
					tdxEventsIssueEffect.setIfStockTrade(neeqEventsIssueEffectOnline.getIfStockTrade());
					tdxEventsIssueEffect.setObjName(neeqEventsIssueEffectOnline.getObjName());
					tdxEventsIssueEffect.setPrice(neeqEventsIssueEffectOnline.getPrice());
					tdxEventsIssueEffect.setPriceClose(neeqEventsIssueEffectOnline.getPriceClose());
					tdxEventsIssueEffect.setPricingRule(neeqEventsIssueEffectOnline.getPricingRule());
					tdxEventsIssueEffect.setQuant(neeqEventsIssueEffectOnline.getQuant());
					tdxEventsIssueEffect.setRatioChange(neeqEventsIssueEffectOnline.getRatioChange());
					tdxEventsIssueEffect.setStockCode(neeqEventsIssueEffectOnline.getStockCode());
					tdxEventsIssueEffectService.saveTdxEventsIssueEffect(tdxEventsIssueEffect);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqEventsIssueEffectOnline neeqEventsIssueEffectOnline = NeeqEventsIssueEffectOnlines
						.get(NeeqEventsIssueEffectOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqEventsIssueEffectOnline.getId());
				tdxUpIndexOnline.setUptime(neeqEventsIssueEffectOnline.getUpdatedAt());
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
