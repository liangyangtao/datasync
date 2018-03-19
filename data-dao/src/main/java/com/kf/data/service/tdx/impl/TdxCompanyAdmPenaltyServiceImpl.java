package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyAdmPenalty;
import com.kf.data.mybatis.entity.tdx.TdxCompanyAdmPenaltyExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyAdmPenaltyMapper;
import com.kf.data.service.tdx.TdxCompanyAdmPenaltyService;

/**
 * @Title: TdxCompanyAdmPenaltyServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 行政处罚
 * @author: liangyt
 * @date: 2018年3月16日 下午5:24:19
 * @version V1.0
 */
@Service
public class TdxCompanyAdmPenaltyServiceImpl implements TdxCompanyAdmPenaltyService {

	@Autowired
	TdxCompanyAdmPenaltyMapper tdxCompanyAdmPenaltyMapper;

	@Override
	public void saveTdxCompanyAdmPenalty(TdxCompanyAdmPenalty tdxCompanyAdmPenalty) {
		TdxCompanyAdmPenaltyExample example = new TdxCompanyAdmPenaltyExample();

		example.or().andDtEffectiveEqualTo(tdxCompanyAdmPenalty.getDtEffective())
				.andOrderNumberEqualTo(tdxCompanyAdmPenalty.getOrderNumber())
				.andCompanyIdEqualTo(tdxCompanyAdmPenalty.getCompanyId());
		if (tdxCompanyAdmPenaltyMapper.countByExample(example) > 0) {
			tdxCompanyAdmPenaltyMapper.updateByExampleSelective(tdxCompanyAdmPenalty, example);
		} else {
			tdxCompanyAdmPenaltyMapper.insertSelective(tdxCompanyAdmPenalty);
		}
	}

}
