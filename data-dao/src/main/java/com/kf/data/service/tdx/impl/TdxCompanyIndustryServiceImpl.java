package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyIndustry;
import com.kf.data.mybatis.entity.tdx.TdxCompanyIndustryExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyIndustryMapper;
import com.kf.data.service.tdx.TdxCompanyIndustryService;

/**
 * @Title: TdxCompanyIndustryServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 公司行业
 * @author: liangyt
 * @date: 2018年3月20日 下午5:42:21
 * @version V1.0
 */
@Service
public class TdxCompanyIndustryServiceImpl implements TdxCompanyIndustryService {

	@Autowired
	TdxCompanyIndustryMapper tdxCompanyIndustryMapper;

	@Override
	public void saveTdxCompanyIndustry(TdxCompanyIndustry tdxCompanyIndustry) {
		TdxCompanyIndustryExample example = new TdxCompanyIndustryExample();
		example.or().andCompanyIdEqualTo(tdxCompanyIndustry.getCompanyId())
				.andIndustryNameEqualTo(tdxCompanyIndustry.getIndustryName());
		if (tdxCompanyIndustryMapper.countByExample(example) > 0) {
			tdxCompanyIndustryMapper.updateByExampleSelective(tdxCompanyIndustry, example);
		} else {
			tdxCompanyIndustryMapper.insertSelective(tdxCompanyIndustry);
		}

	}
}
