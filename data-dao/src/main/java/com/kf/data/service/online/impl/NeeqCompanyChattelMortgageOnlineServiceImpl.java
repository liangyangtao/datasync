package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyChattelMortgageOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyChattelMortgageOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyChattelMortgageOnlineMapper;
import com.kf.data.service.online.NeeqCompanyChattelMortgageOnlineService;

/**
 * @Title: NeeqCompanyChattelMortgageOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 动产抵押
 * @author: liangyt
 * @date: 2018年3月16日 下午4:02:21
 * @version V1.0
 */
@Service
public class NeeqCompanyChattelMortgageOnlineServiceImpl implements NeeqCompanyChattelMortgageOnlineService {

	@Autowired
	NeeqCompanyChattelMortgageOnlineMapper neeqCompanyChattelMortgageOnlineMapper;

	@Override
	public List<NeeqCompanyChattelMortgageOnline> readNeeqCompanyChattelMortgageOnlines(
			TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyChattelMortgageOnline> neeqCompanyChattelMortgageOnlines = null;
		NeeqCompanyChattelMortgageOnlineExample example = new NeeqCompanyChattelMortgageOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyChattelMortgageOnlines = neeqCompanyChattelMortgageOnlineMapper.selectByExample(example);
		if (neeqCompanyChattelMortgageOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyChattelMortgageOnlines = neeqCompanyChattelMortgageOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyChattelMortgageOnlines;
	}

}
