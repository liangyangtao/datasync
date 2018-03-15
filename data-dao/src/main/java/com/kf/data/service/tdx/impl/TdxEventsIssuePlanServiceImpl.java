package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxEventsIssuePlan;
import com.kf.data.mybatis.entity.tdx.TdxEventsIssuePlanExample;
import com.kf.data.mybatis.mapper.tdx.TdxEventsIssuePlanMapper;
import com.kf.data.service.tdx.TdxEventsIssuePlanService;

/**
 * @Title: TdxEventsIssuePlanServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 股票增发
 * @author: liangyt
 * @date: 2018年3月15日 下午4:54:09
 * @version V1.0
 */
@Service
public class TdxEventsIssuePlanServiceImpl implements TdxEventsIssuePlanService {

	@Autowired
	TdxEventsIssuePlanMapper tdxEventsIssuePlanMapper;

	@Override
	public void saveTdxEventsIssuePlan(TdxEventsIssuePlan tdxEventsIssuePlan) {
		// stock_code, date_plan, date_new, if_dependent, obj_name(150)
		TdxEventsIssuePlanExample example = new TdxEventsIssuePlanExample();
		example.or().andStockCodeEqualTo(tdxEventsIssuePlan.getStockCode())
				.andDatePlanEqualTo(tdxEventsIssuePlan.getDatePlan()).andDateNewEqualTo(tdxEventsIssuePlan.getDateNew())
				.andIfDependentEqualTo(tdxEventsIssuePlan.getIfDependent())
				.andObjNameEqualTo(tdxEventsIssuePlan.getObjName());

		if (tdxEventsIssuePlanMapper.countByExample(example) > 0) {
			tdxEventsIssuePlanMapper.updateByExampleSelective(tdxEventsIssuePlan, example);
		} else {
			tdxEventsIssuePlanMapper.insertSelective(tdxEventsIssuePlan);
		}
	}
}
