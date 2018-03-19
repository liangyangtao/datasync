package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyIndustryRatingOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyIndustryRating;
import com.kf.data.service.online.NeeqCompanyIndustryRatingOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyIndustryRatingService;

/**
 * @Title: NeeqCompanyIndustryRatingTask.java
 * @Package com.kf.data.task
 * @Description: 企业评级
 * @author: liangyt
 * @date: 2018年3月15日 下午6:49:48
 * @version V1.0
 */
//@Component
//@EnableScheduling
public class NeeqCompanyIndustryRatingTask {

	private static String tableName = "neeq_company_industry_rating";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyIndustryRatingOnlineService neeqCompanyIndustryRatingOnlineService;

	@Autowired
	TdxCompanyIndustryRatingService tdxCompanyIndustryRatingService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyIndustryRatingOnline> neeqCompanyIndustryRatingOnlines = neeqCompanyIndustryRatingOnlineService
				.readNeeqCompanyIndustryRatingOnlines(tdxUpIndexOnline);
		if (neeqCompanyIndustryRatingOnlines.size() > 0) {
			for (NeeqCompanyIndustryRatingOnline neeqCompanyIndustryRatingOnline : neeqCompanyIndustryRatingOnlines) {
				try {
					TdxCompanyIndustryRating tdxCompanyIndustryRating = new TdxCompanyIndustryRating();
					tdxCompanyIndustryRating.setCompanyId(neeqCompanyIndustryRatingOnline.getCompanyId());
					tdxCompanyIndustryRating.setCompanyName(neeqCompanyIndustryRatingOnline.getCompanyName());
					tdxCompanyIndustryRating.setLastRating(neeqCompanyIndustryRatingOnline.getLastRating());
					tdxCompanyIndustryRating.setRating(neeqCompanyIndustryRatingOnline.getRating());
					tdxCompanyIndustryRating.setReportDate(neeqCompanyIndustryRatingOnline.getReportDate());
					tdxCompanyIndustryRating.setReporterName(neeqCompanyIndustryRatingOnline.getReporterName());
					tdxCompanyIndustryRating.setReportTitle(neeqCompanyIndustryRatingOnline.getReportTitle());
					tdxCompanyIndustryRating.setReportView(neeqCompanyIndustryRatingOnline.getReportView());
					tdxCompanyIndustryRating.setResearchInstituteShortname(
							neeqCompanyIndustryRatingOnline.getResearchInstituteShortname());
					tdxCompanyIndustryRatingService.saveTdxCompanyIndustryRating(tdxCompanyIndustryRating);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyIndustryRatingOnline neeqCompanyIndustryRatingOnline = neeqCompanyIndustryRatingOnlines
						.get(neeqCompanyIndustryRatingOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyIndustryRatingOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyIndustryRatingOnline.getUpdatedAt());
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
