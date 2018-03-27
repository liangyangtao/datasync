package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyDiv;
import com.kf.data.mybatis.entity.tdx.TdxCompanyDivExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyDivMapper;
import com.kf.data.service.tdx.TdxCompanyDivService;

/**
 * @Title: TdxCompanyDivServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 分红
 * @author: liangyt
 * @date: 2018年3月15日 上午10:52:50
 * @version V1.0
 */
@Service
public class TdxCompanyDivServiceImpl implements TdxCompanyDivService {

	@Autowired
	TdxCompanyDivMapper tdxCompanyDivMapper;

	@Override
	public void saveTdxCompanyDiv(TdxCompanyDiv tdxCompanyDiv) {
		TdxCompanyDivExample example = new TdxCompanyDivExample();
		example.or().andStockCodeEqualTo(tdxCompanyDiv.getStockCode())
				.andReportDateEqualTo(tdxCompanyDiv.getReportDate()).andDivDscrpEqualTo(tdxCompanyDiv.getDivDscrp());
		if (tdxCompanyDivMapper.countByExample(example) > 0) {
			tdxCompanyDivMapper.updateByExampleSelective(tdxCompanyDiv, example);
		} else {
			tdxCompanyDivMapper.insertSelective(tdxCompanyDiv);
		}
	}

}
