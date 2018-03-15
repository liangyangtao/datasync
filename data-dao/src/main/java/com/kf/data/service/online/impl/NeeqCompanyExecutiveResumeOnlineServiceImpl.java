package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyExecutiveResumeOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyExecutiveResumeOnlineExample;
import com.kf.data.mybatis.mapper.online.NeeqCompanyExecutiveResumeOnlineMapper;
import com.kf.data.service.online.NeeqCompanyExecutiveResumeOnlineService;

/**
 * @Title: NeeqCompanyExecutiveResumeOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 高管履历详情
 * @author: liangyt
 * @date: 2018年3月14日 下午5:15:00
 * @version V1.0
 */

@Service
public class NeeqCompanyExecutiveResumeOnlineServiceImpl implements NeeqCompanyExecutiveResumeOnlineService {

	@Autowired
	NeeqCompanyExecutiveResumeOnlineMapper neeqCompanyExecutiveResumeOnlineMapper;

	@Override
	public List<NeeqCompanyExecutiveResumeOnline> readNeeqCompanyExecutiveResumeOnlineById(String personId) {
		NeeqCompanyExecutiveResumeOnlineExample example = new NeeqCompanyExecutiveResumeOnlineExample();
		example.or().andPersonIdEqualTo(personId);
		return neeqCompanyExecutiveResumeOnlineMapper.selectByExampleWithBLOBs(example);
	}

}
