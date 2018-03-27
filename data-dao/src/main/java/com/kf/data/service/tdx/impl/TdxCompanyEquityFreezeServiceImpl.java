package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyEquityFreeze;
import com.kf.data.mybatis.entity.tdx.TdxCompanyEquityFreezeExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyEquityFreezeMapper;
import com.kf.data.service.tdx.TdxCompanyEquityFreezeService;

/**
 * @Title: TdxCompanyEquityFreezeServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午2:03:34
 * @version V1.0
 */
@Service
public class TdxCompanyEquityFreezeServiceImpl implements TdxCompanyEquityFreezeService {

	@Autowired
	TdxCompanyEquityFreezeMapper tdxCompanyEquityFreezeMapper;

	@Override
	public void saveTdxCompanyEquityFreeze(TdxCompanyEquityFreeze tdxCompanyEquityFreeze) {
		TdxCompanyEquityFreezeExample example = new TdxCompanyEquityFreezeExample();
		example.or().andStockCodeEqualTo(tdxCompanyEquityFreeze.getStockCode())
				.andStockholderNameEqualTo(tdxCompanyEquityFreeze.getStockholderName())
				.andDtNoticeEqualTo(tdxCompanyEquityFreeze.getDtNotice());
		if (tdxCompanyEquityFreezeMapper.countByExample(example) > 0) {
			tdxCompanyEquityFreezeMapper.updateByExampleSelective(tdxCompanyEquityFreeze, example);
		} else {
			tdxCompanyEquityFreezeMapper.insertSelective(tdxCompanyEquityFreeze);
		}
	}
}
