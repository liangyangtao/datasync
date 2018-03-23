package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqBaseCompanyOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyAccountingFirm;
import com.kf.data.mybatis.entity.tdx.TdxCompanyIndustry;
import com.kf.data.mybatis.entity.tdx.TdxCompanyInfo;
import com.kf.data.mybatis.entity.tdx.TdxCompanyLawFirm;
import com.kf.data.mybatis.entity.tdx.TdxCompanySaicWithBLOBs;
import com.kf.data.service.online.NeeqBaseCompanyOnlineService;
import com.kf.data.service.online.NeeqCompanyOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyAccountingFirmService;
import com.kf.data.service.tdx.TdxCompanyIndustryService;
import com.kf.data.service.tdx.TdxCompanyInfoService;
import com.kf.data.service.tdx.TdxCompanyLawFirmService;
import com.kf.data.service.tdx.TdxCompanySaicService;

/**
 * @Title: NeeqCompanyTask.java
 * @Package com.kf.data.task
 * @Description: 公司基本信息
 * @author: liangyt
 * @date: 2018年3月20日 下午6:10:51
 * @version V1.0
 */
//@Component
//@EnableScheduling
public class NeeqCompanyTask {

	private static String tableName = "neeq_company";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyOnlineService neeqCompanyOnlineService;

	@Autowired
	NeeqBaseCompanyOnlineService neeqBaseCompanyOnlineService;

	@Autowired
	TdxCompanyInfoService tdxCompanyInfoService;

	@Autowired
	TdxCompanySaicService tdxCompanySaicService;

	@Autowired
	TdxCompanyIndustryService tdxCompanyIndustryService;

	@Autowired
	TdxCompanyAccountingFirmService tdxCompanyAccountingFirmService;

