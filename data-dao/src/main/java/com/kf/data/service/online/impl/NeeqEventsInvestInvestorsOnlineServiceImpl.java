package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqEventsInvestInvestorsOnline;
import com.kf.data.mybatis.entity.online.NeeqEventsInvestInvestorsOnlineExample;
import com.kf.data.mybatis.mapper.online.NeeqEventsInvestInvestorsOnlineMapper;
import com.kf.data.service.online.NeeqEventsInvestInvestorsOnlineService;

/**
 * @Title: NeeqEventsInvestInvestorsOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 投资人
 * @author: liangyt
 * @date: 2018年3月21日 上午10:34:07
 * @version V1.0
 */
@Service
public class NeeqEventsInvestInvestorsOnlineServiceImpl implements NeeqEventsInvestInvestorsOnlineService {

	@Autowired
	NeeqEventsInvestInvestorsOnlineMapper neeqEventsInvestInvestorsOnlineMapper;

	@Override
	public List<NeeqEventsInvestInvestorsOnline> readNeeqEventsInvestInvestorsOnlinesByEventId(String eventId) {
		NeeqEventsInvestInvestorsOnlineExample example = new NeeqEventsInvestInvestorsOnlineExample();
		example.or().andEventIdEqualTo(eventId);
		return neeqEventsInvestInvestorsOnlineMapper.selectByExample(example);
	}

}
