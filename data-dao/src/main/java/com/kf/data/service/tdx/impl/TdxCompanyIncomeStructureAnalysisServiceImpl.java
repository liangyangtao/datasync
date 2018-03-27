package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyIncomeStructureAnalysis;
import com.kf.data.mybatis.entity.tdx.TdxCompanyIncomeStructureAnalysisExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyIncomeStructureAnalysisMapper;
import com.kf.data.service.tdx.TdxCompanyIncomeStructureAnalysisService;

/**
 * @Title: TdxCompanyIncomeStructureAnalysisServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月27日 上午10:16:43
 * @version V1.0
 */
@Service
public class TdxCompanyIncomeStructureAnalysisServiceImpl implements TdxCompanyIncomeStructureAnalysisService {

	@Autowired
	TdxCompanyIncomeStructureAnalysisMapper tdxCompanyIncomeStructureAnalysisMapper;

	@Override
	public void saveTdxCompanyIncomeStructureAnalysis(
			TdxCompanyIncomeStructureAnalysis tdxCompanyIncomeStructureAnalysis) {
		TdxCompanyIncomeStructureAnalysisExample example = new TdxCompanyIncomeStructureAnalysisExample();
		example.or().andCompanyIdEqualTo(tdxCompanyIncomeStructureAnalysis.getCompanyId())
				.andReportDateEqualTo(tdxCompanyIncomeStructureAnalysis.getReportDate())
				.andCategoryEqualTo(tdxCompanyIncomeStructureAnalysis.getCategory());
		if (tdxCompanyIncomeStructureAnalysisMapper.countByExample(example) > 0) {
			tdxCompanyIncomeStructureAnalysisMapper.updateByExampleSelective(tdxCompanyIncomeStructureAnalysis,
					example);	
		} else {
			tdxCompanyIncomeStructureAnalysisMapper.insertSelective(tdxCompanyIncomeStructureAnalysis);
		}
	}

}
