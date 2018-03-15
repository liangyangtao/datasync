package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyBusinessIncomeOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyBusinessIncomeOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyBusinessIncomeOnlineMapper;
import com.kf.data.service.online.NeeqCompanyBusinessIncomeOnlineService;

/**
 * @Title: NeeqCompanyBusinessIncomeOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月15日 下午2:00:56
 * @version V1.0
 */
@Service
public class NeeqCompanyBusinessIncomeOnlineServiceImpl implements NeeqCompanyBusinessIncomeOnlineService {

	@Autowired
	NeeqCompanyBusinessIncomeOnlineMapper neeqCompanyBusinessIncomeOnlineMapper;

	@Override
	public List<NeeqCompanyBusinessIncomeOnline> readNeeqCompanyBusinessIncomeOnlines(
			TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyBusinessIncomeOnline> neeqCompanyBusinessIncomeOnlines = null;
		NeeqCompanyBusinessIncomeOnlineExample example = new NeeqCompanyBusinessIncomeOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyBusinessIncomeOnlines = neeqCompanyBusinessIncomeOnlineMapper.selectByExample(example);
		if (neeqCompanyBusinessIncomeOnlines.size() > 0) {

		} else {
			example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
			example.setOrderByClause("id asc limit 1");
			neeqCompanyBusinessIncomeOnlines = neeqCompanyBusinessIncomeOnlineMapper.selectByExample(example);
		}
		return neeqCompanyBusinessIncomeOnlines;
	}

}
