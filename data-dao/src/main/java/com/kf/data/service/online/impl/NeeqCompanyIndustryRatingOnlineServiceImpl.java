package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyIndustryRatingOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyIndustryRatingOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyIndustryRatingOnlineMapper;
import com.kf.data.service.online.NeeqCompanyIndustryRatingOnlineService;

/**
 * @Title: NeeqCompanyIndustryRatingServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 企业评级
 * @author: liangyt
 * @date: 2018年3月16日 上午10:38:14
 * @version V1.0
 */
@Service
public class NeeqCompanyIndustryRatingOnlineServiceImpl implements NeeqCompanyIndustryRatingOnlineService {
	@Autowired
	NeeqCompanyIndustryRatingOnlineMapper neeqCompanyIndustryRatingOnlineMapper;

	@Override
	public List<NeeqCompanyIndustryRatingOnline> readNeeqCompanyIndustryRatingOnlines(
			TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyIndustryRatingOnline> neeqCompanyIndustryRatingOnlines = null;
		NeeqCompanyIndustryRatingOnlineExample example = new NeeqCompanyIndustryRatingOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyIndustryRatingOnlines = neeqCompanyIndustryRatingOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqCompanyIndustryRatingOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyIndustryRatingOnlines = neeqCompanyIndustryRatingOnlineMapper
						.selectByExampleWithBLOBs(example);
			}
		}
		return neeqCompanyIndustryRatingOnlines;
	}
}
