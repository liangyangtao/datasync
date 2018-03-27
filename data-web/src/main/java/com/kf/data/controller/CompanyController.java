package com.kf.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kf.data.mybatis.entity.online.NeeqBaseCompanyOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyInfo;
import com.kf.data.mybatis.entity.tdx.TdxCompanySaicWithBLOBs;
import com.kf.data.service.online.NeeqBaseCompanyOnlineService;
import com.kf.data.service.online.NeeqCompanyOnlineService;
import com.kf.data.service.tdx.TdxCompanyInfoService;
import com.kf.data.service.tdx.TdxCompanySaicService;

/**
 * @Title: CompanyController.java
 * @Package com.kf.data.controller
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月27日 下午2:22:57
 * @version V1.0
 */
@Controller
public class CompanyController {

	@Autowired
	NeeqCompanyOnlineService neeqCompanyOnlineService;

	@Autowired
	NeeqBaseCompanyOnlineService neeqBaseCompanyOnlineService;

	@Autowired
	TdxCompanyInfoService tdxCompanyInfoService;

	@Autowired
	TdxCompanySaicService tdxCompanySaicService;

	public void saveCompanyByCompanyid(String companyid) {

		List<NeeqCompanyOnline> neeqCompanies = neeqCompanyOnlineService.readNeeqCompanyOnlieByCompanyId(companyid);
		if (neeqCompanies.size() > 0) {
			return;
		}
		List<NeeqBaseCompanyOnline> neeqBaseCompanyOnlines = neeqBaseCompanyOnlineService
				.readNeeqBaseCompanyOnlinesByCompanyId(companyid);
		NeeqBaseCompanyOnline neeqBaseCompanyOnline = null;
		if (neeqBaseCompanyOnlines.size() > 0) {
			neeqBaseCompanyOnline = neeqBaseCompanyOnlines.get(0);
		}
		try {

			/****
			 * 基本信息
			 */
			try {
				if (neeqBaseCompanyOnline != null) {
					TdxCompanyInfo tdxCompanyInfo = new TdxCompanyInfo();
					tdxCompanyInfo.setAddress(neeqBaseCompanyOnline.getAddress());
					tdxCompanyInfo.setArea(neeqBaseCompanyOnline.getRegisteredCityName());
					tdxCompanyInfo.setCompanyId(neeqBaseCompanyOnline.getCompanyId());
					tdxCompanyInfo.setCompanyName(neeqBaseCompanyOnline.getCompanyName());
					tdxCompanyInfo.setCityName(neeqBaseCompanyOnline.getRegisteredCityName());
					tdxCompanyInfo.setRegistrationDate(neeqBaseCompanyOnline.getRegistrationDate());
					tdxCompanyInfo.setShortName(neeqBaseCompanyOnline.getCompanyShortname());
					// tdxCompanyInfo.setUpTime(upTime);
					tdxCompanyInfo.setWeb(neeqBaseCompanyOnline.getWebsite());
					tdxCompanyInfoService.saveTdxCompanyInfo(tdxCompanyInfo);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

			/****
			 * 工商信息
			 */
			try {
				
				if (neeqBaseCompanyOnline != null) {
					TdxCompanySaicWithBLOBs tdxCompanySaic = new TdxCompanySaicWithBLOBs();
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
					tdxCompanySaic.setCompanyId(neeqBaseCompanyOnline.getCompanyId());
					tdxCompanySaic.setCompanyShortname(neeqBaseCompanyOnline.getCompanyShortname());
					// tdxCompanySaic.setEmployeesNum(neeqBaseCompanyOnline.getEmployeesNum().intValue());
					// tdxCompanySaic.setFax(neeqBaseCompanyOnline.getf());
					tdxCompanySaic.setLegalRepresentative(neeqBaseCompanyOnline.getLegalRepresentative());
					// tdxCompanySaic.setMainBusiness(neeqBaseCompanyOnline.getMainBusiness());
					// tdxCompanySaic.setSecretaries(neeqBaseCompanyOnline.getSecretaries());
					// tdxCompanySaic.setTotalStockEquity(neeqBaseCompanyOnline.getTotalStockEquity());
					tdxCompanySaicService.saveTdxCompanySaic(tdxCompanySaic);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