	@Autowired
	TdxCompanyLawFirmService tdxCompanyLawFirmService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyOnline> neeqCompanyOnlines = neeqCompanyOnlineService.readNeeqCompanyOnlines(tdxUpIndexOnline);
		if (neeqCompanyOnlines.size() > 0) {

			for (NeeqCompanyOnline neeqCompanyOnline : neeqCompanyOnlines) {

				List<NeeqBaseCompanyOnline> neeqBaseCompanyOnlines = neeqBaseCompanyOnlineService
						.readNeeqBaseCompanyOnlinesByCompanyId(neeqCompanyOnline.getCompanyId());
				NeeqBaseCompanyOnline neeqBaseCompanyOnline = null;
				if (neeqBaseCompanyOnlines.size() > 0) {
					neeqBaseCompanyOnline = neeqBaseCompanyOnlines.get(0);
				}

				/****
				 * 基本信息
				 */
				try {
					TdxCompanyInfo tdxCompanyInfo = new TdxCompanyInfo();
					tdxCompanyInfo.setAddress(neeqCompanyOnline.getAddress());
					tdxCompanyInfo.setArea(neeqCompanyOnline.getArea());
					tdxCompanyInfo.setCompanyId(neeqCompanyOnline.getCompanyId());
					tdxCompanyInfo.setCompanyName(neeqCompanyOnline.getName());
					if (neeqBaseCompanyOnline != null) {
						tdxCompanyInfo.setRegistrationDate(neeqBaseCompanyOnline.getRegistrationDate());
						// tdxCompanyInfo.setHisName(neeqBaseCompanyOnline.get);
					}

					tdxCompanyInfo.setShortName(neeqCompanyOnline.getShortname());
					// tdxCompanyInfo.setUpTime(upTime);
					tdxCompanyInfo.setWeb(neeqCompanyOnline.getWebsite());

					tdxCompanyInfoService.saveTdxCompanyInfo(tdxCompanyInfo);

				} catch (Exception e) {
					e.printStackTrace();
				}

				/****
				 * 工商信息
				 */
				try {
					TdxCompanySaicWithBLOBs tdxCompanySaic = new TdxCompanySaicWithBLOBs();
					if (neeqBaseCompanyOnline != null) {
						tdxCompanySaic.setApprovedDate(neeqBaseCompanyOnline.getApprovedDate());
						tdxCompanySaic.setBusinessScope(neeqBaseCompanyOnline.getBusinessScope());
						tdxCompanySaic.setCompanyType(neeqBaseCompanyOnline.getCompanyType());
						tdxCompanySaic.setCreditCode(neeqBaseCompanyOnline.getCreditCode());
						tdxCompanySaic.setOperatingBeginDate(neeqBaseCompanyOnline.getOperatingBeginDate());
						tdxCompanySaic.setOperatingEndDate(neeqBaseCompanyOnline.getOperatingEndDate());
						tdxCompanySaic.setOrganizationCode(neeqBaseCompanyOnline.getOrganizationCode());
						tdxCompanySaic.setOperatingStatus(neeqBaseCompanyOnline.getOperatingStatus());
						tdxCompanySaic.setRegisteredCapital(neeqBaseCompanyOnline.getRegisteredCapital());
						tdxCompanySaic.setRegistrationAuthority(neeqBaseCompanyOnline.getRegistrationAuthority());
						tdxCompanySaic.setRegistrationNumber(neeqBaseCompanyOnline.getRegistrationNumber());
						tdxCompanySaic.setTel(neeqBaseCompanyOnline.getTel());
					}

					tdxCompanySaic.setCompanyId(neeqCompanyOnline.getCompanyId());
					tdxCompanySaic.setCompanyShortname(neeqCompanyOnline.getShortname());
					tdxCompanySaic.setEmployeesNum(neeqCompanyOnline.getEmployeesNum().intValue());
					tdxCompanySaic.setFax(neeqCompanyOnline.getFax());
					tdxCompanySaic.setLegalRepresentative(neeqCompanyOnline.getLegalRepresentative());
					tdxCompanySaic.setMainBusiness(neeqCompanyOnline.getMainBusiness());
					tdxCompanySaic.setSecretaries(neeqCompanyOnline.getSecretaries());
					tdxCompanySaic.setTotalStockEquity(neeqCompanyOnline.getTotalStockEquity());
					// tdxCompanySaic.setUpTime(upTime);
					tdxCompanySaicService.saveTdxCompanySaic(tdxCompanySaic);
				} catch (Exception e) {
					e.printStackTrace();
				}

				/***
				 * 行业
				 */
				try {
					TdxCompanyIndustry tdxCompanyIndustry = new TdxCompanyIndustry();
					tdxCompanyIndustry.setCompanyId(neeqCompanyOnline.getCompanyId());
					tdxCompanyIndustry.setIndustryName(neeqCompanyOnline.getIndustryName());
					tdxCompanyIndustryService.saveTdxCompanyIndustry(tdxCompanyIndustry);
				} catch (Exception e) {
					e.printStackTrace();
				}

				/***
				 * 会计
				 */
				try {
					TdxCompanyAccountingFirm tdxCompanyAccountingFirm = new TdxCompanyAccountingFirm();
					tdxCompanyAccountingFirm.setAccountingFirmId(neeqCompanyOnline.getAccountingFirmId());
					tdxCompanyAccountingFirm.setAccountingFirmName(neeqCompanyOnline.getAccountingFirmShortname());
					tdxCompanyAccountingFirm.setCompanyId(neeqCompanyOnline.getCompanyId());
					tdxCompanyAccountingFirm.setCompanyName(neeqCompanyOnline.getName());
					// tdxCompanyAccountingFirm.setUpdatedAt(updatedAt);
					tdxCompanyAccountingFirmService.saveTdxCompanyAccountingFirm(tdxCompanyAccountingFirm);
				} catch (Exception e) {
					e.printStackTrace();
				}

				/***
				 * 律师
				 */

				try {
					TdxCompanyLawFirm tdxCompanyLawFirm = new TdxCompanyLawFirm();
					tdxCompanyLawFirm.setCompanyId(neeqCompanyOnline.getCompanyId());
					tdxCompanyLawFirm.setCompanyName(neeqCompanyOnline.getName());
					tdxCompanyLawFirm.setLawFirmId(neeqCompanyOnline.getLawFirmId());
					tdxCompanyLawFirm.setLawFirmName(neeqCompanyOnline.getLawFirmShortname());
					tdxCompanyLawFirmService.saveTdxCompanyLawFirm(tdxCompanyLawFirm);
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
			try {
				NeeqCompanyOnline neeqCompanyOnline = neeqCompanyOnlines.get(neeqCompanyOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyOnline.getUpdatedAt());
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
