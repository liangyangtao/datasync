package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqBaseClassificationOnline;
import com.kf.data.mybatis.entity.online.NeeqFinanceIndicator2016Online;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxFinanceIndicator2016;
import com.kf.data.service.online.NeeqBaseClassificationOnlineService;
import com.kf.data.service.online.NeeqFinanceIndicator2016OnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxFinanceIndicator2016Service;

/**
 * @Title: NeeqFinanceIndicator2016Task.java
 * @Package com.kf.data.task
 * @Description: 财务2016
 * @author: liangyt
 * @date: 2018年3月23日 下午6:06:10
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqFinanceIndicator2016Task {

	private static String tableName = "neeq_finance_indicator_2016";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqFinanceIndicator2016OnlineService neeqFinanceIndicator2016OnlineService;

	@Autowired
	NeeqBaseClassificationOnlineService neeqBaseClassificationOnlineService;

	@Autowired
	TdxFinanceIndicator2016Service tdxFinanceIndicator2016Service;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqFinanceIndicator2016Online> neeqFinanceIndicator2016Onlines = neeqFinanceIndicator2016OnlineService
				.readNeeqFinanceIndicator2016Onlines(tdxUpIndexOnline);
		if (neeqFinanceIndicator2016Onlines.size() > 0) {

			for (NeeqFinanceIndicator2016Online neeqFinanceIndicator2016Online : neeqFinanceIndicator2016Onlines) {

				try {
					TdxFinanceIndicator2016 tdxFinanceIndicator2016 = new TdxFinanceIndicator2016();

					String classid = neeqFinanceIndicator2016Online.getFinClassCode();

					List<NeeqBaseClassificationOnline> neeqBaseClassifications = neeqBaseClassificationOnlineService
							.readNeeqBaseClassificationOnlineByClassId(classid);
					if (neeqBaseClassifications.size() > 0) {
						NeeqBaseClassificationOnline neeqBaseClassificationOnline = neeqBaseClassifications.get(0);

						tdxFinanceIndicator2016.setDimensions(neeqBaseClassificationOnline.getDimensions());
						tdxFinanceIndicator2016.setFinClassName(neeqBaseClassificationOnline.getClassification());

						tdxFinanceIndicator2016.setShowOrder(neeqBaseClassificationOnline.getOrder());
					}

					tdxFinanceIndicator2016.setCompanyId(neeqFinanceIndicator2016Online.getCompanyId());
					tdxFinanceIndicator2016.setStockCode(neeqFinanceIndicator2016Online.getStockCode());
					tdxFinanceIndicator2016.setFinData(neeqFinanceIndicator2016Online.getFinData());
					tdxFinanceIndicator2016.setFinDt(neeqFinanceIndicator2016Online.getFinDt());
					tdxFinanceIndicator2016.setShortName(neeqFinanceIndicator2016Online.getShortName());
					tdxFinanceIndicator2016.setFinCurrencyName(neeqFinanceIndicator2016Online.getFinCurrencyCode());
					tdxFinanceIndicator2016Service.saveTdxFinanceIndicator2016(tdxFinanceIndicator2016);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqFinanceIndicator2016Online neeqFinanceIndicator2016Online = neeqFinanceIndicator2016Onlines
						.get(neeqFinanceIndicator2016Onlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqFinanceIndicator2016Online.getId());
				tdxUpIndexOnline.setUptime(neeqFinanceIndicator2016Online.getUpdatedAt());
				tdxUpIndexOnlineService.saveTdxUpIndexOnline(tdxUpIndexOnline);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			try {
				Thread.sleep(6 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}
