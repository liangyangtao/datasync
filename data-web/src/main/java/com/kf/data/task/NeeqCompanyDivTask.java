package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyDivOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyDiv;
import com.kf.data.service.online.NeeqCompanyDivOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyDivService;

/**
 * @Title: NeeqCompanyDivTask.java
 * @Package com.kf.data.task
 * @Description: 分红
 * @author: liangyt
 * @date: 2018年3月14日 下午4:07:32
 * @version V1.0
 */

@Component
@EnableScheduling
public class NeeqCompanyDivTask {

	private static String tableName = "neeq_company_div";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyDivOnlineService neeqCompanyDivOnlineService;

	@Autowired
	TdxCompanyDivService tdxCompanyDivService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyDivOnline> neeqCompanyDivOnlines = neeqCompanyDivOnlineService
				.readNeeqCompanyDivOnlines(tdxUpIndexOnline);
		if (neeqCompanyDivOnlines.size() > 0) {

			for (NeeqCompanyDivOnline neeqCompanyDivOnline : neeqCompanyDivOnlines) {
				try {
					TdxCompanyDiv tdxCompanyDiv = new TdxCompanyDiv();
					tdxCompanyDiv.setCompanyId(neeqCompanyDivOnline.getCompanyId());
					tdxCompanyDiv.setCompanyShortname(neeqCompanyDivOnline.getStockName());
					tdxCompanyDiv.setDivDscrp(neeqCompanyDivOnline.getDivDscrp());
					tdxCompanyDiv.setDivObj(neeqCompanyDivOnline.getDivObj());
					tdxCompanyDiv.setDivPreTax(neeqCompanyDivOnline.getDivPostTax());
					tdxCompanyDiv.setDtDivEx(neeqCompanyDivOnline.getDtDivEx());
					tdxCompanyDiv.setDtPlan(neeqCompanyDivOnline.getDtPlan());
					tdxCompanyDiv.setDtRegist(neeqCompanyDivOnline.getDtRegist());
					tdxCompanyDiv.setProgressName(neeqCompanyDivOnline.getProgressName());
					tdxCompanyDiv.setReportDate(neeqCompanyDivOnline.getDtReport());
					tdxCompanyDiv.setStockCode(neeqCompanyDivOnline.getStockCode());
					tdxCompanyDiv.setTransferRatio(neeqCompanyDivOnline.getTransferRatio());
					tdxCompanyDiv.setBonusRatio(neeqCompanyDivOnline.getBonusRatio());
					// tdxCompanyDiv.setUpdatedAt(updatedAt);
					tdxCompanyDivService.saveTdxCompanyDiv(tdxCompanyDiv);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyDivOnline neeqCompanyDivOnline = neeqCompanyDivOnlines.get(neeqCompanyDivOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyDivOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyDivOnline.getUpdatedAt());
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
