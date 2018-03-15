package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyMainBusiness;
import com.kf.data.mybatis.entity.tdx.TdxCompanyMainBusinessExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyMainBusinessMapper;
import com.kf.data.service.tdx.TdxCompanyMainBusinessService;

/**
 * @Title: TdxCompanyMainBusinessServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 主营业务
 * @author: liangyt
 * @date: 2018年3月15日 下午6:34:52
 * @version V1.0
 */
@Service
public class TdxCompanyMainBusinessServiceImpl implements TdxCompanyMainBusinessService {

	@Autowired
	TdxCompanyMainBusinessMapper tdxCompanyMainBusinessMapper;

	@Override
	public void saveTdxCompanyMainBusiness(TdxCompanyMainBusiness tdxCompanyMainBusiness) {
		TdxCompanyMainBusinessExample example = new TdxCompanyMainBusinessExample();
		example.or().andStockCodeEqualTo(tdxCompanyMainBusiness.getStockCode())
				.andReportDateEqualTo(tdxCompanyMainBusiness.getReportDate());
		if (tdxCompanyMainBusinessMapper.countByExample(example) > 0) {
			tdxCompanyMainBusinessMapper.updateByExampleSelective(tdxCompanyMainBusiness, example);
		} else {
			tdxCompanyMainBusinessMapper.insertSelective(tdxCompanyMainBusiness);
		}

	}

}
