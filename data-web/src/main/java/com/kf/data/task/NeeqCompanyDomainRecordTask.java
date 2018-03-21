package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyDomainRecordOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyDomainRecord;
import com.kf.data.service.online.NeeqCompanyDomainRecordOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyDomainRecordService;

/**
 * @Title: NeeqCompanyDomainRecordTask.java
 * @Package com.kf.data.task
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午5:02:55
 * @version V1.0
 */
//@Component
//@EnableScheduling
public class NeeqCompanyDomainRecordTask {

	private static String tableName = "neeq_company_domain_record";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyDomainRecordOnlineService neeqCompanyDomainRecordOnlineService;

	@Autowired
	TdxCompanyDomainRecordService tdxCompanyDomainRecordService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyDomainRecordOnline> neeqCompanyDomainRecordOnlines = neeqCompanyDomainRecordOnlineService
				.readNeeqCompanyDomainRecordOnlines(tdxUpIndexOnline);
		if (neeqCompanyDomainRecordOnlines.size() > 0) {

			for (NeeqCompanyDomainRecordOnline neeqCompanyDomainRecordOnline : neeqCompanyDomainRecordOnlines) {
				try {
					TdxCompanyDomainRecord tdxCompanyDomainRecord = new TdxCompanyDomainRecord();
					tdxCompanyDomainRecord.setCompanyId(neeqCompanyDomainRecordOnline.getCompanyId());
					tdxCompanyDomainRecord.setCompanyName(neeqCompanyDomainRecordOnline.getCompanyName());
					tdxCompanyDomainRecord.setDomain(neeqCompanyDomainRecordOnline.getDomain());
					tdxCompanyDomainRecord.setHomeUrl(neeqCompanyDomainRecordOnline.getHomeUrl());
					tdxCompanyDomainRecord.setHostName(neeqCompanyDomainRecordOnline.getHostName());
					tdxCompanyDomainRecord.setHostType(neeqCompanyDomainRecordOnline.getHostType());
					tdxCompanyDomainRecord.setRecordNumber(neeqCompanyDomainRecordOnline.getRecordNumber());
					tdxCompanyDomainRecord.setReleaseDate(neeqCompanyDomainRecordOnline.getReleaseDate());
					tdxCompanyDomainRecordService.saveTdxCompanyDomainRecord(tdxCompanyDomainRecord);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyDomainRecordOnline neeqCompanyDomainRecordOnline = neeqCompanyDomainRecordOnlines
						.get(neeqCompanyDomainRecordOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyDomainRecordOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyDomainRecordOnline.getUpdatedAt());
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
