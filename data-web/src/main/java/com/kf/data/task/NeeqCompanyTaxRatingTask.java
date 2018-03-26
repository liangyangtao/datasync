package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyTaxRatingOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyTaxRating;
import com.kf.data.service.online.NeeqCompanyTaxRatingOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyTaxRatingService;

/**
 * @Title: NeeqCompanyTaxRatingTask.java
 * @Package com.kf.data.task
 * @Description: 税务评级
 * @author: liangyt
 * @date: 2018年3月22日 下午3:02:57
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqCompanyTaxRatingTask {

	private static String tableName = "neeq_company_tax_rating";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyTaxRatingOnlineService neeqCompanyTaxRatingOnlineService;

	@Autowired
	TdxCompanyTaxRatingService tdxCompanyTaxRatingService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyTaxRatingOnline> neeqCompanyTaxRatingOnlines = neeqCompanyTaxRatingOnlineService
				.readNeeqCompanyTaxRatingOnlines(tdxUpIndexOnline);
		if (neeqCompanyTaxRatingOnlines.size() > 0) {

			for (NeeqCompanyTaxRatingOnline neeqCompanyTaxRatingOnline : neeqCompanyTaxRatingOnlines) {
				try {
					TdxCompanyTaxRating tdxCompanyTaxRating = new TdxCompanyTaxRating();
					tdxCompanyTaxRating.setCompanyId(neeqCompanyTaxRatingOnline.getCompanyId());
					tdxCompanyTaxRating.setCompanyName(neeqCompanyTaxRatingOnline.getCompanyName());
					tdxCompanyTaxRating.setIdentifier(neeqCompanyTaxRatingOnline.getIdentifier());
					tdxCompanyTaxRating.setRating(neeqCompanyTaxRatingOnline.getRating());
					tdxCompanyTaxRating.setRatingAgency(neeqCompanyTaxRatingOnline.getRatingAgency());
					tdxCompanyTaxRating.setRatingYear(neeqCompanyTaxRatingOnline.getRatingYear());
					tdxCompanyTaxRating.setType(neeqCompanyTaxRatingOnline.getType());
					tdxCompanyTaxRatingService.saveTdxCompanyTaxRating(tdxCompanyTaxRating);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyTaxRatingOnline neeqCompanyTaxRatingOnline = neeqCompanyTaxRatingOnlines
						.get(neeqCompanyTaxRatingOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyTaxRatingOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyTaxRatingOnline.getUpdatedAt());
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
