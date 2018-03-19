package com.kf.data.service.online.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqNoticeRiskTipsChgOnline;
import com.kf.data.mybatis.entity.online.NeeqNoticeRiskTipsChgOnlineExample;
import com.kf.data.mybatis.mapper.online.NeeqNoticeRiskTipsChgOnlineMapper;
import com.kf.data.service.online.NeeqNoticeRiskTipsChgOnlineService;

/**
 * @Title: NeeqNoticeRiskTipsChgOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 风险是否发生变化
 * @author: liangyt
 * @date: 2018年3月16日 下午2:18:46
 * @version V1.0
 */
@Service
public class NeeqNoticeRiskTipsChgOnlineServiceImpl implements NeeqNoticeRiskTipsChgOnlineService {

	@Autowired
	NeeqNoticeRiskTipsChgOnlineMapper neeqNoticeRiskTipsChgOnlineMapper;

	@Override
	public List<NeeqNoticeRiskTipsChgOnline> readNeeqNoticeRiskTipsChgOnlineByIdAndDate(String companyId,
			Date reportDate) {
		NeeqNoticeRiskTipsChgOnlineExample example = new NeeqNoticeRiskTipsChgOnlineExample();
		example.or().andCompanyIdEqualTo(companyId).andDtTipsEqualTo(reportDate);
		return neeqNoticeRiskTipsChgOnlineMapper.selectByExample(example);
	}

}
