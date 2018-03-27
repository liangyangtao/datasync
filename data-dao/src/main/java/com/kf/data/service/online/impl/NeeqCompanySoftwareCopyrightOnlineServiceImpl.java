package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanySoftwareCopyrightOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanySoftwareCopyrightOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanySoftwareCopyrightOnlineMapper;
import com.kf.data.service.online.NeeqCompanySoftwareCopyrightOnlineService;

/**
 * @Title: NeeqCompanySoftwareCopyrightOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午2:35:07
 * @version V1.0
 */
@Service
public class NeeqCompanySoftwareCopyrightOnlineServiceImpl implements NeeqCompanySoftwareCopyrightOnlineService {

	@Autowired
	NeeqCompanySoftwareCopyrightOnlineMapper neeqCompanySoftwareCopyrightOnlineMapper;

	@Override
	public List<NeeqCompanySoftwareCopyrightOnline> readNeeqCompanySoftwareCopyrightOnlines(
			TdxUpIndexOnline tdxUpIndexOnline) {

		List<NeeqCompanySoftwareCopyrightOnline> neeqCompanySoftwareCopyrightOnlines = null;
		NeeqCompanySoftwareCopyrightOnlineExample example = new NeeqCompanySoftwareCopyrightOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanySoftwareCopyrightOnlines = neeqCompanySoftwareCopyrightOnlineMapper.selectByExample(example);
		if (neeqCompanySoftwareCopyrightOnlines.size() > 0) {
		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanySoftwareCopyrightOnlines = neeqCompanySoftwareCopyrightOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanySoftwareCopyrightOnlines;
	}

}
