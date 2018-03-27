package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyBondFinancingOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyBondFinancingOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyBondFinancingOnlineMapper;
import com.kf.data.service.online.NeeqCompanyBondFinancingOnlineService;

/**
 * @Title: NeeqCompanyBondFinancingOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午1:32:16
 * @version V1.0
 */
@Service
public class NeeqCompanyBondFinancingOnlineServiceImpl implements NeeqCompanyBondFinancingOnlineService {

	@Autowired
	NeeqCompanyBondFinancingOnlineMapper neeqCompanyBondFinancingOnlineMapper;

	@Override
	public List<NeeqCompanyBondFinancingOnline> readNeeqCompanyBondFinancingOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyBondFinancingOnline> neeqCompanyBondFinancingOnlines = null;
		NeeqCompanyBondFinancingOnlineExample example = new NeeqCompanyBondFinancingOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyBondFinancingOnlines = neeqCompanyBondFinancingOnlineMapper.selectByExample(example);
		if (neeqCompanyBondFinancingOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyBondFinancingOnlines = neeqCompanyBondFinancingOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyBondFinancingOnlines;
	}

}
