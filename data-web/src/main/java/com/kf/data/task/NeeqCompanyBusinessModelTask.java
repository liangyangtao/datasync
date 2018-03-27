package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyBusinessModelOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyBusinessModel;
import com.kf.data.service.online.NeeqCompanyBusinessModelOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyBusinessModelService;

/**
 * @Title: NeeqCompanyBusinessModel.java
 * @Package com.kf.data.task
 * @Description: 商业模式
 * @author: liangyt
 * @date: 2018年3月15日 下午7:09:14
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqCompanyBusinessModelTask {

	private static String tableName = "neeq_company_business_model";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyBusinessModelOnlineService neeqCompanyBusinessModelOnlineService;

	@Autowired
	TdxCompanyBusinessModelService tdxCompanyBusinessModelService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyBusinessModelOnline> neeqCompanyBusinessModelOnlines = neeqCompanyBusinessModelOnlineService
				.readNeeqCompanyBusinessModelOnlines(tdxUpIndexOnline);
		if (neeqCompanyBusinessModelOnlines.size() > 0) {

			for (NeeqCompanyBusinessModelOnline neeqCompanyBusinessModelOnline : neeqCompanyBusinessModelOnlines) {
				try {
					TdxCompanyBusinessModel tdxCompanyBusinessModel = new TdxCompanyBusinessModel();
					tdxCompanyBusinessModel.setCompanyId(neeqCompanyBusinessModelOnline.getCompanyId());
					tdxCompanyBusinessModel.setCompanyName(neeqCompanyBusinessModelOnline.getCompanyName());
					tdxCompanyBusinessModel.setModelIntroduction(neeqCompanyBusinessModelOnline.getModelIntroduction());
					tdxCompanyBusinessModel.setReportDate(neeqCompanyBusinessModelOnline.getDate());
					tdxCompanyBusinessModel.setStockCode(neeqCompanyBusinessModelOnline.getStockCode());
					// tdxCompanyBusinessModel.setUpdatedAt(updatedAt);
					tdxCompanyBusinessModelService.saveTdxCompanyBusinessModel(tdxCompanyBusinessModel);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyBusinessModelOnline neeqCompanyBusinessModelOnline = neeqCompanyBusinessModelOnlines
						.get(neeqCompanyBusinessModelOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyBusinessModelOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyBusinessModelOnline.getUpdatedAt());
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
