package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyPatentStatOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyPatentStat;
import com.kf.data.service.online.NeeqCompanyPatentStatOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyPatentStatService;

/**
 * @Title: NeeqCompanyPatentStat.java
 * @Package com.kf.data.task
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午3:39:40
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqCompanyPatentStatTask {

	private static String tableName = "neeq_company_patent_stat";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyPatentStatOnlineService neeqCompanyPatentStatOnlineService;

	@Autowired
	TdxCompanyPatentStatService tdxCompanyPatentStatService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyPatentStatOnline> neeqCompanyPatentStatOnlines = neeqCompanyPatentStatOnlineService
				.readNeeqCompanyPatentStatOnlines(tdxUpIndexOnline);
		if (neeqCompanyPatentStatOnlines.size() > 0) {

			for (NeeqCompanyPatentStatOnline neeqCompanyPatentStatOnline : neeqCompanyPatentStatOnlines) {
				try {
					TdxCompanyPatentStat tdxCompanyPatentStat = new TdxCompanyPatentStat();
					tdxCompanyPatentStat.setCategory(neeqCompanyPatentStatOnline.getCategory());
					tdxCompanyPatentStat.setCompanyId(neeqCompanyPatentStatOnline.getCompanyId());
					tdxCompanyPatentStat.setCompanyShortname(neeqCompanyPatentStatOnline.getCompanyShortname());
					tdxCompanyPatentStat.setPatentNum(neeqCompanyPatentStatOnline.getPatentNum());
					tdxCompanyPatentStat.setReportDate(neeqCompanyPatentStatOnline.getDate());
					tdxCompanyPatentStat.setStockCode(neeqCompanyPatentStatOnline.getStockCode());
					tdxCompanyPatentStatService.saveTdxCompanyPatentStat(tdxCompanyPatentStat);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyPatentStatOnline neeqCompanyPatentStatOnline = neeqCompanyPatentStatOnlines
						.get(neeqCompanyPatentStatOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyPatentStatOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyPatentStatOnline.getUpdatedAt());
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
