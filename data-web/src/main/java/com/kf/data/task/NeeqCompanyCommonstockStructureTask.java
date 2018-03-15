package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyCommonstockStructureOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyCommonstockStructure;
import com.kf.data.service.online.NeeqCompanyCommonstockStructureOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyCommonstockStructureService;

/**
 * @Title: NeeqCompanyCommonstockStructureTask.java
 * @Package com.kf.data.task
 * @Description: 股本结构
 * @author: liangyt
 * @date: 2018年3月14日 下午4:07:32
 * @version V1.0
 */

//@Component
//@EnableScheduling
public class NeeqCompanyCommonstockStructureTask {

	private static String tableName = "neeq_company_commonstock_structure";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyCommonstockStructureOnlineService neeqCompanyCommonstockStructureOnlineService;

	@Autowired
	TdxCompanyCommonstockStructureService tdxCompanyCommonstockStructureService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyCommonstockStructureOnline> neeqCompanyCommonstockStructureOnlines = neeqCompanyCommonstockStructureOnlineService
				.readNeeqCompanyCommonstockStructureOnlines(tdxUpIndexOnline);
		if (neeqCompanyCommonstockStructureOnlines.size() > 0) {

			for (NeeqCompanyCommonstockStructureOnline neeqCompanyCommonstockStructureOnline : neeqCompanyCommonstockStructureOnlines) {
				try {
					TdxCompanyCommonstockStructure tdxCompanyCommonstockStructure = new TdxCompanyCommonstockStructure();
					tdxCompanyCommonstockStructure.setCompanyId(neeqCompanyCommonstockStructureOnline.getCompanyId());
					tdxCompanyCommonstockStructure
							.setCompanyShortname(neeqCompanyCommonstockStructureOnline.getCompanyShortname());
					// tdxCompanyCommonstockStructure.setId(id);
					tdxCompanyCommonstockStructure.setQtyBegin(neeqCompanyCommonstockStructureOnline.getQtyBegin());
					tdxCompanyCommonstockStructure.setQtyChange(neeqCompanyCommonstockStructureOnline.getQtyChange());
					tdxCompanyCommonstockStructure.setQtyEnd(neeqCompanyCommonstockStructureOnline.getQtyEnd());
					tdxCompanyCommonstockStructure.setRatioBegin(neeqCompanyCommonstockStructureOnline.getRatioBegin());
					tdxCompanyCommonstockStructure.setRatioEnd(neeqCompanyCommonstockStructureOnline.getRatioEnd());
					tdxCompanyCommonstockStructure.setReportDate(neeqCompanyCommonstockStructureOnline.getDt());
					tdxCompanyCommonstockStructure.setStockCode(neeqCompanyCommonstockStructureOnline.getStockCode());
					tdxCompanyCommonstockStructure.setStockType(neeqCompanyCommonstockStructureOnline.getStockType());
					tdxCompanyCommonstockStructure
							.setStockTypeInfo(neeqCompanyCommonstockStructureOnline.getStockTypeInfo());
					// tdxCompanyCommonstockStructure.setUpdatedAt(updatedAt);
					tdxCompanyCommonstockStructureService
							.saveTdxCompanyCommonstockStructure(tdxCompanyCommonstockStructure);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyCommonstockStructureOnline neeqCompanyCommonstockStructureOnline = neeqCompanyCommonstockStructureOnlines
						.get(neeqCompanyCommonstockStructureOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyCommonstockStructureOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyCommonstockStructureOnline.getUpdatedAt());
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
