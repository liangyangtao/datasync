package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqSecompanyMarketMakingHisOnline;
import com.kf.data.mybatis.entity.online.NeeqSecompanyMarketMakingHisOnlineExample;
import com.kf.data.mybatis.mapper.online.NeeqSecompanyMarketMakingHisOnlineMapper;
import com.kf.data.service.online.NeeqSecompanyMarketMakingHisOnlineService;

/**
 * @Title: NeeqSecompanyMarketMakingHisOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 上午11:20:30
 * @version V1.0
 */
@Service
public class NeeqSecompanyMarketMakingHisOnlineServiceImpl implements NeeqSecompanyMarketMakingHisOnlineService {

	@Autowired
	NeeqSecompanyMarketMakingHisOnlineMapper neeqSecompanyMarketMakingHisOnlineMapper;

	@Override
	public List<NeeqSecompanyMarketMakingHisOnline> readNeeqSecompanyMarketMakingHisOnlinesByCompanyId(
			String companyId) {
		NeeqSecompanyMarketMakingHisOnlineExample example = new NeeqSecompanyMarketMakingHisOnlineExample();
		example.or().andSecompanyIdEqualTo(companyId);
		return neeqSecompanyMarketMakingHisOnlineMapper.selectByExample(example);
	}

}
