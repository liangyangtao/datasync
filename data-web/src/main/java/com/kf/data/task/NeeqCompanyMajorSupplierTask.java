package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyMajorSupplierOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyMajorSupplier;
import com.kf.data.service.online.NeeqCompanyMajorSupplierOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyMajorSupplierService;

/**
 * @Title: NeeqCompanyMajorSupplierTask.java
 * @Package com.kf.data.task
 * @Description: 主要客户
 * @author: liangyt
 * @date: 2018年3月15日 下午6:56:04
 * @version V1.0
 */
// @Component
// @EnableScheduling
public class NeeqCompanyMajorSupplierTask {

	private static String tableName = "neeq_company_major_supplier";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyMajorSupplierOnlineService neeqCompanyMajorSupplierOnlineService;

	@Autowired
	TdxCompanyMajorSupplierService tdxCompanyMajorSupplierService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyMajorSupplierOnline> neeqCompanyMajorSupplierOnlines = neeqCompanyMajorSupplierOnlineService
				.readNeeqCompanyMajorSupplierOnlines(tdxUpIndexOnline);
		if (neeqCompanyMajorSupplierOnlines.size() > 0) {

			for (NeeqCompanyMajorSupplierOnline neeqCompanyMajorSupplierOnline : neeqCompanyMajorSupplierOnlines) {
				try {
					TdxCompanyMajorSupplier tdxCompanyMajorSupplier = new TdxCompanyMajorSupplier();
					tdxCompanyMajorSupplier.setSupplierName(neeqCompanyMajorSupplierOnline.getSupplierName());
					tdxCompanyMajorSupplier.setCompanyId(neeqCompanyMajorSupplierOnline.getCompanyId());
					tdxCompanyMajorSupplier.setCompanyName(neeqCompanyMajorSupplierOnline.getCompanyName());
					tdxCompanyMajorSupplier.setReportDate(neeqCompanyMajorSupplierOnline.getDate());
					tdxCompanyMajorSupplier.setPurchaseAmount(neeqCompanyMajorSupplierOnline.getPurchaseAmount());
					tdxCompanyMajorSupplier.setPurchaseAmountRatio(neeqCompanyMajorSupplierOnline.getPurchaseAmountRatio());
					tdxCompanyMajorSupplier.setStockCode(neeqCompanyMajorSupplierOnline.getStockCode());
					// tdxCompanyMajorSupplier.setUpdatedAt(updatedAt);
					tdxCompanyMajorSupplierService.saveTdxCompanyMajorSupplier(tdxCompanyMajorSupplier);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyMajorSupplierOnline neeqCompanyMajorSupplierOnline = neeqCompanyMajorSupplierOnlines
						.get(neeqCompanyMajorSupplierOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyMajorSupplierOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyMajorSupplierOnline.getUpdatedAt());
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
