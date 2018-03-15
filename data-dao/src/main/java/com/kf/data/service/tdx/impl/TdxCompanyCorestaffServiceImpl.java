package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyCorestaff;
import com.kf.data.mybatis.entity.tdx.TdxCompanyCorestaffExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyCorestaffMapper;
import com.kf.data.service.tdx.TdxCompanyCorestaffService;

/**
 * @Title: TdxCompanyCorestaffServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 核心员工
 * @author: liangyt
 * @date: 2018年3月15日 下午4:12:46
 * @version V1.0
 */
@Service
public class TdxCompanyCorestaffServiceImpl implements TdxCompanyCorestaffService {

	@Autowired
	TdxCompanyCorestaffMapper tdxCompanyCorestaffMapper;

	@Override
	public void saveTdxCompanyCorestaff(TdxCompanyCorestaff tdxCompanyCorestaff) {
		TdxCompanyCorestaffExample example = new TdxCompanyCorestaffExample();
		example.or().andStockCodeEqualTo(tdxCompanyCorestaff.getStockCode())
				.andReportDateEqualTo(tdxCompanyCorestaff.getReportDate())
				.andNameEqualTo(tdxCompanyCorestaff.getName());
		if (tdxCompanyCorestaffMapper.countByExample(example) > 0) {	
			tdxCompanyCorestaffMapper.updateByExampleSelective(tdxCompanyCorestaff, example);
		} else {
			tdxCompanyCorestaffMapper.insertSelective(tdxCompanyCorestaff);
		}
	}

}
