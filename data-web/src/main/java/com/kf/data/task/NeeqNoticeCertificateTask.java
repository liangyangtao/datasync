package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqNoticeCertificateOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxNoticeCertificate;
import com.kf.data.service.online.NeeqNoticeCertificateOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxNoticeCertificateService;

/**
 * @Title: NeeqNoticeCertificateTask.java
 * @Package com.kf.data.task
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午5:17:21
 * @version V1.0
 */
//@Component
//@EnableScheduling
public class NeeqNoticeCertificateTask {
	private static String tableName = "neeq_notice_certificate";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqNoticeCertificateOnlineService neeqNoticeCertificateOnlineService;

	@Autowired
	TdxNoticeCertificateService tdxNoticeCertificateService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqNoticeCertificateOnline> neeqNoticeCertificateOnlines = neeqNoticeCertificateOnlineService
				.readNeeqNoticeCertificateOnlines(tdxUpIndexOnline);
		if (neeqNoticeCertificateOnlines.size() > 0) {

			for (NeeqNoticeCertificateOnline neeqNoticeCertificateOnline : neeqNoticeCertificateOnlines) {

				try {
					TdxNoticeCertificate tdxNoticeCertificate = new TdxNoticeCertificate();
					tdxNoticeCertificate.setAgencyName(neeqNoticeCertificateOnline.getAgencyName());
					tdxNoticeCertificate.setCertifName(neeqNoticeCertificateOnline.getCertifName());
					tdxNoticeCertificate.setCertifSerialNum(neeqNoticeCertificateOnline.getCertifSerialNum());
					tdxNoticeCertificate.setCompanyId(neeqNoticeCertificateOnline.getCompanyId());
					tdxNoticeCertificate.setCompanyName(neeqNoticeCertificateOnline.getCompanyName());
					tdxNoticeCertificate.setDtEffect(neeqNoticeCertificateOnline.getDtEffect());
					tdxNoticeCertificate.setDtExp(neeqNoticeCertificateOnline.getDtExp());
					tdxNoticeCertificate.setStockCode(neeqNoticeCertificateOnline.getStockCode());
					// tdxNoticeCertificate.setUpdatedAt(updatedAt);
					tdxNoticeCertificateService.saveTdxNoticeCertificate(tdxNoticeCertificate);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqNoticeCertificateOnline neeqNoticeCertificateOnline = neeqNoticeCertificateOnlines
						.get(neeqNoticeCertificateOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqNoticeCertificateOnline.getId());
				tdxUpIndexOnline.setUptime(neeqNoticeCertificateOnline.getUpdatedAt());
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
