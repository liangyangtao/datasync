package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyMainStaffOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyMainStaffOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyMainStaffOnlineMapper;
import com.kf.data.service.online.NeeqCompanyMainStaffOnlineService;

/**
 * @Title: NeeqCompanyMainStaffOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午1:41:43
 * @version V1.0
 */
@Service
public class NeeqCompanyMainStaffOnlineServiceImpl implements NeeqCompanyMainStaffOnlineService {

	@Autowired
	NeeqCompanyMainStaffOnlineMapper neeqCompanyMainStaffOnlineMapper;

	@Override
	public List<NeeqCompanyMainStaffOnline> readNeeqCompanyMainStaffOnlines(TdxUpIndexOnline tdxUpIndexOnline) {

		List<NeeqCompanyMainStaffOnline> neeqCompanyMainStaffOnlines = null;
		NeeqCompanyMainStaffOnlineExample example = new NeeqCompanyMainStaffOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyMainStaffOnlines = neeqCompanyMainStaffOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqCompanyMainStaffOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyMainStaffOnlines = neeqCompanyMainStaffOnlineMapper.selectByExampleWithBLOBs(example);
			}
		}
		return neeqCompanyMainStaffOnlines;
	}
}
