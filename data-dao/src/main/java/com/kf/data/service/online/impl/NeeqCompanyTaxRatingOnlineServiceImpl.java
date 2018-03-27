package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyTaxRatingOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyTaxRatingOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyTaxRatingOnlineMapper;
import com.kf.data.service.online.NeeqCompanyTaxRatingOnlineService;

/**
 * @Title: NeeqCompanyTaxRatingOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午1:36:03
 * @version V1.0
 */
@Service
public class NeeqCompanyTaxRatingOnlineServiceImpl implements NeeqCompanyTaxRatingOnlineService {

	@Autowired
	NeeqCompanyTaxRatingOnlineMapper neeqCompanyTaxRatingOnlineMapper;

	@Override
	public List<NeeqCompanyTaxRatingOnline> readNeeqCompanyTaxRatingOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyTaxRatingOnline> neeqCompanyTaxRatingOnlines = null;
		NeeqCompanyTaxRatingOnlineExample example = new NeeqCompanyTaxRatingOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyTaxRatingOnlines = neeqCompanyTaxRatingOnlineMapper.selectByExample(example);
		if (neeqCompanyTaxRatingOnlines.size() > 0) {
		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyTaxRatingOnlines = neeqCompanyTaxRatingOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyTaxRatingOnlines;
	}

}
