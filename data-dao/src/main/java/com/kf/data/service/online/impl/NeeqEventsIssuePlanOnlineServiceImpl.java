package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqEventsIssuePlanOnline;
import com.kf.data.mybatis.entity.online.NeeqEventsIssuePlanOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqEventsIssuePlanOnlineMapper;
import com.kf.data.service.online.NeeqEventsIssuePlanOnlineService;

/**
 * @Title: NeeqEventsIssuePlanOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 增发
 * @author: liangyt
 * @date: 2018年3月15日 上午11:00:45
 * @version V1.0
 */
@Service
public class NeeqEventsIssuePlanOnlineServiceImpl implements NeeqEventsIssuePlanOnlineService {

	@Autowired
	NeeqEventsIssuePlanOnlineMapper neeqEventsIssuePlanOnlineMapper;

	@Override
	public List<NeeqEventsIssuePlanOnline> readNeeqEventsIssuePlanOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqEventsIssuePlanOnline> neeqEventsIssuePlanOnlines = null;
		NeeqEventsIssuePlanOnlineExample example = new NeeqEventsIssuePlanOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqEventsIssuePlanOnlines = neeqEventsIssuePlanOnlineMapper.selectByExample(example);
		if (neeqEventsIssuePlanOnlines.size() > 0) {

		} else {
			example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
			example.setOrderByClause("id asc limit 1");
			neeqEventsIssuePlanOnlines = neeqEventsIssuePlanOnlineMapper.selectByExample(example);
		}
		return neeqEventsIssuePlanOnlines;
	}

}
