package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyTaxArrearsOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyTaxArrears;
import com.kf.data.service.online.NeeqCompanyTaxArrearsOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyTaxArrearsService;

/**
 * @Title: NeeqCompanyTaxArrearsTask.java
 * @Package com.kf.data.task
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 上午11:32:26
 * @version V1.0
 */
//@Component
//@EnableScheduling
public class NeeqCompanyTaxArrearsTask {

	private static String tableName = "neeq_company_tax_arrears";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyTaxArrearsOnlineService neeqCompanyTaxArrearsOnlineService;

	@Autowired
	TdxCompanyTaxArrearsService tdxCompanyTaxArrearsService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyTaxArrearsOnline> neeqCompanyTaxArrearsOnlines = neeqCompanyTaxArrearsOnlineService
				.readNeeqCompanyTaxArrearsOnlines(tdxUpIndexOnline);
		if (neeqCompanyTaxArrearsOnlines.size() > 0) {

			for (NeeqCompanyTaxArrearsOnline neeqCompanyTaxArrearsOnline : neeqCompanyTaxArrearsOnlines) {
				try {
					TdxCompanyTaxArrears tdxCompanyTaxArrears = new TdxCompanyTaxArrears();
					tdxCompanyTaxArrears.setAddress(neeqCompanyTaxArrearsOnline.getAddress());
					tdxCompanyTaxArrears.setCompanyProperty(neeqCompanyTaxArrearsOnline.getCompanyProperty());
					tdxCompanyTaxArrears.setDtEffective(neeqCompanyTaxArrearsOnline.getDtEffective());
					tdxCompanyTaxArrears.setLegalPerson(neeqCompanyTaxArrearsOnline.getLegalPerson());
					tdxCompanyTaxArrears.setLegalPersonIdNumber(neeqCompanyTaxArrearsOnline.getLegalPersonIdNumber());
					tdxCompanyTaxArrears.setTaxArrearsAmount(neeqCompanyTaxArrearsOnline.getTaxArrearsAmount());
					tdxCompanyTaxArrears.setTaxAuthority(neeqCompanyTaxArrearsOnline.getTaxAuthority());
					tdxCompanyTaxArrears.setTaxCategory(neeqCompanyTaxArrearsOnline.getTaxCategory());
					tdxCompanyTaxArrears.setTaxpayerId(neeqCompanyTaxArrearsOnline.getTaxpayerId());
					tdxCompanyTaxArrears.setTaxpayerIdentifier(neeqCompanyTaxArrearsOnline.getTaxpayerIdentifier());
					tdxCompanyTaxArrears.setTaxpayerName(neeqCompanyTaxArrearsOnline.getTaxpayerName());
					tdxCompanyTaxArrears.setType(neeqCompanyTaxArrearsOnline.getType());
					tdxCompanyTaxArrearsService.saveTdxCompanyTaxArrears(tdxCompanyTaxArrears);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyTaxArrearsOnline neeqCompanyTaxArrearsOnline = neeqCompanyTaxArrearsOnlines
						.get(neeqCompanyTaxArrearsOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyTaxArrearsOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyTaxArrearsOnline.getUpdatedAt());
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
