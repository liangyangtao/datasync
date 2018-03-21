package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyPatentOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyPatentOnlineWithBLOBs;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyPatentWithBLOBs;
import com.kf.data.service.online.NeeqCompanyPatentOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyPatentService;

/**
 * @Title: NeeqCompanyPatent.java
 * @Package com.kf.data.task
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午3:39:40
 * @version V1.0
 */
//@Component
//@EnableScheduling
public class NeeqCompanyPatentTask {

	private static String tableName = "neeq_company_patent";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyPatentOnlineService neeqCompanyPatentOnlineService;

	@Autowired
	TdxCompanyPatentService tdxCompanyPatentService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyPatentOnlineWithBLOBs> neeqCompanyPatentOnlines = neeqCompanyPatentOnlineService
				.readNeeqCompanyPatentOnlines(tdxUpIndexOnline);
		if (neeqCompanyPatentOnlines.size() > 0) {

			for (NeeqCompanyPatentOnlineWithBLOBs neeqCompanyPatentOnline : neeqCompanyPatentOnlines) {
				try {
					TdxCompanyPatentWithBLOBs tdxCompanyPatent = new TdxCompanyPatentWithBLOBs();
					tdxCompanyPatent.setApplicant(neeqCompanyPatentOnline.getApplicant());
					tdxCompanyPatent.setApplicationNumber(neeqCompanyPatentOnline.getApplicationNumber());
					tdxCompanyPatent.setAreaName(neeqCompanyPatentOnline.getAreaName());
					tdxCompanyPatent.setClassificationNumber(neeqCompanyPatentOnline.getClassificationNumber());
					tdxCompanyPatent.setCompanyId(neeqCompanyPatentOnline.getCompanyId());
					tdxCompanyPatent.setCompanyName(neeqCompanyPatentOnline.getCompanyName());
					tdxCompanyPatent.setInventor(neeqCompanyPatentOnline.getInventor());
					tdxCompanyPatent.setPatentName(neeqCompanyPatentOnline.getPatentName());
					tdxCompanyPatent.setPatentType(neeqCompanyPatentOnline.getPatentType());
					tdxCompanyPatent.setPublishDate(neeqCompanyPatentOnline.getPublishDate());
					tdxCompanyPatent.setPublishNumber(neeqCompanyPatentOnline.getPublishNumber());
					tdxCompanyPatent.setAddress(neeqCompanyPatentOnline.getAddress());
					tdxCompanyPatent.setSummary(neeqCompanyPatentOnline.getSummary());
					// tdxCompanyPatent.setUpdatedAt(updatedAt);
					tdxCompanyPatentService.saveTdxCompanyPatent(tdxCompanyPatent);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyPatentOnline neeqCompanyPatentOnline = neeqCompanyPatentOnlines
						.get(neeqCompanyPatentOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyPatentOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyPatentOnline.getUpdatedAt());
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
