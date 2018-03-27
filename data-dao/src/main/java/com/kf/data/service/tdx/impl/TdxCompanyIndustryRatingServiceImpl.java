package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyIndustryRating;
import com.kf.data.mybatis.entity.tdx.TdxCompanyIndustryRatingExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyIndustryRatingMapper;
import com.kf.data.service.tdx.TdxCompanyIndustryRatingService;

/**
 * @Title: TdxCompanyIndustryRatingServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 企业评级
 * @author: liangyt
 * @date: 2018年3月16日 上午10:33:06
 * @version V1.0
 */
@Service
public class TdxCompanyIndustryRatingServiceImpl implements TdxCompanyIndustryRatingService {

	@Autowired
	TdxCompanyIndustryRatingMapper tdxCompanyIndustryRatingMapper;

	@Override
	public void saveTdxCompanyIndustryRating(TdxCompanyIndustryRating tdxCompanyIndustryRating) {
		TdxCompanyIndustryRatingExample example = new TdxCompanyIndustryRatingExample();
		example.or().andCompanyIdEqualTo(tdxCompanyIndustryRating.getCompanyId())
				.andReportDateEqualTo(tdxCompanyIndustryRating.getReportDate())
				.andReportTitleEqualTo(tdxCompanyIndustryRating.getReportTitle())
				.andReporterNameEqualTo(tdxCompanyIndustryRating.getReporterName())
				.andResearchInstituteShortnameEqualTo(tdxCompanyIndustryRating.getResearchInstituteShortname());

		if (tdxCompanyIndustryRatingMapper.countByExample(example) > 0) {
			tdxCompanyIndustryRatingMapper.updateByExampleSelective(tdxCompanyIndustryRating, example);
		} else {
			tdxCompanyIndustryRatingMapper.insertSelective(tdxCompanyIndustryRating);
		}

	}
}
