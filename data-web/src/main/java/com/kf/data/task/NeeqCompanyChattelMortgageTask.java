package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyChattelMortgageOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyChattelMortgage;
import com.kf.data.service.online.NeeqCompanyChattelMortgageOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyChattelMortgageService;

/**
 * @Title: NeeqCompanyChattelMortgageTask.java
 * @Package com.kf.data.task
 * @Description: 动产抵押
 * @author: liangyt
 * @date: 2018年3月16日 下午5:45:22
 * @version V1.0
 */
//@Component
//@EnableScheduling
public class NeeqCompanyChattelMortgageTask {

	private static String tableName = "neeq_company_chattel_mortgage";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyChattelMortgageOnlineService neeqCompanyChattelMortgageOnlineService;

	@Autowired
	TdxCompanyChattelMortgageService tdxCompanyChattelMortgageService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyChattelMortgageOnline> neeqCompanyChattelMortgageOnlines = neeqCompanyChattelMortgageOnlineService
				.readNeeqCompanyChattelMortgageOnlines(tdxUpIndexOnline);
		if (neeqCompanyChattelMortgageOnlines.size() > 0) {
			for (NeeqCompanyChattelMortgageOnline neeqCompanyChattelMortgageOnline : neeqCompanyChattelMortgageOnlines) {
				try {
					TdxCompanyChattelMortgage tdxCompanyChattelMortgage = new TdxCompanyChattelMortgage();
					tdxCompanyChattelMortgage.setCaseStatus(neeqCompanyChattelMortgageOnline.getCaseStatus());
					tdxCompanyChattelMortgage.setCompanyId(neeqCompanyChattelMortgageOnline.getCompanyId());
					tdxCompanyChattelMortgage.setCompanyName(neeqCompanyChattelMortgageOnline.getCompanyName());
					tdxCompanyChattelMortgage
							.setCreditGuaranteedAmt(neeqCompanyChattelMortgageOnline.getCreditGuaranteedAmt());
					tdxCompanyChattelMortgage
							.setCreditGuaranteedType(neeqCompanyChattelMortgageOnline.getCreditGuaranteedType());
					tdxCompanyChattelMortgage.setDebtTerm(neeqCompanyChattelMortgageOnline.getDebtTerm());
					tdxCompanyChattelMortgage.setDtRegister(neeqCompanyChattelMortgageOnline.getDtRegister());
					tdxCompanyChattelMortgage.setMortgagee(neeqCompanyChattelMortgageOnline.getMortgagee());
					tdxCompanyChattelMortgage.setPledgeName(neeqCompanyChattelMortgageOnline.getPledgeName());
					tdxCompanyChattelMortgage.setRegisterAgency(neeqCompanyChattelMortgageOnline.getRegisterAgency());
					tdxCompanyChattelMortgage.setRegisterNumber(neeqCompanyChattelMortgageOnline.getRegisterNumber());
					// tdxCompanyChattelMortgage.setUpdatedAt(updatedAt);
					tdxCompanyChattelMortgageService.saveTdxCompanyChattelMortgage(tdxCompanyChattelMortgage);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyChattelMortgageOnline neeqCompanyChattelMortgageOnline = neeqCompanyChattelMortgageOnlines
						.get(neeqCompanyChattelMortgageOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyChattelMortgageOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyChattelMortgageOnline.getUpdatedAt());
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
