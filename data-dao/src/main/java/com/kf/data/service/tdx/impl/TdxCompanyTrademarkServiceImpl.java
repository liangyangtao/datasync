package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyTrademark;
import com.kf.data.mybatis.entity.tdx.TdxCompanyTrademarkExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyTrademarkMapper;
import com.kf.data.service.tdx.TdxCompanyTrademarkService;

/**
 * @Title: TdxCompanyTrademarkServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 商标
 * @author: liangyt
 * @date: 2018年3月21日 下午3:59:01
 * @version V1.0
 */
@Service
public class TdxCompanyTrademarkServiceImpl implements TdxCompanyTrademarkService {

	@Autowired
	TdxCompanyTrademarkMapper tdxCompanyTrademarkMapper;

	@Override
	public void saveTdxCompanyTrademark(TdxCompanyTrademark tdxCompanyTrademark) {
		TdxCompanyTrademarkExample example = new TdxCompanyTrademarkExample();
		example.or().andCompanyIdEqualTo(tdxCompanyTrademark.getCompanyId())
				.andRegistrationNumberEqualTo(tdxCompanyTrademark.getRegistrationNumber());
		if (tdxCompanyTrademarkMapper.countByExample(example) > 0) {
			tdxCompanyTrademarkMapper.updateByExampleSelective(tdxCompanyTrademark, example);
		} else {
			tdxCompanyTrademarkMapper.insertSelective(tdxCompanyTrademark);
		}
	}

}
