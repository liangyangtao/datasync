package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyCorestaffOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyCorestaffOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyCorestaffOnlineMapper;
import com.kf.data.service.online.NeeqCompanyCorestaffOnlineService;

/**
 * @Title: NeeqCompanyCorestaffOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月15日 下午4:17:06
 * @version V1.0
 */
@Service
public class NeeqCompanyCorestaffOnlineServiceImpl implements NeeqCompanyCorestaffOnlineService {

	@Autowired
	NeeqCompanyCorestaffOnlineMapper neeqCompanyCorestaffOnlineMapper;

	@Override
	public List<NeeqCompanyCorestaffOnline> readNeeqCompanyCorestaffOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyCorestaffOnline> neeqCompanyCorestaffOnlines = null;
		NeeqCompanyCorestaffOnlineExample example = new NeeqCompanyCorestaffOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyCorestaffOnlines = neeqCompanyCorestaffOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqCompanyCorestaffOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyCorestaffOnlines = neeqCompanyCorestaffOnlineMapper.selectByExampleWithBLOBs(example);
			}
		}
		return neeqCompanyCorestaffOnlines;
	}

}
