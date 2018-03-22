package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyAdmPenaltyOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyAdmPenalty;
import com.kf.data.service.online.NeeqCompanyAdmPenaltyOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyAdmPenaltyService;

/**
 * @Title: NeeqCompanyAdmPenaltyTask.java
 * @Package com.kf.data.task
 * @Description:行政处罚
 * @author: liangyt
 * @date: 2018年3月16日 下午5:27:08
 * @version V1.0
 */
//@Component
//@EnableScheduling
public class NeeqCompanyAdmPenaltyTask {

	private static String tableName = "neeq_company_adm_penalty";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyAdmPenaltyOnlineService neeqCompanyAdmPenaltyOnlineService;

	@Autowired
	TdxCompanyAdmPenaltyService tdxCompanyAdmPenaltyService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyAdmPenaltyOnline> neeqCompanyAdmPenaltyOnlines = neeqCompanyAdmPenaltyOnlineService
				.readNeeqCompanyAdmPenaltyOnlines(tdxUpIndexOnline);
		if (neeqCompanyAdmPenaltyOnlines.size() > 0) {
			for (NeeqCompanyAdmPenaltyOnline neeqCompanyAdmPenaltyOnline : neeqCompanyAdmPenaltyOnlines) {
				try {
					TdxCompanyAdmPenalty tdxCompanyAdmPenalty = new TdxCompanyAdmPenalty();
					tdxCompanyAdmPenalty.setAgency(neeqCompanyAdmPenaltyOnline.getAgency());
					tdxCompanyAdmPenalty.setCompanyId(neeqCompanyAdmPenaltyOnline.getCompanyId());
					tdxCompanyAdmPenalty.setCompanyName(neeqCompanyAdmPenaltyOnline.getCompanyName());
					tdxCompanyAdmPenalty.setDtEffective(neeqCompanyAdmPenaltyOnline.getDtEffective());
					tdxCompanyAdmPenalty.setNoticeUrl(neeqCompanyAdmPenaltyOnline.getNoticeUrl());
					tdxCompanyAdmPenalty.setOrderNumber(neeqCompanyAdmPenaltyOnline.getOrderNumber());
					tdxCompanyAdmPenalty.setPenaltyContent(neeqCompanyAdmPenaltyOnline.getPenaltyContent());
					// tdxCompanyAdmPenalty.setUpdatedAt(updatedAt);
					tdxCompanyAdmPenaltyService.saveTdxCompanyAdmPenalty(tdxCompanyAdmPenalty);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyAdmPenaltyOnline neeqCompanyAdmPenaltyOnline = neeqCompanyAdmPenaltyOnlines
						.get(neeqCompanyAdmPenaltyOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyAdmPenaltyOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyAdmPenaltyOnline.getUpdatedAt());
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
