package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyCaseOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyCase;
import com.kf.data.service.online.NeeqCompanyCaseOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyCaseService;

/**
 * @Title: NeeqCompanyCaseOnlineTask.java
 * @Package com.kf.data.task
 * @Description: 法院公告
 * @author: liangyt
 * @date: 2018年3月16日 下午4:46:45
 * @version V1.0
 */
//@Component
//@EnableScheduling
public class NeeqCompanyCaseOnlineTask {

	private static String tableName = "neeq_company_case";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyCaseOnlineService neeqCompanyCaseOnlineService;

	@Autowired
	TdxCompanyCaseService tdxCompanyCaseService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyCaseOnline> neeqCompanyCaseOnlines = neeqCompanyCaseOnlineService
				.readNeeqCompanyCaseOnlines(tdxUpIndexOnline);
		if (neeqCompanyCaseOnlines.size() > 0) {
			for (NeeqCompanyCaseOnline neeqCompanyCaseOnline : neeqCompanyCaseOnlines) {
				try {
					TdxCompanyCase tdxCompanyCase = new TdxCompanyCase();
					tdxCompanyCase.setCaseNumber(neeqCompanyCaseOnline.getCaseNumber());
					tdxCompanyCase.setCaseTitle(neeqCompanyCaseOnline.getCaseTitle());
					tdxCompanyCase.setCaseType(neeqCompanyCaseOnline.getCaseType());
					tdxCompanyCase.setCompanyId(neeqCompanyCaseOnline.getCompanyId());
					tdxCompanyCase.setCompanyName(neeqCompanyCaseOnline.getCompanyName());
					tdxCompanyCase.setCourtName(neeqCompanyCaseOnline.getCourtName());
					tdxCompanyCase.setJudicialDate(neeqCompanyCaseOnline.getJudicialDate());
					tdxCompanyCase.setJudicialText(neeqCompanyCaseOnline.getJudicialText());
					tdxCompanyCaseService.saveTdxCompanyCase(tdxCompanyCase);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyCaseOnline neeqCompanyCaseOnline = neeqCompanyCaseOnlines
						.get(neeqCompanyCaseOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyCaseOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyCaseOnline.getUpdatedAt());
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
