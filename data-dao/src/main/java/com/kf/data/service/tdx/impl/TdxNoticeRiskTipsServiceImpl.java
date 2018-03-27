package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxNoticeRiskTips;
import com.kf.data.mybatis.entity.tdx.TdxNoticeRiskTipsExample;
import com.kf.data.mybatis.mapper.tdx.TdxNoticeRiskTipsMapper;
import com.kf.data.service.tdx.TdxNoticeRiskTipsService;

/**
 * @Title: TdxNoticeRiskTipsServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 风险提示
 * @author: liangyt
 * @date: 2018年3月16日 下午2:07:05
 * @version V1.0
 */
@Service
public class TdxNoticeRiskTipsServiceImpl implements TdxNoticeRiskTipsService {

	@Autowired
	TdxNoticeRiskTipsMapper tdxNoticeRiskTipsMapper;

	@Override
	public void saveTdxNoticeRiskTips(TdxNoticeRiskTips tdxNoticeRiskTips) {
		TdxNoticeRiskTipsExample example = new TdxNoticeRiskTipsExample();
		example.or().andCompanyIdEqualTo(tdxNoticeRiskTips.getCompanyId())
				.andReportDateEqualTo(tdxNoticeRiskTips.getReportDate())
				.andRiskNameEqualTo(tdxNoticeRiskTips.getRiskName());
		if (tdxNoticeRiskTipsMapper.countByExample(example) > 0) {
			tdxNoticeRiskTipsMapper.updateByExampleSelective(tdxNoticeRiskTips, example);
		} else {
			tdxNoticeRiskTipsMapper.insertSelective(tdxNoticeRiskTips);
		}
	}

}
