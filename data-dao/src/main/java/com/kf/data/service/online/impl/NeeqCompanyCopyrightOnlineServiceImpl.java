package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyCopyrightOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyCopyrightOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyCopyrightOnlineMapper;
import com.kf.data.service.online.NeeqCompanyCopyrightOnlineService;

/**
 * @Title: NeeqCompanyCopyrightOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午2:32:23
 * @version V1.0
 */
@Service
public class NeeqCompanyCopyrightOnlineServiceImpl implements NeeqCompanyCopyrightOnlineService {

	@Autowired
	NeeqCompanyCopyrightOnlineMapper neeqCompanyCopyrightOnlineMapper;

	@Override
	public List<NeeqCompanyCopyrightOnline> readNeeqCompanyCopyrightOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyCopyrightOnline> neeqCompanyCopyrightOnlines = null;
		NeeqCompanyCopyrightOnlineExample example = new NeeqCompanyCopyrightOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyCopyrightOnlines = neeqCompanyCopyrightOnlineMapper.selectByExample(example);
		if (neeqCompanyCopyrightOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyCopyrightOnlines = neeqCompanyCopyrightOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyCopyrightOnlines;
	}

}
