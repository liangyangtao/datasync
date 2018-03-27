package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqInformationReportOnline;
import com.kf.data.mybatis.entity.online.NeeqInformationReportOnlineWithBLOBs;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxInformationReport;
import com.kf.data.service.online.NeeqInformationReportOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxInformationReportService;

/**
 * @Title: NeeqInformationReportTask.java
 * @Package com.kf.data.task
 * @Description: 研报
 * @author: liangyt
 * @date: 2018年3月23日 下午2:17:09
 * @version V1.0
 */

@Component
@EnableScheduling
public class NeeqInformationReportTask {

	private static String tableName = "neeq_information_report";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqInformationReportOnlineService neeqInformationReportOnlineService;

	@Autowired
	TdxInformationReportService tdxInformationReportService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqInformationReportOnlineWithBLOBs> neeqInformationReportOnlines = neeqInformationReportOnlineService
				.readNeeqInformationReportOnlines(tdxUpIndexOnline);
		if (neeqInformationReportOnlines.size() > 0) {

			for (NeeqInformationReportOnlineWithBLOBs neeqInformationReportOnline : neeqInformationReportOnlines) {

				try {
					TdxInformationReport tdxInformationReport = new TdxInformationReport();
					tdxInformationReport.setContent(neeqInformationReportOnline.getContent());
					tdxInformationReport.setPublishDate(neeqInformationReportOnline.getPublishDate());
					tdxInformationReport.setReporter(neeqInformationReportOnline.getReporter());
					tdxInformationReport.setReportTypeName(neeqInformationReportOnline.getReportTypeName());
					tdxInformationReport.setSname(neeqInformationReportOnline.getSname());
					tdxInformationReport.setSpcuritiesName(neeqInformationReportOnline.getSpcuritiesName());
					tdxInformationReport.setTitle(neeqInformationReportOnline.getTitle());
					// tdxInformationReport.setUpdatedAt(updatedAt);
					tdxInformationReportService.saveTdxInformationReport(tdxInformationReport);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqInformationReportOnline neeqInformationReportOnline = neeqInformationReportOnlines
						.get(neeqInformationReportOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqInformationReportOnline.getId());
				tdxUpIndexOnline.setUptime(neeqInformationReportOnline.getUpdatedAt());
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
