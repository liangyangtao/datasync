package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyTaxArrearsOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyTaxArrearsOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyTaxArrearsOnlineMapper;
import com.kf.data.service.online.NeeqCompanyTaxArrearsOnlineService;

/**
 * @Title: NeeqCompanyTaxArrearsOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 欠税公告
 * @author: liangyt
 * @date: 2018年3月22日 上午10:05:31
 * @version V1.0
 */
@Service
public class NeeqCompanyTaxArrearsOnlineServiceImpl implements NeeqCompanyTaxArrearsOnlineService {

	@Autowired
	NeeqCompanyTaxArrearsOnlineMapper neeqCompanyTaxArrearsOnlineMapper;

	@Override
	public List<NeeqCompanyTaxArrearsOnline> readNeeqCompanyTaxArrearsOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyTaxArrearsOnline> neeqCompanyTaxArrearsOnlines = null;
		NeeqCompanyTaxArrearsOnlineExample example = new NeeqCompanyTaxArrearsOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyTaxArrearsOnlines = neeqCompanyTaxArrearsOnlineMapper.selectByExample(example);
		if (neeqCompanyTaxArrearsOnlines.size() > 0) {
		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyTaxArrearsOnlines = neeqCompanyTaxArrearsOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyTaxArrearsOnlines;
	}

}
