package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanySoftwareCopyrightOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanySoftwareCopyright;
import com.kf.data.service.online.NeeqCompanySoftwareCopyrightOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanySoftwareCopyrightService;

/**
 * @Title: NeeqCompanySoftwareCopyright.java
 * @Package com.kf.data.task
 * @Description: 软件著作权
 * @author: liangyt
 * @date: 2018年3月21日 下午4:24:15
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqCompanySoftwareCopyrightTask {

	private static String tableName = "neeq_company_software_copyright";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanySoftwareCopyrightOnlineService neeqCompanySoftwareCopyrightOnlineService;

	@Autowired
	TdxCompanySoftwareCopyrightService tdxCompanySoftwareCopyrightService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanySoftwareCopyrightOnline> neeqCompanySoftwareCopyrightOnlines = neeqCompanySoftwareCopyrightOnlineService
				.readNeeqCompanySoftwareCopyrightOnlines(tdxUpIndexOnline);
		if (neeqCompanySoftwareCopyrightOnlines.size() > 0) {
			for (NeeqCompanySoftwareCopyrightOnline neeqCompanySoftwareCopyrightOnline : neeqCompanySoftwareCopyrightOnlines) {
				try {
					TdxCompanySoftwareCopyright tdxCompanySoftwareCopyright = new TdxCompanySoftwareCopyright();
					tdxCompanySoftwareCopyright
							.setClassificationNumber(neeqCompanySoftwareCopyrightOnline.getClassificationNumber());
					tdxCompanySoftwareCopyright.setCompanyId(neeqCompanySoftwareCopyrightOnline.getCompanyId());
					tdxCompanySoftwareCopyright.setRegisterTime(neeqCompanySoftwareCopyrightOnline.getRegisterTime());
					tdxCompanySoftwareCopyright
							.setRegistrationNumber(neeqCompanySoftwareCopyrightOnline.getRegistrationNumber());
					tdxCompanySoftwareCopyright.setSday(neeqCompanySoftwareCopyrightOnline.getSday());
					tdxCompanySoftwareCopyright
							.setSoftwareFullName(neeqCompanySoftwareCopyrightOnline.getSoftwareFullName());
					tdxCompanySoftwareCopyright.setVersionNumber(neeqCompanySoftwareCopyrightOnline.getVersionNumber());
					tdxCompanySoftwareCopyrightService.saveTdxCompanySoftwareCopyright(tdxCompanySoftwareCopyright);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanySoftwareCopyrightOnline neeqCompanySoftwareCopyrightOnline = neeqCompanySoftwareCopyrightOnlines
						.get(neeqCompanySoftwareCopyrightOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanySoftwareCopyrightOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanySoftwareCopyrightOnline.getUpdatedAt());
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
