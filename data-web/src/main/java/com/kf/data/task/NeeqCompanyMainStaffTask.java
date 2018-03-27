package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyMainStaffOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyMainStaff;
import com.kf.data.service.online.NeeqCompanyMainStaffOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyMainStaffService;

/**
 * @Title: NeeqCompanyMainStaffTask.java
 * @Package com.kf.data.task
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午2:34:57
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqCompanyMainStaffTask {

	private static String tableName = "neeq_company_main_staff";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyMainStaffOnlineService neeqCompanyMainStaffOnlineService;

	@Autowired
	TdxCompanyMainStaffService tdxCompanyMainStaffService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyMainStaffOnline> neeqCompanyMainStaffOnlines = neeqCompanyMainStaffOnlineService
				.readNeeqCompanyMainStaffOnlines(tdxUpIndexOnline);
		if (neeqCompanyMainStaffOnlines.size() > 0) {

			for (NeeqCompanyMainStaffOnline neeqCompanyMainStaffOnline : neeqCompanyMainStaffOnlines) {
				try {
					TdxCompanyMainStaff tdxCompanyMainStaff = new TdxCompanyMainStaff();
					tdxCompanyMainStaff.setCompanyId(neeqCompanyMainStaffOnline.getCompanyId());
					tdxCompanyMainStaff.setCompanyName(neeqCompanyMainStaffOnline.getCompanyName());
					tdxCompanyMainStaff.setIntroduction(neeqCompanyMainStaffOnline.getIntroduction());
					tdxCompanyMainStaff.setName(neeqCompanyMainStaffOnline.getName());
					tdxCompanyMainStaff.setTitle(neeqCompanyMainStaffOnline.getTitle());
					tdxCompanyMainStaffService.saveTdxCompanyMainStaff(tdxCompanyMainStaff);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyMainStaffOnline neeqCompanyMainStaffOnline = neeqCompanyMainStaffOnlines
						.get(neeqCompanyMainStaffOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyMainStaffOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyMainStaffOnline.getUpdatedAt());
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
