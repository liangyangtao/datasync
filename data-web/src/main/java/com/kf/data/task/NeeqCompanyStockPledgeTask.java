package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyStockPledgeOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyStockPledge;
import com.kf.data.service.online.NeeqCompanyStockPledgeOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyStockPledgeService;

/**
 * @Title: NeeqCompanyStockPledgeTask.java
 * @Package com.kf.data.task
 * @Description: 股权质押
 * @author: liangyt
 * @date: 2018年3月21日 下午1:46:15
 * @version V1.0
 */
 @Component
 @EnableScheduling
public class NeeqCompanyStockPledgeTask {

	private static String tableName = "neeq_company_stock_pledge";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyStockPledgeOnlineService neeqCompanyStockPledgeOnlineService;

	@Autowired
	TdxCompanyStockPledgeService tdxCompanyStockPledgeService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyStockPledgeOnline> neeqCompanyStockPledgeOnlines = neeqCompanyStockPledgeOnlineService
				.readNeeqCompanyStockPledgeOnlines(tdxUpIndexOnline);
		if (neeqCompanyStockPledgeOnlines.size() > 0) {

			for (NeeqCompanyStockPledgeOnline neeqCompanyStockPledgeOnline : neeqCompanyStockPledgeOnlines) {
				try {
					TdxCompanyStockPledge tdxCompanyStockPledge = new TdxCompanyStockPledge();
					tdxCompanyStockPledge.setCompanyId(neeqCompanyStockPledgeOnline.getCompanyId());
					tdxCompanyStockPledge.setDtEnd(neeqCompanyStockPledgeOnline.getDtEnd());
					tdxCompanyStockPledge.setDtNotice(neeqCompanyStockPledgeOnline.getDtNotice());
					tdxCompanyStockPledge.setDtStart(neeqCompanyStockPledgeOnline.getDtStart());
					// tdxCompanyStockPledge.setId(id);
					tdxCompanyStockPledge.setLoanFrom(neeqCompanyStockPledgeOnline.getLoanFrom());
					tdxCompanyStockPledge.setPldName(neeqCompanyStockPledgeOnline.getPldName());
					tdxCompanyStockPledge.setPldPurpose(neeqCompanyStockPledgeOnline.getPldPurpose());
					tdxCompanyStockPledge.setPldShareNum(neeqCompanyStockPledgeOnline.getPldShareNum());
					tdxCompanyStockPledge.setPldShareRatio(neeqCompanyStockPledgeOnline.getPldShareRatio());
					tdxCompanyStockPledge.setPldShareRatioTotal(neeqCompanyStockPledgeOnline.getPldShareRatioTotal());
					tdxCompanyStockPledge.setStockCode(neeqCompanyStockPledgeOnline.getStockCode());
					tdxCompanyStockPledge.setStockName(neeqCompanyStockPledgeOnline.getStockName());
					tdxCompanyStockPledgeService.saveTdxCompanyStockPledge(tdxCompanyStockPledge);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyStockPledgeOnline neeqCompanyStockPledgeOnline = neeqCompanyStockPledgeOnlines
						.get(neeqCompanyStockPledgeOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyStockPledgeOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyStockPledgeOnline.getUpdatedAt());
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
