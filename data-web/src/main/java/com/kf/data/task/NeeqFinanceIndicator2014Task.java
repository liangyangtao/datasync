package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqBaseClassificationOnline;
import com.kf.data.mybatis.entity.online.NeeqFinanceIndicator2014Online;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxFinanceIndicator2014;
import com.kf.data.service.online.NeeqBaseClassificationOnlineService;
import com.kf.data.service.online.NeeqFinanceIndicator2014OnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxFinanceIndicator2014Service;

/**
 * @Title: NeeqFinanceIndicator2014Task.java
 * @Package com.kf.data.task
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午5:06:10
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqFinanceIndicator2014Task {

	private static String tableName = "neeq_finance_indicator_2014";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqFinanceIndicator2014OnlineService neeqFinanceIndicator2014OnlineService;

	@Autowired
	NeeqBaseClassificationOnlineService neeqBaseClassificationOnlineService;

	@Autowired
	TdxFinanceIndicator2014Service tdxFinanceIndicator2014Service;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqFinanceIndicator2014Online> neeqFinanceIndicator2014Onlines = neeqFinanceIndicator2014OnlineService
				.readNeeqFinanceIndicator2014Onlines(tdxUpIndexOnline);
		if (neeqFinanceIndicator2014Onlines.size() > 0) {

			for (NeeqFinanceIndicator2014Online neeqFinanceIndicator2014Online : neeqFinanceIndicator2014Onlines) {

				try {
					TdxFinanceIndicator2014 tdxFinanceIndicator2014 = new TdxFinanceIndicator2014();

					String classid = neeqFinanceIndicator2014Online.getFinClassCode();

					List<NeeqBaseClassificationOnline> neeqBaseClassifications = neeqBaseClassificationOnlineService
							.readNeeqBaseClassificationOnlineByClassId(classid);
					if (neeqBaseClassifications.size() > 0) {
						NeeqBaseClassificationOnline neeqBaseClassificationOnline = neeqBaseClassifications.get(0);

						tdxFinanceIndicator2014.setDimensions(neeqBaseClassificationOnline.getDimensions());
						tdxFinanceIndicator2014.setFinClassName(neeqBaseClassificationOnline.getClassification());

						tdxFinanceIndicator2014.setShowOrder(neeqBaseClassificationOnline.getOrder());
					}

					tdxFinanceIndicator2014.setCompanyId(neeqFinanceIndicator2014Online.getCompanyId());
					tdxFinanceIndicator2014.setStockCode(neeqFinanceIndicator2014Online.getStockCode());
					tdxFinanceIndicator2014.setFinData(neeqFinanceIndicator2014Online.getFinData());
					tdxFinanceIndicator2014.setFinDt(neeqFinanceIndicator2014Online.getFinDt());
					tdxFinanceIndicator2014.setShortName(neeqFinanceIndicator2014Online.getShortName());
					tdxFinanceIndicator2014.setFinCurrencyName(neeqFinanceIndicator2014Online.getFinCurrencyCode());
					tdxFinanceIndicator2014Service.saveTdxFinanceIndicator2014(tdxFinanceIndicator2014);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqFinanceIndicator2014Online neeqFinanceIndicator2014Online = neeqFinanceIndicator2014Onlines
						.get(neeqFinanceIndicator2014Onlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqFinanceIndicator2014Online.getId());
				tdxUpIndexOnline.setUptime(neeqFinanceIndicator2014Online.getUpdatedAt());
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
