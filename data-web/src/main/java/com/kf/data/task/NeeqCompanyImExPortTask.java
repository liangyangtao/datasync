package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyImExportOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyImExPort;
import com.kf.data.service.online.NeeqCompanyImExportOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyImExPortService;

/**
 * @Title: NeeqCompanyImExPortTask.java
 * @Package com.kf.data.task
 * @Description: 进出口信用
 * @author: liangyt
 * @date: 2018年3月22日 下午2:47:25
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqCompanyImExPortTask {

	private static String tableName = "neeq_company_im_ex_port";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyImExportOnlineService neeqCompanyImExportOnlineService;

	@Autowired
	TdxCompanyImExPortService tdxCompanyImExPortService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyImExportOnline> neeqCompanyImExPortOnlines = neeqCompanyImExportOnlineService
				.readNeeqCompanyImExportOnlines(tdxUpIndexOnline);
		if (neeqCompanyImExPortOnlines.size() > 0) {

			for (NeeqCompanyImExportOnline neeqCompanyImExPortOnline : neeqCompanyImExPortOnlines) {
				try {
					// 先保存高管基本信息
					TdxCompanyImExPort tdxCompanyImExPort = new TdxCompanyImExPort();
					tdxCompanyImExPort.setAdminPrecincts(neeqCompanyImExPortOnline.getAdminPrecincts());
					tdxCompanyImExPort.setCompanyId(neeqCompanyImExPortOnline.getCompanyId());
					tdxCompanyImExPort.setDeclareDate(neeqCompanyImExPortOnline.getDeclareDate());
					tdxCompanyImExPort.setEconomyPrecincts(neeqCompanyImExPortOnline.getEconomyPrecincts());
					tdxCompanyImExPort.setElectronicType(neeqCompanyImExPortOnline.getElectronicType());
					tdxCompanyImExPort.setIdentifier(neeqCompanyImExPortOnline.getIdentifier());
					tdxCompanyImExPort.setIndustryType(neeqCompanyImExPortOnline.getIndustryType());
					tdxCompanyImExPort.setOperateType(neeqCompanyImExPortOnline.getOperateType());
					tdxCompanyImExPort.setRegisterDate(neeqCompanyImExPortOnline.getRegisterDate());
					tdxCompanyImExPort.setRegisterNumber(neeqCompanyImExPortOnline.getRegisterNumber());
					tdxCompanyImExPort.setRegisterOrg(neeqCompanyImExPortOnline.getRegisterOrg());
					tdxCompanyImExPort.setReportStatus(neeqCompanyImExPortOnline.getReportStatus());
					tdxCompanyImExPort.setSpecialPrecincts(neeqCompanyImExPortOnline.getSpecialPrecincts());
					// tdxCompanyImExPort.setUpdatedAt(updatedAt);
					tdxCompanyImExPortService.saveTdxCompanyImExPort(tdxCompanyImExPort);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyImExportOnline neeqCompanyImExPortOnline = neeqCompanyImExPortOnlines
						.get(neeqCompanyImExPortOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyImExPortOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyImExPortOnline.getUpdatedAt());
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
