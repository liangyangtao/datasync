package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyExecutiveOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyExecutiveResumeOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyExecutive;
import com.kf.data.mybatis.entity.tdx.TdxCompanyExecutiveResume;
import com.kf.data.service.online.NeeqCompanyExecutiveOnlineService;
import com.kf.data.service.online.NeeqCompanyExecutiveResumeOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyExecutiveResumeService;
import com.kf.data.service.tdx.TdxCompanyExecutiveService;

/**
 * @Title: NeeqCompanyExecutiveTask.java
 * @Package com.kf.data.task
 * @Description: 高管数据同步
 * @author: liangyt
 * @date: 2018年3月14日 下午4:07:32
 * @version V1.0
 */

//@Component
//@EnableScheduling
public class NeeqCompanyExecutiveTask {

	private static String tableName = "neeq_company_executive";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyExecutiveOnlineService neeqCompanyExecutiveOnlineService;

	@Autowired
	NeeqCompanyExecutiveResumeOnlineService neeqCompanyExecutiveResumeOnlineService;

	@Autowired
	TdxCompanyExecutiveService tdxCompanyExecutiveService;

	@Autowired
	TdxCompanyExecutiveResumeService tdxCompanyExecutiveResumeService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyExecutiveOnline> neeqCompanyExecutiveOnlines = neeqCompanyExecutiveOnlineService
				.readNeeqCompanyExecutiveOnlines(tdxUpIndexOnline);
		if (neeqCompanyExecutiveOnlines.size() > 0) {

			for (NeeqCompanyExecutiveOnline neeqCompanyExecutiveOnline : neeqCompanyExecutiveOnlines) {
				try {
					// 先保存高管基本信息
					TdxCompanyExecutive tdxCompanyExecutive = new TdxCompanyExecutive();
					tdxCompanyExecutive.setAge(neeqCompanyExecutiveOnline.getAge());
					tdxCompanyExecutive.setCompanyId(neeqCompanyExecutiveOnline.getCompanyId());
					tdxCompanyExecutive.setCompanyShortname(neeqCompanyExecutiveOnline.getCompanyName());
					tdxCompanyExecutive.setEducation(neeqCompanyExecutiveOnline.getEducation());
					tdxCompanyExecutive.setGender(neeqCompanyExecutiveOnline.getGender());
					tdxCompanyExecutive.setName(neeqCompanyExecutiveOnline.getName());
					tdxCompanyExecutive.setNationality(neeqCompanyExecutiveOnline.getNationality());
					tdxCompanyExecutive.setReportDate(neeqCompanyExecutiveOnline.getReportDate());
					tdxCompanyExecutive.setStockCode(neeqCompanyExecutiveOnline.getStockCode());
					tdxCompanyExecutive.setTerm(neeqCompanyExecutiveOnline.getTerm());
					tdxCompanyExecutive.setTitle(neeqCompanyExecutiveOnline.getTitle());
					// tdxCompanyExecutive.setUpdatedAt(updatedAt);
					tdxCompanyExecutiveService.saveTdxCompanyExecutive(tdxCompanyExecutive);
					// 保存高管履历
					List<NeeqCompanyExecutiveResumeOnline> neeqCompanyExecutiveResumeOnlines = neeqCompanyExecutiveResumeOnlineService
							.readNeeqCompanyExecutiveResumeOnlineById(neeqCompanyExecutiveOnline.getPersonId());
					if (neeqCompanyExecutiveResumeOnlines.size() > 0) {
						TdxCompanyExecutiveResume tdxCompanyExecutiveResume = new TdxCompanyExecutiveResume();
						// tdxCompanyExecutiveResume.setId(id);
						tdxCompanyExecutiveResume.setPersonId(tdxCompanyExecutive.getId());
						tdxCompanyExecutiveResume
								.setPersonPost(neeqCompanyExecutiveResumeOnlines.get(0).getPersonPost());
						tdxCompanyExecutiveResumeService.saveTdxCompanyExecutiveResume(tdxCompanyExecutiveResume);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyExecutiveOnline neeqCompanyExecutiveOnline = neeqCompanyExecutiveOnlines
						.get(neeqCompanyExecutiveOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyExecutiveOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyExecutiveOnline.getUpdatedAt());
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
