package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqNoticeFranchiseOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxNoticeFranchise;
import com.kf.data.service.online.NeeqNoticeFranchiseOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxNoticeFranchiseService;

/**
 * @Title: NeeqNoticeFranchiseService.java
 * @Package com.kf.data.task
 * @Description:特许经营权
 * @author: liangyt
 * @date: 2018年3月21日 下午5:35:40
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqNoticeFranchiseTask {

	private static String tableName = "neeq_notice_franchise";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqNoticeFranchiseOnlineService neeqNoticeFranchiseOnlineService;

	@Autowired
	TdxNoticeFranchiseService tdxNoticeFranchiseService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqNoticeFranchiseOnline> neeqNoticeFranchiseOnlines = neeqNoticeFranchiseOnlineService
				.readNeeqNoticeFranchiseOnlines(tdxUpIndexOnline);
		if (neeqNoticeFranchiseOnlines.size() > 0) {
			for (NeeqNoticeFranchiseOnline neeqNoticeFranchiseOnline : neeqNoticeFranchiseOnlines) {
				try {
					TdxNoticeFranchise tdxNoticeFranchise = new TdxNoticeFranchise();
					tdxNoticeFranchise.setAgencyName(neeqNoticeFranchiseOnline.getAgencyName());
					tdxNoticeFranchise.setAuthorRangeBusi(neeqNoticeFranchiseOnline.getAuthorRangeBusi());
					tdxNoticeFranchise.setAuthorRangeGeog(neeqNoticeFranchiseOnline.getAuthorRangeGeog());
					tdxNoticeFranchise.setCompanyId(neeqNoticeFranchiseOnline.getCompanyId());
					tdxNoticeFranchise.setCompanyName(neeqNoticeFranchiseOnline.getCompanyName());
					tdxNoticeFranchise.setDtEffect(neeqNoticeFranchiseOnline.getDtEffect());
					tdxNoticeFranchise.setDtExp(neeqNoticeFranchiseOnline.getDtExp());
					tdxNoticeFranchise.setStockCode(neeqNoticeFranchiseOnline.getStockCode());
					tdxNoticeFranchise.setSupTerms(neeqNoticeFranchiseOnline.getSupTerms());
					tdxNoticeFranchiseService.saveTdxNoticeFranchise(tdxNoticeFranchise);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqNoticeFranchiseOnline neeqNoticeFranchiseOnline = neeqNoticeFranchiseOnlines
						.get(neeqNoticeFranchiseOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqNoticeFranchiseOnline.getId());
				tdxUpIndexOnline.setUptime(neeqNoticeFranchiseOnline.getUpdatedAt());
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
