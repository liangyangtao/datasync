package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyChattelMortgage;
import com.kf.data.mybatis.entity.tdx.TdxCompanyChattelMortgageExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyChattelMortgageMapper;
import com.kf.data.service.tdx.TdxCompanyChattelMortgageService;

/**
 * @Title: TdxCompanyChattelMortgageServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 动产抵押
 * @author: liangyt
 * @date: 2018年3月16日 下午5:40:08
 * @version V1.0
 */
@Service
public class TdxCompanyChattelMortgageServiceImpl implements TdxCompanyChattelMortgageService {

	@Autowired
	TdxCompanyChattelMortgageMapper tdxCompanyChattelMortgageMapper;

	@Override
	public void saveTdxCompanyChattelMortgage(TdxCompanyChattelMortgage tdxCompanyChattelMortgage) {
		TdxCompanyChattelMortgageExample example = new TdxCompanyChattelMortgageExample();
		example.or().andRegisterNumberEqualTo(tdxCompanyChattelMortgage.getRegisterNumber())
				.andCompanyIdEqualTo(tdxCompanyChattelMortgage.getCompanyId());
		if (tdxCompanyChattelMortgageMapper.countByExample(example) > 0) {
			tdxCompanyChattelMortgageMapper.updateByExampleSelective(tdxCompanyChattelMortgage, example);
		} else {
			tdxCompanyChattelMortgageMapper.insertSelective(tdxCompanyChattelMortgage);
		}
	}

}
