package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqLawFirmBaseOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxLawFirmBase;
import com.kf.data.service.online.NeeqLawFirmBaseOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxLawFirmBaseService;

/**
 * @Title: NeeqLawFirmBaseTask.java
 * @Package com.kf.data.task
 * @Description: 律师事务所
 * @author: liangyt
 * @date: 2018年3月23日 上午10:53:54
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqLawFirmBaseTask {

	private static String tableName = "neeq_law_firm_base";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqLawFirmBaseOnlineService neeqLawFirmBaseOnlineService;

	@Autowired
	TdxLawFirmBaseService tdxLawFirmBaseService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqLawFirmBaseOnline> neeqLawFirmBaseOnlines = neeqLawFirmBaseOnlineService
				.readNeeqLawFirmBaseOnlines(tdxUpIndexOnline);
		if (neeqLawFirmBaseOnlines.size() > 0) {

			for (NeeqLawFirmBaseOnline neeqLawFirmBaseOnline : neeqLawFirmBaseOnlines) {

				try {
					TdxLawFirmBase tdxLawFirmBase = new TdxLawFirmBase();
					tdxLawFirmBase.setAddress(neeqLawFirmBaseOnline.getAddress());
					tdxLawFirmBase.setCityName(neeqLawFirmBaseOnline.getCityName());
					tdxLawFirmBase.setCompanyId(neeqLawFirmBaseOnline.getCompanyId());
					tdxLawFirmBase.setCompanyName(neeqLawFirmBaseOnline.getCompanyName());
					tdxLawFirmBase.setCompanyShortname(neeqLawFirmBaseOnline.getCompanyShortname());
					tdxLawFirmBase.setPrincipalName(neeqLawFirmBaseOnline.getPrincipalName());
					tdxLawFirmBase.setRegistrationDate(neeqLawFirmBaseOnline.getRegistrationDate());
					tdxLawFirmBase.setTel(neeqLawFirmBaseOnline.getTel());
					tdxLawFirmBase.setServiceNumber(neeqLawFirmBaseOnline.getServiceNumber());
					tdxLawFirmBaseService.saveTdxLawFirmBase(tdxLawFirmBase);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqLawFirmBaseOnline neeqLawFirmBaseOnline = neeqLawFirmBaseOnlines
						.get(neeqLawFirmBaseOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqLawFirmBaseOnline.getId());
				tdxUpIndexOnline.setUptime(neeqLawFirmBaseOnline.getUpdatedAt());
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
