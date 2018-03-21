package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyResearchStat;
import com.kf.data.mybatis.entity.tdx.TdxCompanyResearchStatExample;
import com.kf.data.mybatis.entity.tdx.TdxCompanyResearchStat;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyResearchStatMapper;
import com.kf.data.service.tdx.TdxCompanyResearchStatService;

/**  
 * @Title:  TdxCompanyResearchStatServiceImpl.java   
 * @Package com.kf.data.service.tdx.impl   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: liangyt    
 * @date:   2018年3月21日 下午3:16:02   
 * @version V1.0 
 */
@Service
public class TdxCompanyResearchStatServiceImpl implements TdxCompanyResearchStatService {

	@Autowired
	TdxCompanyResearchStatMapper tdxCompanyResearchStatMapper;

	@Override
	public void saveTdxCompanyResearchStat(TdxCompanyResearchStat tdxCompanyResearchStat) {
		TdxCompanyResearchStatExample example = new TdxCompanyResearchStatExample();
		example.or().andStockCodeEqualTo(tdxCompanyResearchStat.getStockCode())
				.andReportDateEqualTo(tdxCompanyResearchStat.getReportDate());
		if (tdxCompanyResearchStatMapper.countByExample(example) > 0) {
			tdxCompanyResearchStatMapper.updateByExampleSelective(tdxCompanyResearchStat, example);
		} else {
			tdxCompanyResearchStatMapper.insertSelective(tdxCompanyResearchStat);
		}
	}

}
