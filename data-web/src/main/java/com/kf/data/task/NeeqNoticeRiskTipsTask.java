package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqNoticeRiskTipsChgOnline;
import com.kf.data.mybatis.entity.online.NeeqNoticeRiskTipsOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxNoticeRiskTips;
import com.kf.data.service.online.NeeqNoticeRiskTipsChgOnlineService;
import com.kf.data.service.online.NeeqNoticeRiskTipsOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxNoticeRiskTipsService;

/**
 * @Title: NeeqNoticeRiskTipsTask.java
 * @Package com.kf.data.task
 * @Description: 风险提示
 * @author: liangyt
 * @date: 2018年3月16日 下午1:46:27
 * @version V1.0
 */
//@Component
//@EnableScheduling
public class NeeqNoticeRiskTipsTask {

	private static String tableName = "neeq_notice_risk_tips";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqNoticeRiskTipsOnlineService neeqNoticeRiskTipsOnlineService;

	@Autowired
	NeeqNoticeRiskTipsChgOnlineService neeqNoticeRiskTipsChgOnlineService;

	@Autowired
	TdxNoticeRiskTipsService tdxNoticeRiskTipsService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqNoticeRiskTipsOnline> neeqNoticeRiskTipsOnlines = neeqNoticeRiskTipsOnlineService
				.readNeeqNoticeRiskTipsOnlines(tdxUpIndexOnline);
		if (neeqNoticeRiskTipsOnlines.size() > 0) {
			for (NeeqNoticeRiskTipsOnline neeqNoticeRiskTipsOnline : neeqNoticeRiskTipsOnlines) {
				try {
					TdxNoticeRiskTips tdxNoticeRiskTips = new TdxNoticeRiskTips();
					tdxNoticeRiskTips.setCompanyId(neeqNoticeRiskTipsOnline.getCompanyId());
					tdxNoticeRiskTips.setCompanyName(neeqNoticeRiskTipsOnline.getCompanyName());

					tdxNoticeRiskTips.setReportData(neeqNoticeRiskTipsOnline.getDtTips());
					tdxNoticeRiskTips.setRiskDetail(neeqNoticeRiskTipsOnline.getRiskDetail());
					tdxNoticeRiskTips.setRiskName(neeqNoticeRiskTipsOnline.getRiskName());
					tdxNoticeRiskTips.setStockCode(neeqNoticeRiskTipsOnline.getStockCode());
					// tdxNoticeRiskTips.setUpdatedAt(updatedAt);
					List<NeeqNoticeRiskTipsChgOnline> neeqNoticeRiskTipsChgOnlines = neeqNoticeRiskTipsChgOnlineService
							.readNeeqNoticeRiskTipsChgOnlineByIdAndDate(neeqNoticeRiskTipsOnline.getCompanyId(),
									neeqNoticeRiskTipsOnline.getDtTips());
					if (neeqNoticeRiskTipsChgOnlines.size() > 0) {
						tdxNoticeRiskTips
								.setIsChange(neeqNoticeRiskTipsChgOnlines.get(0).getIfChanged() == true ? 1 : 0);
					} else {
						tdxNoticeRiskTips.setIsChange(0);
					}
					tdxNoticeRiskTipsService.saveTdxNoticeRiskTips(tdxNoticeRiskTips);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqNoticeRiskTipsOnline neeqNoticeRiskTipsOnline = neeqNoticeRiskTipsOnlines
						.get(neeqNoticeRiskTipsOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqNoticeRiskTipsOnline.getId());
				tdxUpIndexOnline.setUptime(neeqNoticeRiskTipsOnline.getUpdatedAt());
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
