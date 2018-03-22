package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyCheckOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyCheck;
import com.kf.data.service.online.NeeqCompanyCheckOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyCheckService;

/**
 * @Title: NeeqCompanyCheckTask.java
 * @Package com.kf.data.task
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午3:27:49
 * @version V1.0
 */
//@Component
//@EnableScheduling
public class NeeqCompanyCheckTask {

	private static String tableName = "neeq_company_check";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyCheckOnlineService neeqCompanyCheckOnlineService;

	@Autowired
	TdxCompanyCheckService tdxCompanyCheckService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyCheckOnline> neeqCompanyCheckOnlines = neeqCompanyCheckOnlineService
				.readNeeqCompanyCheckOnlines(tdxUpIndexOnline);
		if (neeqCompanyCheckOnlines.size() > 0) {
			for (NeeqCompanyCheckOnline neeqCompanyCheckOnline : neeqCompanyCheckOnlines) {
				try {
					TdxCompanyCheck tdxCompanyCheck = new TdxCompanyCheck();
					tdxCompanyCheck.setCheckAgency(neeqCompanyCheckOnline.getCheckAgency());
					tdxCompanyCheck.setCompanyId(neeqCompanyCheckOnline.getCompanyId());
					tdxCompanyCheck.setCompanyName(neeqCompanyCheckOnline.getCompanyName());
					tdxCompanyCheck.setDate(neeqCompanyCheckOnline.getDate());
					tdxCompanyCheck.setResult(neeqCompanyCheckOnline.getResult());
					tdxCompanyCheck.setType(neeqCompanyCheckOnline.getType());
					tdxCompanyCheckService.saveTdxCompanyCheck(tdxCompanyCheck);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyCheckOnline neeqCompanyCheckOnline = neeqCompanyCheckOnlines
						.get(neeqCompanyCheckOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyCheckOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyCheckOnline.getUpdatedAt());
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
