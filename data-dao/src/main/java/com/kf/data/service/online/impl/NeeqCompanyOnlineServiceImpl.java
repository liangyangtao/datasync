package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kf.data.mybatis.entity.online.NeeqCompanyOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyOnlineMapper;
import com.kf.data.service.online.NeeqCompanyOnlineService;

/**
 * @Title: NeeqCompanyOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 公司基本信息
 * @author: liangyt
 * @date: 2018年3月19日 上午10:02:35
 * @version V1.0
 */
public class NeeqCompanyOnlineServiceImpl implements NeeqCompanyOnlineService {

	@Autowired
	NeeqCompanyOnlineMapper neeqCompanyOnlineMapper;

	@Override
	public List<NeeqCompanyOnline> readNeeqCompanyOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyOnline> neeqCompanyOnlines = null;
		NeeqCompanyOnlineExample example = new NeeqCompanyOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyOnlines = neeqCompanyOnlineMapper.selectByExample(example);
		if (neeqCompanyOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyOnlines = neeqCompanyOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyOnlines;
	}

}
