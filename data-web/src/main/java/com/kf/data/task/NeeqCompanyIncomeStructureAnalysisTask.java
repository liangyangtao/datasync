package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyIncomeStructureAnalysisOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyIncomeStructureAnalysis;
import com.kf.data.service.online.NeeqCompanyIncomeStructureAnalysisOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyIncomeStructureAnalysisService;

/**  
 * @Title:  NeeqCompanyIncomeStructureAnalysisTask.java   
 * @Package com.kf.data.task   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: liangyt    
 * @date:   2018年3月27日 上午10:19:12   
 * @version V1.0 
 */
@Component
@EnableScheduling
public class NeeqCompanyIncomeStructureAnalysisTask {

	private static String tableName = "neeq_company_income_structure_analysis";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyIncomeStructureAnalysisOnlineService neeqCompanyIncomeStructureAnalysisOnlineService;

	@Autowired
	TdxCompanyIncomeStructureAnalysisService tdxCompanyIncomeStructureAnalysisService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyIncomeStructureAnalysisOnline> neeqCompanyIncomeStructureAnalysisOnlines = neeqCompanyIncomeStructureAnalysisOnlineService
				.readNeeqCompanyIncomeStructureAnalysisOnlines(tdxUpIndexOnline);
		if (neeqCompanyIncomeStructureAnalysisOnlines.size() > 0) {

			for (NeeqCompanyIncomeStructureAnalysisOnline neeqCompanyIncomeStructureAnalysisOnline : neeqCompanyIncomeStructureAnalysisOnlines) {
				try {
					// 先保存高管基本信息
					TdxCompanyIncomeStructureAnalysis tdxCompanyIncomeStructureAnalysis = new TdxCompanyIncomeStructureAnalysis();
					tdxCompanyIncomeStructureAnalysis.setCategory(neeqCompanyIncomeStructureAnalysisOnline.getCategory());
					tdxCompanyIncomeStructureAnalysis.setCompanyId(neeqCompanyIncomeStructureAnalysisOnline.getCompanyId());
					tdxCompanyIncomeStructureAnalysis.setCompanyShortname(neeqCompanyIncomeStructureAnalysisOnline.getCompanyShortname());
					tdxCompanyIncomeStructureAnalysis.setCurrentIncome(neeqCompanyIncomeStructureAnalysisOnline.getCurrentIncome());
					tdxCompanyIncomeStructureAnalysis.setCurrentRatio(neeqCompanyIncomeStructureAnalysisOnline.getCurrentRatio());
					tdxCompanyIncomeStructureAnalysis.setReportDate(neeqCompanyIncomeStructureAnalysisOnline.getDt());
					tdxCompanyIncomeStructureAnalysis.setStockCode(neeqCompanyIncomeStructureAnalysisOnline.getStockCode());
					tdxCompanyIncomeStructureAnalysisService.saveTdxCompanyIncomeStructureAnalysis(tdxCompanyIncomeStructureAnalysis);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyIncomeStructureAnalysisOnline neeqCompanyIncomeStructureAnalysisOnline = neeqCompanyIncomeStructureAnalysisOnlines
						.get(neeqCompanyIncomeStructureAnalysisOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyIncomeStructureAnalysisOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyIncomeStructureAnalysisOnline.getUpdatedAt());
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
