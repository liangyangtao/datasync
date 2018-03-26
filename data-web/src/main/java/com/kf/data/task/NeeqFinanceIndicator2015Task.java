package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqBaseClassificationOnline;
import com.kf.data.mybatis.entity.online.NeeqFinanceIndicator2015Online;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxFinanceIndicator2015;
import com.kf.data.service.online.NeeqBaseClassificationOnlineService;
import com.kf.data.service.online.NeeqFinanceIndicator2015OnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxFinanceIndicator2015Service;

/**
 * @Title: NeeqFinanceIndicator2015Task.java
 * @Package com.kf.data.task
 * @Description: 财务2015
 * @author: liangyt
 * @date: 2018年3月23日 下午5:06:10
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqFinanceIndicator2015Task {

	private static String tableName = "neeq_finance_indicator_2015";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqFinanceIndicator2015OnlineService neeqFinanceIndicator2015OnlineService;

	@Autowired
	NeeqBaseClassificationOnlineService neeqBaseClassificationOnlineService;

	@Autowired
	TdxFinanceIndicator2015Service tdxFinanceIndicator2015Service;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqFinanceIndicator2015Online> neeqFinanceIndicator2015Onlines = neeqFinanceIndicator2015OnlineService
				.readNeeqFinanceIndicator2015Onlines(tdxUpIndexOnline);
		if (neeqFinanceIndicator2015Onlines.size() > 0) {

			for (NeeqFinanceIndicator2015Online neeqFinanceIndicator2015Online : neeqFinanceIndicator2015Onlines) {

				try {
					TdxFinanceIndicator2015 tdxFinanceIndicator2015 = new TdxFinanceIndicator2015();

					String classid = neeqFinanceIndicator2015Online.getFinClassCode();

					List<NeeqBaseClassificationOnline> neeqBaseClassifications = neeqBaseClassificationOnlineService
							.readNeeqBaseClassificationOnlineByClassId(classid);
					if (neeqBaseClassifications.size() > 0) {
						NeeqBaseClassificationOnline neeqBaseClassificationOnline = neeqBaseClassifications.get(0);

						tdxFinanceIndicator2015.setDimensions(neeqBaseClassificationOnline.getDimensions());
						tdxFinanceIndicator2015.setFinClassName(neeqBaseClassificationOnline.getClassification());

						tdxFinanceIndicator2015.setShowOrder(neeqBaseClassificationOnline.getOrder());
					}

					tdxFinanceIndicator2015.setCompanyId(neeqFinanceIndicator2015Online.getCompanyId());
					tdxFinanceIndicator2015.setStockCode(neeqFinanceIndicator2015Online.getStockCode());
					tdxFinanceIndicator2015.setFinData(neeqFinanceIndicator2015Online.getFinData());
					tdxFinanceIndicator2015.setFinDt(neeqFinanceIndicator2015Online.getFinDt());
					tdxFinanceIndicator2015.setShortName(neeqFinanceIndicator2015Online.getShortName());
					tdxFinanceIndicator2015.setFinCurrencyName(neeqFinanceIndicator2015Online.getFinCurrencyCode());
					tdxFinanceIndicator2015Service.saveTdxFinanceIndicator2015(tdxFinanceIndicator2015);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqFinanceIndicator2015Online neeqFinanceIndicator2015Online = neeqFinanceIndicator2015Onlines
						.get(neeqFinanceIndicator2015Onlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqFinanceIndicator2015Online.getId());
				tdxUpIndexOnline.setUptime(neeqFinanceIndicator2015Online.getUpdatedAt());
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
