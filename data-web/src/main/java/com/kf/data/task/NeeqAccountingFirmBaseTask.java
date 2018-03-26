package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqAccountingFirmBaseOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxAccountingFirmBase;
import com.kf.data.service.online.NeeqAccountingFirmBaseOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxAccountingFirmBaseService;

/**
 * @Title: NeeqAccountingFirmBaseTask.java
 * @Package com.kf.data.task
 * @Description: 会计师事务所
 * @author: liangyt
 * @date: 2018年3月23日 上午11:07:14
 * @version V1.0
 */
 @Component
 @EnableScheduling
public class NeeqAccountingFirmBaseTask {

	private static String tableName = "neeq_accounting_firm_base";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqAccountingFirmBaseOnlineService neeqAccountingFirmBaseOnlineService;

	@Autowired
	TdxAccountingFirmBaseService tdxAccountingFirmBaseService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqAccountingFirmBaseOnline> neeqAccountingFirmBaseOnlines = neeqAccountingFirmBaseOnlineService
				.readNeeqAccountingFirmBaseOnlines(tdxUpIndexOnline);
		if (neeqAccountingFirmBaseOnlines.size() > 0) {
			for (NeeqAccountingFirmBaseOnline neeqAccountingFirmBaseOnline : neeqAccountingFirmBaseOnlines) {
				try {
					TdxAccountingFirmBase tdxAccountingFirmBase = new TdxAccountingFirmBase();
					tdxAccountingFirmBase.setAddress(neeqAccountingFirmBaseOnline.getAddress());
					tdxAccountingFirmBase.setCityName(neeqAccountingFirmBaseOnline.getCityName());
					tdxAccountingFirmBase.setCompanyId(neeqAccountingFirmBaseOnline.getCompanyId());
					tdxAccountingFirmBase.setCompanyName(neeqAccountingFirmBaseOnline.getCityName());
					tdxAccountingFirmBase.setCompanyShortname(neeqAccountingFirmBaseOnline.getCompanyShortname());
					tdxAccountingFirmBase.setPrincipalName(neeqAccountingFirmBaseOnline.getPrincipalName());
					tdxAccountingFirmBase.setRegistrationDate(neeqAccountingFirmBaseOnline.getRegistrationDate());
					tdxAccountingFirmBase.setServiceNumber(neeqAccountingFirmBaseOnline.getServiceNumber());
					tdxAccountingFirmBase.setTel(neeqAccountingFirmBaseOnline.getTel());
					// tdxAccountingFirmBase.setUpdatedAt(updatedAt);
					tdxAccountingFirmBaseService.saveTdxAccountingFirmBase(tdxAccountingFirmBase);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqAccountingFirmBaseOnline neeqAccountingFirmBaseOnline = neeqAccountingFirmBaseOnlines
						.get(neeqAccountingFirmBaseOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqAccountingFirmBaseOnline.getId());
				tdxUpIndexOnline.setUptime(neeqAccountingFirmBaseOnline.getUpdatedAt());
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
