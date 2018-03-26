package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyAnnouncementOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyAnnouncement;
import com.kf.data.service.online.NeeqCompanyAnnouncementOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyAnnouncementService;

/**
 * @Title: NeeqCompanyAnnouncementTask.java
 * @Package com.kf.data.task
 * @Description: 开庭公告
 * @author: liangyt
 * @date: 2018年3月22日 上午11:12:24
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqCompanyAnnouncementTask {

	private static String tableName = "neeq_company_announcement";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyAnnouncementOnlineService neeqCompanyAnnouncementOnlineService;

	@Autowired
	TdxCompanyAnnouncementService tdxCompanyAnnouncementService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyAnnouncementOnline> neeqCompanyAnnouncementOnlines = neeqCompanyAnnouncementOnlineService
				.readNeeqCompanyAnnouncementOnlines(tdxUpIndexOnline);
		if (neeqCompanyAnnouncementOnlines.size() > 0) {
			for (NeeqCompanyAnnouncementOnline neeqCompanyAnnouncementOnline : neeqCompanyAnnouncementOnlines) {
				try {
					TdxCompanyAnnouncement tdxCompanyAnnouncement = new TdxCompanyAnnouncement();
					tdxCompanyAnnouncement.setCaseNo(neeqCompanyAnnouncementOnline.getCaseNo());
					tdxCompanyAnnouncement.setCaseReason(neeqCompanyAnnouncementOnline.getCaseReason());
					tdxCompanyAnnouncement.setCompanyId(neeqCompanyAnnouncementOnline.getCompanyId());
					tdxCompanyAnnouncement.setContractors(neeqCompanyAnnouncementOnline.getContractors());
					tdxCompanyAnnouncement.setCourt(neeqCompanyAnnouncementOnline.getCourt());
					tdxCompanyAnnouncement.setCourtRoom(neeqCompanyAnnouncementOnline.getCourtRoom());
					tdxCompanyAnnouncement.setDefendant(neeqCompanyAnnouncementOnline.getDefendant());
					tdxCompanyAnnouncement.setJudge(neeqCompanyAnnouncementOnline.getJudge());
					tdxCompanyAnnouncement.setPlaintiff(neeqCompanyAnnouncementOnline.getPlaintiff());
					tdxCompanyAnnouncement.setStartDate(neeqCompanyAnnouncementOnline.getStartDate());
					// TdxCompanyAnnouncement.setUpdatedAt(updatedAt);
					tdxCompanyAnnouncementService.saveTdxCompanyAnnouncement(tdxCompanyAnnouncement);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyAnnouncementOnline neeqCompanyAnnouncementOnline = neeqCompanyAnnouncementOnlines
						.get(neeqCompanyAnnouncementOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyAnnouncementOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyAnnouncementOnline.getUpdatedAt());
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
