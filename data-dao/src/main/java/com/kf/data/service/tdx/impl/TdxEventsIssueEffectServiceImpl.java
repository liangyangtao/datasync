package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxEventsIssueEffect;
import com.kf.data.mybatis.entity.tdx.TdxEventsIssueEffectExample;
import com.kf.data.mybatis.mapper.tdx.TdxEventsIssueEffectMapper;
import com.kf.data.service.tdx.TdxEventsIssueEffectService;

/**
 * @Title: TdxEventsIssueEffectServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月20日 下午5:53:08
 * @version V1.0
 */
@Service
public class TdxEventsIssueEffectServiceImpl implements TdxEventsIssueEffectService {

	@Autowired
	TdxEventsIssueEffectMapper tdxEventsIssueEffectMapper;

	@Override
	public void saveTdxEventsIssueEffect(TdxEventsIssueEffect tdxEventsIssueEffect) {
		// stock_code, obj_name(100), date_plan, if_dependent, quant
		TdxEventsIssueEffectExample example = new TdxEventsIssueEffectExample();
		example.or().andStockCodeEqualTo(tdxEventsIssueEffect.getStockCode())
				.andDatePlanEqualTo(tdxEventsIssueEffect.getDatePlan())
				.andObjNameEqualTo(tdxEventsIssueEffect.getObjName())
				.andIfDependentEqualTo(tdxEventsIssueEffect.getIfDependent())
				.andQuantEqualTo(tdxEventsIssueEffect.getQuant());
		if (tdxEventsIssueEffectMapper.countByExample(example) > 0) {
			tdxEventsIssueEffectMapper.updateByExampleSelective(tdxEventsIssueEffect, example);
		} else {
			tdxEventsIssueEffectMapper.insertSelective(tdxEventsIssueEffect);
		}
	}

}
