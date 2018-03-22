package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyRecruitmentOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyRecruitment;
import com.kf.data.service.online.NeeqCompanyRecruitmentOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyRecruitmentService;

/**
 * @Title: NeeqCompanyRecruitmentTask.java
 * @Package com.kf.data.task
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午1:59:13
 * @version V1.0
 */
//@Component
//@EnableScheduling
public class NeeqCompanyRecruitmentTask {

	private static String tableName = "neeq_company_recruitment";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyRecruitmentOnlineService neeqCompanyRecruitmentOnlineService;

	@Autowired
	TdxCompanyRecruitmentService TdxCompanyRecruitmentService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyRecruitmentOnline> neeqCompanyRecruitmentOnlines = neeqCompanyRecruitmentOnlineService
				.readNeeqCompanyRecruitmentOnlines(tdxUpIndexOnline);
		if (neeqCompanyRecruitmentOnlines.size() > 0) {

			for (NeeqCompanyRecruitmentOnline neeqCompanyRecruitmentOnline : neeqCompanyRecruitmentOnlines) {
				try {
					TdxCompanyRecruitment tdxCompanyRecruitment = new TdxCompanyRecruitment();
					tdxCompanyRecruitment.setCompanyId(neeqCompanyRecruitmentOnline.getCompanyId());
					tdxCompanyRecruitment.setCompanyName(neeqCompanyRecruitmentOnline.getCompanyName());
					tdxCompanyRecruitment.setJobCity(neeqCompanyRecruitmentOnline.getJobCity());
					tdxCompanyRecruitment.setJobDescription(neeqCompanyRecruitmentOnline.getJobDescription());
					tdxCompanyRecruitment.setJobTitle(neeqCompanyRecruitmentOnline.getJobTitle());
					tdxCompanyRecruitment.setReleaseDate(neeqCompanyRecruitmentOnline.getReleaseDate());
					// tdxCompanyRecruitment.set
					TdxCompanyRecruitmentService.saveTdxCompanyRecruitment(tdxCompanyRecruitment);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyRecruitmentOnline neeqCompanyRecruitmentOnline = neeqCompanyRecruitmentOnlines
						.get(neeqCompanyRecruitmentOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyRecruitmentOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyRecruitmentOnline.getUpdatedAt());
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
