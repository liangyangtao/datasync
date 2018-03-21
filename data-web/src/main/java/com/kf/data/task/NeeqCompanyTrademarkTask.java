package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyTrademarkOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyTrademark;
import com.kf.data.service.online.NeeqCompanyTrademarkOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyTrademarkService;

/**
 * @Title: NeeqCompanyTrademarkTask.java
 * @Package com.kf.data.task
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午4:05:27
 * @version V1.0
 */
// @Component
// @EnableScheduling
public class NeeqCompanyTrademarkTask {

	private static String tableName = "neeq_company_trademark";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyTrademarkOnlineService neeqCompanyTrademarkOnlineService;

	@Autowired
	TdxCompanyTrademarkService tdxCompanyTrademarkService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyTrademarkOnline> neeqCompanyTrademarkOnlines = neeqCompanyTrademarkOnlineService
				.readNeeqCompanyTrademarkOnlines(tdxUpIndexOnline);
		if (neeqCompanyTrademarkOnlines.size() > 0) {

			for (NeeqCompanyTrademarkOnline neeqCompanyTrademarkOnline : neeqCompanyTrademarkOnlines) {
				try {
					TdxCompanyTrademark tdxCompanyTrademark = new TdxCompanyTrademark();
					tdxCompanyTrademark.setApplicantName(neeqCompanyTrademarkOnline.getApplicantName());
					tdxCompanyTrademark.setApplicationDate(neeqCompanyTrademarkOnline.getApplicationDate());
					tdxCompanyTrademark.setCategoryNumber(neeqCompanyTrademarkOnline.getCategoryNumber());
					tdxCompanyTrademark.setCompanyId(neeqCompanyTrademarkOnline.getCompanyId());
					tdxCompanyTrademark.setCompanyName(neeqCompanyTrademarkOnline.getCompanyName());
					tdxCompanyTrademark.setRegistrationNumber(neeqCompanyTrademarkOnline.getRegistrationNumber());
					tdxCompanyTrademark.setTrademarkImgUrl(neeqCompanyTrademarkOnline.getTrademarkImgUrl());
					tdxCompanyTrademark.setTrademarkStatus(neeqCompanyTrademarkOnline.getTrademarkStatus());
					tdxCompanyTrademark.setTrademarkType(neeqCompanyTrademarkOnline.getTrademarkType());
					tdxCompanyTrademarkService.saveTdxCompanyTrademark(tdxCompanyTrademark);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyTrademarkOnline neeqCompanyTrademarkOnline = neeqCompanyTrademarkOnlines
						.get(neeqCompanyTrademarkOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyTrademarkOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyTrademarkOnline.getUpdatedAt());
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
