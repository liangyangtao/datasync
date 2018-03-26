package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqEventsInvestInvestorsOnline;
import com.kf.data.mybatis.entity.online.NeeqEventsInvestOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxEventsInvest;
import com.kf.data.mybatis.entity.tdx.TdxEventsInvestInvestor;
import com.kf.data.service.online.NeeqEventsInvestInvestorsOnlineService;
import com.kf.data.service.online.NeeqEventsInvestOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxEventsInvestInvestorService;
import com.kf.data.service.tdx.TdxEventsInvestService;
import com.kf.data.tools.Md5Tools;

/**
 * @Title: NeeqEventsInvestTask.java
 * @Package com.kf.data.task
 * @Description: 投资事件
 * @author: liangyt
 * @date: 2018年3月21日 上午11:07:01
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqEventsInvestTask {
	private static String tableName = "neeq_events_invest";
	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;
	@Autowired
	NeeqEventsInvestOnlineService neeqEventsInvestOnlineService;
	@Autowired
	TdxEventsInvestService tdxEventsInvestService;

	@Autowired
	NeeqEventsInvestInvestorsOnlineService neeqEventsInvestInvestorsOnlineService;

	@Autowired
	TdxEventsInvestInvestorService tdxEventsInvestInvestorService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqEventsInvestOnline> neeqEventsInvestOnlines = neeqEventsInvestOnlineService
				.readNeeqEventsInvestOnlines(tdxUpIndexOnline);
		if (neeqEventsInvestOnlines.size() > 0) {

			for (NeeqEventsInvestOnline neeqEventsInvestOnline : neeqEventsInvestOnlines) {

				try {
					TdxEventsInvest tdxEventsInvest = new TdxEventsInvest();

					if (neeqEventsInvestOnline.getCompanyId() == null
							|| neeqEventsInvestOnline.getCompanyId().isEmpty()) {
						tdxEventsInvest.setCompanyId(
								Md5Tools.GetMD5Code(neeqEventsInvestOnline.getCompanyName().toLowerCase()));
					} else {
						tdxEventsInvest.setCompanyId(neeqEventsInvestOnline.getCompanyId());
					}

					tdxEventsInvest.setCompanyName(neeqEventsInvestOnline.getCompanyName());
					tdxEventsInvest.setDescription(neeqEventsInvestOnline.getDescription());
					tdxEventsInvest.setEventDate(neeqEventsInvestOnline.getDate());
					tdxEventsInvest.setEventId(neeqEventsInvestOnline.getEventId());
					tdxEventsInvest.setEventName(neeqEventsInvestOnline.getEventName());
					tdxEventsInvest.setInvestmentAmount(neeqEventsInvestOnline.getInvestmentAmount());
					tdxEventsInvest.setInvestRatio(neeqEventsInvestOnline.getInvestRatio());
					tdxEventsInvest.setStep(neeqEventsInvestOnline.getStep());
					tdxEventsInvestService.saveTdxEventsInvest(tdxEventsInvest);

					List<NeeqEventsInvestInvestorsOnline> tdxEventsInvestInvestors = neeqEventsInvestInvestorsOnlineService
							.readNeeqEventsInvestInvestorsOnlinesByEventId(neeqEventsInvestOnline.getEventId());
					if (tdxEventsInvestInvestors.size() > 0) {
						for (NeeqEventsInvestInvestorsOnline neeqEventsInvestInvestorsOnline : tdxEventsInvestInvestors) {
							TdxEventsInvestInvestor tdxEventsInvestInvestor = new TdxEventsInvestInvestor();

							if (neeqEventsInvestOnline.getCompanyId() == null
									|| neeqEventsInvestOnline.getCompanyId().isEmpty()) {
								tdxEventsInvestInvestor.setCompanyId(
										Md5Tools.GetMD5Code(neeqEventsInvestOnline.getCompanyName().toLowerCase()));
							} else {
								tdxEventsInvestInvestor.setCompanyId(neeqEventsInvestOnline.getCompanyId());
							}
							tdxEventsInvestInvestor.setCompanyName(neeqEventsInvestOnline.getCompanyName());
							tdxEventsInvestInvestor.setEventId(neeqEventsInvestOnline.getEventId());
							if (neeqEventsInvestInvestorsOnline.getInvestorId() == null
									|| neeqEventsInvestInvestorsOnline.getInvestorId().isEmpty()) {
								tdxEventsInvestInvestor.setInvestorId(
										Md5Tools.GetMD5Code(neeqEventsInvestInvestorsOnline.getInvestorName()));
							} else {
								tdxEventsInvestInvestor.setInvestorId(neeqEventsInvestInvestorsOnline.getInvestorId());
							}

							tdxEventsInvestInvestor.setInvestorName(neeqEventsInvestInvestorsOnline.getInvestorName());
							tdxEventsInvestInvestorService.saveTdxEventsInvestInvestor(tdxEventsInvestInvestor);
						}

					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqEventsInvestOnline neeqEventsInvestOnline = neeqEventsInvestOnlines
						.get(neeqEventsInvestOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqEventsInvestOnline.getId());
				tdxUpIndexOnline.setUptime(neeqEventsInvestOnline.getUpdatedAt());
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
