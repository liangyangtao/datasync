package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqBaseClassificationOnline;
import com.kf.data.mybatis.entity.online.NeeqFinanceIndicator2017Online;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxFinanceIndicator2017;
import com.kf.data.service.online.NeeqBaseClassificationOnlineService;
import com.kf.data.service.online.NeeqFinanceIndicator2017OnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxFinanceIndicator2017Service;

/**
 * @Title: NeeqFinanceIndicator2017Task.java
 * @Package com.kf.data.task
 * @Description: 财务2017
 * @author: liangyt
 * @date: 2018年3月23日 下午7:07:10
 * @version V1.0
 */
 @Component
 @EnableScheduling
public class NeeqFinanceIndicator2017Task {

	private static String tableName = "neeq_finance_indicator_2017";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqFinanceIndicator2017OnlineService neeqFinanceIndicator2017OnlineService;

	@Autowired
	NeeqBaseClassificationOnlineService neeqBaseClassificationOnlineService;

	@Autowired
	TdxFinanceIndicator2017Service tdxFinanceIndicator2017Service;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqFinanceIndicator2017Online> neeqFinanceIndicator2017Onlines = neeqFinanceIndicator2017OnlineService
				.readNeeqFinanceIndicator2017Onlines(tdxUpIndexOnline);
		if (neeqFinanceIndicator2017Onlines.size() > 0) {

			for (NeeqFinanceIndicator2017Online neeqFinanceIndicator2017Online : neeqFinanceIndicator2017Onlines) {

				try {
					TdxFinanceIndicator2017 tdxFinanceIndicator2017 = new TdxFinanceIndicator2017();

					String classid = neeqFinanceIndicator2017Online.getFinClassCode();

					List<NeeqBaseClassificationOnline> neeqBaseClassifications = neeqBaseClassificationOnlineService
							.readNeeqBaseClassificationOnlineByClassId(classid);
					if (neeqBaseClassifications.size() > 0) {
						NeeqBaseClassificationOnline neeqBaseClassificationOnline = neeqBaseClassifications.get(0);

						tdxFinanceIndicator2017.setDimensions(neeqBaseClassificationOnline.getDimensions());
						tdxFinanceIndicator2017.setFinClassName(neeqBaseClassificationOnline.getClassification());

						tdxFinanceIndicator2017.setShowOrder(neeqBaseClassificationOnline.getOrder());
					}

					tdxFinanceIndicator2017.setCompanyId(neeqFinanceIndicator2017Online.getCompanyId());
					tdxFinanceIndicator2017.setStockCode(neeqFinanceIndicator2017Online.getStockCode());
					tdxFinanceIndicator2017.setFinData(neeqFinanceIndicator2017Online.getFinData());
					tdxFinanceIndicator2017.setFinDt(neeqFinanceIndicator2017Online.getFinDt());
					tdxFinanceIndicator2017.setShortName(neeqFinanceIndicator2017Online.getShortName());
					tdxFinanceIndicator2017.setFinCurrencyName(neeqFinanceIndicator2017Online.getFinCurrencyCode());
					tdxFinanceIndicator2017Service.saveTdxFinanceIndicator2017(tdxFinanceIndicator2017);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqFinanceIndicator2017Online neeqFinanceIndicator2017Online = neeqFinanceIndicator2017Onlines
						.get(neeqFinanceIndicator2017Onlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqFinanceIndicator2017Online.getId());
				tdxUpIndexOnline.setUptime(neeqFinanceIndicator2017Online.getUpdatedAt());
				tdxUpIndexOnlineService.saveTdxUpIndexOnline(tdxUpIndexOnline);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			try {
				Thread.sleep(7 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}
