package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqEventsTenderBidOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxEventsTenderBid;
import com.kf.data.service.online.NeeqEventsIssueEffectOnlineService;
import com.kf.data.service.online.NeeqEventsTenderBidOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxEventsTenderBidService;

/**
 * @Title: NeeqEventsTenderBidTask.java
 * @Package com.kf.data.task
 * @Description: 招投标
 * @author: liangyt
 * @date: 2018年3月22日 下午2:20:07
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqEventsTenderBidTask {

	private static String tableName = "neeq_events_tender_bid";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqEventsTenderBidOnlineService neeqEventsTenderBidOnlineService;

	@Autowired
	NeeqEventsIssueEffectOnlineService neeqEventsIssueEffectOnlineService;

	@Autowired
	TdxEventsTenderBidService tdxEventsTenderBidService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqEventsTenderBidOnline> neeqEventsTenderBidOnlines = neeqEventsTenderBidOnlineService
				.readNeeqEventsTenderBidOnlines(tdxUpIndexOnline);
		if (neeqEventsTenderBidOnlines.size() > 0) {

			for (NeeqEventsTenderBidOnline neeqEventsTenderBidOnline : neeqEventsTenderBidOnlines) {

				try {
					TdxEventsTenderBid tdxEventsTenderBid = new TdxEventsTenderBid();
					tdxEventsTenderBid.setBidId(neeqEventsTenderBidOnline.getBidId());
					tdxEventsTenderBid.setBuyer(neeqEventsTenderBidOnline.getBuyer());
					tdxEventsTenderBid.setCompanyId(neeqEventsTenderBidOnline.getCompanyId());
					tdxEventsTenderBid.setContent(neeqEventsTenderBidOnline.getContent());
					tdxEventsTenderBid.setDate(neeqEventsTenderBidOnline.getDate());
					tdxEventsTenderBid.setTitle(neeqEventsTenderBidOnline.getTitle());
//					tdxEventsTenderBid.setUpdatedAt(updatedAt);

					tdxEventsTenderBidService.saveTdxEventsTenderBid(tdxEventsTenderBid);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqEventsTenderBidOnline neeqEventsTenderBidOnline = neeqEventsTenderBidOnlines
						.get(neeqEventsTenderBidOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqEventsTenderBidOnline.getId());
				tdxUpIndexOnline.setUptime(neeqEventsTenderBidOnline.getUpdatedAt());
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
