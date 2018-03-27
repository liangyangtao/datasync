package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqEventsInvestOnline;
import com.kf.data.mybatis.entity.online.NeeqEventsInvestOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqEventsInvestOnlineMapper;
import com.kf.data.service.online.NeeqEventsInvestOnlineService;

/**
 * @Title: NeeqEventsInvestOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 投资事件
 * @author: liangyt
 * @date: 2018年3月16日 上午11:49:09
 * @version V1.0
 */
@Service
public class NeeqEventsInvestOnlineServiceImpl implements NeeqEventsInvestOnlineService {
	@Autowired
	NeeqEventsInvestOnlineMapper neeqEventsInvestOnlineMapper;

	@Override
	public List<NeeqEventsInvestOnline> readNeeqEventsInvestOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqEventsInvestOnline> neeqEventsInvestOnlines = null;
		NeeqEventsInvestOnlineExample example = new NeeqEventsInvestOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqEventsInvestOnlines = neeqEventsInvestOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqEventsInvestOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqEventsInvestOnlines = neeqEventsInvestOnlineMapper.selectByExampleWithBLOBs(example);
			}
		}
		return neeqEventsInvestOnlines;
	}

}
