package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqSecompanyPunishOnline;
import com.kf.data.mybatis.entity.online.NeeqSecompanyPunishOnlineExample;
import com.kf.data.mybatis.mapper.online.NeeqSecompanyPunishOnlineMapper;
import com.kf.data.service.online.NeeqSecompanyPunishOnlineService;

/**
 * @Title: NeeqSecompanyPunishOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 上午11:25:02
 * @version V1.0
 */
@Service
public class NeeqSecompanyPunishOnlineServiceImpl implements NeeqSecompanyPunishOnlineService {

	@Autowired
	NeeqSecompanyPunishOnlineMapper neeqSecompanyPunishOnlineMapper;

	@Override
	public List<NeeqSecompanyPunishOnline> readNeeqSecompanyPunishOnlineByCompanyId(String companyId) {
		NeeqSecompanyPunishOnlineExample example = new NeeqSecompanyPunishOnlineExample();
		example.or().andSecompanyIdEqualTo(companyId);
		return neeqSecompanyPunishOnlineMapper.selectByExample(example);
	}

}
