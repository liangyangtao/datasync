package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyTaxRating;
import com.kf.data.mybatis.entity.tdx.TdxCompanyTaxRatingExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyTaxRatingMapper;
import com.kf.data.service.tdx.TdxCompanyTaxRatingService;

/**
 * @Title: TdxCompanyTaxRatingServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午2:59:36
 * @version V1.0
 */
@Service
public class TdxCompanyTaxRatingServiceImpl implements TdxCompanyTaxRatingService {

	@Autowired
	TdxCompanyTaxRatingMapper tdxCompanyTaxRatingMapper;

	@Override
	public void saveTdxCompanyTaxRating(TdxCompanyTaxRating tdxCompanyTaxRating) {
		TdxCompanyTaxRatingExample example = new TdxCompanyTaxRatingExample();
		example.or().andCompanyIdEqualTo(tdxCompanyTaxRating.getCompanyId())
				.andRatingYearEqualTo(tdxCompanyTaxRating.getRatingYear());
		if (tdxCompanyTaxRatingMapper.countByExample(example) > 0) {
			tdxCompanyTaxRatingMapper.updateByExampleSelective(tdxCompanyTaxRating, example);
		} else {
			tdxCompanyTaxRatingMapper.insertSelective(tdxCompanyTaxRating);
		}
	}

}
