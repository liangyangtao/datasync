package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqEventsIssueEffectOnline;
import com.kf.data.mybatis.entity.online.NeeqEventsIssueEffectOnlineExample;
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

}
