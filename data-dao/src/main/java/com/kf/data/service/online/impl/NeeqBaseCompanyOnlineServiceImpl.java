package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqBaseCompanyOnline;
import com.kf.data.mybatis.entity.online.NeeqBaseCompanyOnlineExample;
import com.kf.data.mybatis.mapper.online.NeeqBaseCompanyOnlineMapper;
import com.kf.data.service.online.NeeqBaseCompanyOnlineService;

/**
 * @Title: NeeqBaseCompanyOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 公司基本信息
 * @author: liangyt
 * @date: 2018年3月20日 下午6:14:44
 * @version V1.0
 */
@Service
public class NeeqBaseCompanyOnlineServiceImpl implements NeeqBaseCompanyOnlineService {

	@Autowired
	NeeqBaseCompanyOnlineMapper neeqBaseCompanyOnlineMapper;

	@Override
	public List<NeeqBaseCompanyOnline> readNeeqBaseCompanyOnlinesByCompanyId(String companyId) {
		NeeqBaseCompanyOnlineExample example = new NeeqBaseCompanyOnlineExample();
		example.or().andCompanyIdEqualTo(companyId);
		example.setOrderByClause("id desc limit 1");
		return neeqBaseCompanyOnlineMapper.selectByExampleWithBLOBs(example);
	}

}
