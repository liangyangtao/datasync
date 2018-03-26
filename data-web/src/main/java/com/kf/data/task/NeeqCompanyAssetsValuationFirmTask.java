package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyAssetsValuationFirmOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyAssetsValuationFirm;
import com.kf.data.service.online.NeeqCompanyAssetsValuationFirmOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyAssetsValuationFirmService;

/**
 * @Title: NeeqCompanyAssetsValuationFirmTask.java
 * @Package com.kf.data.task
 * @Description: 资产评估
 * @author: liangyt
 * @date: 2018年3月22日 下午6:00:05
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqCompanyAssetsValuationFirmTask {

	private static String tableName = "neeq_company_assets_valuation_firm";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyAssetsValuationFirmOnlineService neeqCompanyAssetsValuationFirmOnlineService;

	@Autowired
	TdxCompanyAssetsValuationFirmService tdxCompanyAssetsValuationFirmService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyAssetsValuationFirmOnline> neeqCompanyAssetsValuationFirmOnlines = neeqCompanyAssetsValuationFirmOnlineService
				.readNeeqCompanyAssetsValuationFirmOnlines(tdxUpIndexOnline);
		if (neeqCompanyAssetsValuationFirmOnlines.size() > 0) {
			for (NeeqCompanyAssetsValuationFirmOnline neeqCompanyAssetsValuationFirmOnline : neeqCompanyAssetsValuationFirmOnlines) {
				try {
					TdxCompanyAssetsValuationFirm tdxCompanyAssetsValuationFirm = new TdxCompanyAssetsValuationFirm();
					tdxCompanyAssetsValuationFirm
							.setAssetsValuationFirmId(neeqCompanyAssetsValuationFirmOnline.getAssetsValuationFirmId());
					tdxCompanyAssetsValuationFirm.setAssetsValuationFirmName(
							neeqCompanyAssetsValuationFirmOnline.getAssetsValuationFirmName());
					tdxCompanyAssetsValuationFirm.setCompanyId(neeqCompanyAssetsValuationFirmOnline.getCompanyId());
					tdxCompanyAssetsValuationFirm.setCompanyName(neeqCompanyAssetsValuationFirmOnline.getCompanyName());
					// TdxCompanyAssetsValuationFirm.setUpdatedAt(updatedAt);
					tdxCompanyAssetsValuationFirmService
							.saveTdxCompanyAssetsValuationFirm(tdxCompanyAssetsValuationFirm);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyAssetsValuationFirmOnline neeqCompanyAssetsValuationFirmOnline = neeqCompanyAssetsValuationFirmOnlines
						.get(neeqCompanyAssetsValuationFirmOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyAssetsValuationFirmOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyAssetsValuationFirmOnline.getUpdatedAt());
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
