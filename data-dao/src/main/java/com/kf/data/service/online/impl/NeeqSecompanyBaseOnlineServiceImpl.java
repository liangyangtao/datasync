package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqSecompanyBaseOnline;
import com.kf.data.mybatis.entity.online.NeeqSecompanyBaseOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqSecompanyBaseOnlineMapper;
import com.kf.data.service.online.NeeqSecompanyBaseOnlineService;

/**
 * @Title: NeeqSecompanyBaseOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 主办券商
 * @author: liangyt
 * @date: 2018年3月22日 下午4:05:08
 * @version V1.0
 */
@Service
public class NeeqSecompanyBaseOnlineServiceImpl implements NeeqSecompanyBaseOnlineService {

	@Autowired
	NeeqSecompanyBaseOnlineMapper neeqSecompanyBaseOnlineMapper;

	@Override
	public List<NeeqSecompanyBaseOnline> readNeeqSecompanyBaseOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqSecompanyBaseOnline> neeqSecompanyBaseOnlines = null;
		NeeqSecompanyBaseOnlineExample example = new NeeqSecompanyBaseOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqSecompanyBaseOnlines = neeqSecompanyBaseOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqSecompanyBaseOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqSecompanyBaseOnlines = neeqSecompanyBaseOnlineMapper.selectByExampleWithBLOBs(example);
			}
		}
		return neeqSecompanyBaseOnlines;
	}

}
