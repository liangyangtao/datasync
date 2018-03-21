package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyJudicialAuctionOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyJudicialAuction;
import com.kf.data.service.online.NeeqCompanyJudicialAuctionOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyJudicialAuctionService;

/**
 * @Title: NeeqCompanyJudicialAuctionTask.java
 * @Package com.kf.data.task
 * @Description: 司法拍卖
 * @author: liangyt
 * @date: 2018年3月16日 下午6:08:00
 * @version V1.0
 */
//@Component
//@EnableScheduling
public class NeeqCompanyJudicialAuctionTask {

	private static String tableName = "neeq_company_judicial_auction";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyJudicialAuctionOnlineService neeqCompanyJudicialAuctionOnlineService;

	@Autowired
	TdxCompanyJudicialAuctionService tdxCompanyJudicialAuctionService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyJudicialAuctionOnline> neeqCompanyJudicialAuctionOnlines = neeqCompanyJudicialAuctionOnlineService
				.readNeeqCompanyJudicialAuctionOnlines(tdxUpIndexOnline);
		if (neeqCompanyJudicialAuctionOnlines.size() > 0) {
			for (NeeqCompanyJudicialAuctionOnline neeqCompanyJudicialAuctionOnline : neeqCompanyJudicialAuctionOnlines) {
				try {
					TdxCompanyJudicialAuction tdxCompanyJudicialAuction = new TdxCompanyJudicialAuction();
					tdxCompanyJudicialAuction.setCompanyId(neeqCompanyJudicialAuctionOnline.getCompanyId());
					tdxCompanyJudicialAuction.setCompanyName(neeqCompanyJudicialAuctionOnline.getCompanyName());
					tdxCompanyJudicialAuction.setContent(neeqCompanyJudicialAuctionOnline.getContent());
					tdxCompanyJudicialAuction.setCourtName(neeqCompanyJudicialAuctionOnline.getCourtName());
					tdxCompanyJudicialAuction.setNoticeDt(neeqCompanyJudicialAuctionOnline.getAuctionDt());
					tdxCompanyJudicialAuction.setTitle(neeqCompanyJudicialAuctionOnline.getTitle());
					// tdxCompanyJudicialAuction.setUpdatedAt(updatedAt);
					tdxCompanyJudicialAuctionService.saveTdxCompanyJudicialAuction(tdxCompanyJudicialAuction);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyJudicialAuctionOnline neeqCompanyJudicialAuctionOnline = neeqCompanyJudicialAuctionOnlines
						.get(neeqCompanyJudicialAuctionOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyJudicialAuctionOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyJudicialAuctionOnline.getUpdatedAt());
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
