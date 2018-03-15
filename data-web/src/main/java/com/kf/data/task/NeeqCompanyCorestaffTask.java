package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyCorestaffOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyCorestaff;
import com.kf.data.service.online.NeeqCompanyCorestaffOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyCorestaffService;

/**
 * @Title: NeeqCompanyCorestaffTask.java
 * @Package com.kf.data.task
 * @Description: 核心员工
 * @author: liangyt
 * @date: 2018年3月14日 下午4:07:32
 * @version V1.0
 */

//@Component
//@EnableScheduling
public class NeeqCompanyCorestaffTask {

	private static String tableName = "neeq_company_corestaff";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyCorestaffOnlineService neeqCompanyCorestaffOnlineService;

	@Autowired
	TdxCompanyCorestaffService tdxCompanyCorestaffService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyCorestaffOnline> neeqCompanyCorestaffOnlines = neeqCompanyCorestaffOnlineService
				.readNeeqCompanyCorestaffOnlines(tdxUpIndexOnline);
		if (neeqCompanyCorestaffOnlines.size() > 0) {

			for (NeeqCompanyCorestaffOnline neeqCompanyCorestaffOnline : neeqCompanyCorestaffOnlines) {
				try {
					TdxCompanyCorestaff tdxCompanyCorestaff = new TdxCompanyCorestaff();
					tdxCompanyCorestaff.setCompanyId(neeqCompanyCorestaffOnline.getCompanyId());
					tdxCompanyCorestaff.setCompanyShortname(neeqCompanyCorestaffOnline.getCompanyShortname());
					tdxCompanyCorestaff.setEducation(neeqCompanyCorestaffOnline.getEducation());
					tdxCompanyCorestaff.setGender(neeqCompanyCorestaffOnline.getGender());
					tdxCompanyCorestaff.setIntroduction(neeqCompanyCorestaffOnline.getIntroduction());
					tdxCompanyCorestaff.setName(neeqCompanyCorestaffOnline.getName());
					tdxCompanyCorestaff.setNationality(neeqCompanyCorestaffOnline.getNationality());
					tdxCompanyCorestaff.setReportDate(neeqCompanyCorestaffOnline.getReportDate());
					tdxCompanyCorestaff.setStockCode(neeqCompanyCorestaffOnline.getStockCode());
					tdxCompanyCorestaff.setTerm(neeqCompanyCorestaffOnline.getTerm());
					tdxCompanyCorestaff.setTitle(neeqCompanyCorestaffOnline.getTitle());
					// tdxCompanyCorestaff.setUpdatedAt(updatedAt);
					tdxCompanyCorestaff.setYear(neeqCompanyCorestaffOnline.getYear());
					tdxCompanyCorestaffService.saveTdxCompanyCorestaff(tdxCompanyCorestaff);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyCorestaffOnline neeqCompanyCorestaffOnline = neeqCompanyCorestaffOnlines
						.get(neeqCompanyCorestaffOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyCorestaffOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyCorestaffOnline.getUpdatedAt());
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
