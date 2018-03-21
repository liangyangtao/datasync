package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqEventsIssueEffectOnline;
import com.kf.data.mybatis.entity.online.NeeqEventsIssueEffectOnlineExample;
import com.kf.data.mybatis.entity.online.NeeqEventsIssueEffectOnline;
import com.kf.data.mybatis.entity.online.NeeqEventsIssueEffectOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqEventsIssueEffectOnlineMapper;
import com.kf.data.service.online.NeeqEventsIssueEffectOnlineService;

/**
 * @Title: NeeqEventsIssueEffectOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description:
 * @author: liangyt
 * @date: 2018年3月15日 下午4:45:02
 * @version V1.0
 */
@Service
public class NeeqEventsIssueEffectOnlineServiceImpl implements NeeqEventsIssueEffectOnlineService {

	@Autowired
	NeeqEventsIssueEffectOnlineMapper neeqEventsIssueEffectOnlineMapper;

	@Override
	public List<NeeqEventsIssueEffectOnline> readNeeqEventsIssueEffectOnlineByid(String eventsId) {
		NeeqEventsIssueEffectOnlineExample example = new NeeqEventsIssueEffectOnlineExample();
		example.or().andEventsIdEqualTo(eventsId);
		return neeqEventsIssueEffectOnlineMapper.selectByExample(example);
	}

	@Override
	public List<NeeqEventsIssueEffectOnline> readNeeqEventsIssueEffectOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqEventsIssueEffectOnline> neeqEventsIssueEffectOnlines = null;
		NeeqEventsIssueEffectOnlineExample example = new NeeqEventsIssueEffectOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqEventsIssueEffectOnlines = neeqEventsIssueEffectOnlineMapper.selectByExample(example);
		if (neeqEventsIssueEffectOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqEventsIssueEffectOnlines = neeqEventsIssueEffectOnlineMapper.selectByExample(example);
			}
		}
		return neeqEventsIssueEffectOnlines;
	}

}
