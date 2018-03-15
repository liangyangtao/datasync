package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyBusinessIncome;
import com.kf.data.mybatis.entity.tdx.TdxCompanyBusinessIncome;
import com.kf.data.mybatis.entity.tdx.TdxCompanyBusinessIncomeExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyBusinessIncomeMapper;
import com.kf.data.service.tdx.TdxCompanyBusinessIncomeService;

/**
 * @Title: TdxCompanyBusinessIncomeServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 收入来源
 * @author: liangyt
 * @date: 2018年3月15日 下午6:30:21
 * @version V1.0
 */
@Service
public class TdxCompanyBusinessIncomeServiceImpl implements TdxCompanyBusinessIncomeService {

	@Autowired
	TdxCompanyBusinessIncomeMapper tdxCompanyBusinessIncomeMapper;

	@Override
	public void saveTdxCompanyBusinessIncome(TdxCompanyBusinessIncome tdxCompanyBusinessIncome) {
		TdxCompanyBusinessIncomeExample example = new TdxCompanyBusinessIncomeExample();
		example.or().andReportDateEqualTo(tdxCompanyBusinessIncome.getReportDate())
				.andCompanyIdEqualTo(tdxCompanyBusinessIncome.getCompanyId())
				.andBusinessEqualTo(tdxCompanyBusinessIncome.getBusiness());
		if (tdxCompanyBusinessIncomeMapper.countByExample(example) > 0) {
			tdxCompanyBusinessIncomeMapper.updateByExampleSelective(tdxCompanyBusinessIncome, example);
		} else {
			tdxCompanyBusinessIncomeMapper.insertSelective(tdxCompanyBusinessIncome);
		}

	}

}
