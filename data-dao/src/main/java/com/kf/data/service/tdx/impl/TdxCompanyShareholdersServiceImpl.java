package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyShareholders;
import com.kf.data.mybatis.entity.tdx.TdxCompanyShareholdersExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyShareholdersMapper;
import com.kf.data.service.tdx.TdxCompanyShareholdersService;

/**
 * @Title: TdxCompanyShareholdersServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 股东
 * @author: liangyt
 * @date: 2018年3月15日 上午10:25:46
 * @version V1.0
 */
@Service
public class TdxCompanyShareholdersServiceImpl implements TdxCompanyShareholdersService {

	@Autowired
	TdxCompanyShareholdersMapper tdxCompanyShareholdersMapper;

	@Override
	public void saveTdxCompanyShareholders(TdxCompanyShareholders tdxCompanyShareholders) {
		TdxCompanyShareholdersExample example = new TdxCompanyShareholdersExample();
		example.or().andStockCodeEqualTo(tdxCompanyShareholders.getStockCode())
				.andNameEqualTo(tdxCompanyShareholders.getName())
				.andReportDateEqualTo(tdxCompanyShareholders.getReportDate());
		if (tdxCompanyShareholdersMapper.countByExample(example) > 0) {
			tdxCompanyShareholdersMapper.updateByExampleSelective(tdxCompanyShareholders, example);
		} else {
			tdxCompanyShareholdersMapper.insertSelective(tdxCompanyShareholders);
		}
	}

}
