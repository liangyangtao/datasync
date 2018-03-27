package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyTaxArrears;
import com.kf.data.mybatis.entity.tdx.TdxCompanyTaxArrearsExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyTaxArrearsMapper;
import com.kf.data.service.tdx.TdxCompanyTaxArrearsService;

/**
 * @Title: TdxCompanyTaxArrearsServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 上午11:28:30
 * @version V1.0
 */
@Service
public class TdxCompanyTaxArrearsServiceImpl implements TdxCompanyTaxArrearsService {

	@Autowired
	TdxCompanyTaxArrearsMapper tdxCompanyTaxArrearsMapper;

	@Override
	public void saveTdxCompanyTaxArrears(TdxCompanyTaxArrears tdxCompanyTaxArrears) {
		TdxCompanyTaxArrearsExample example = new TdxCompanyTaxArrearsExample();
		example.or().andTaxpayerIdEqualTo(tdxCompanyTaxArrears.getTaxpayerId())
				.andDtEffectiveEqualTo(tdxCompanyTaxArrears.getDtEffective());
		if (tdxCompanyTaxArrearsMapper.countByExample(example) > 0) {
			tdxCompanyTaxArrearsMapper.updateByExampleSelective(tdxCompanyTaxArrears, example);
		} else {
			tdxCompanyTaxArrearsMapper.insertSelective(tdxCompanyTaxArrears);
		}
	}

}
