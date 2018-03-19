package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqNoticeRiskTipsOnline;
import com.kf.data.mybatis.entity.online.NeeqNoticeRiskTipsOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqNoticeRiskTipsOnlineMapper;
import com.kf.data.service.online.NeeqNoticeRiskTipsOnlineService;

/**
 * @Title: NeeqNoticeRiskTipsOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 风险提示
 * @author: liangyt
 * @date: 2018年3月16日 下午1:57:00
 * @version V1.0
 */
@Service
public class NeeqNoticeRiskTipsOnlineServiceImpl implements NeeqNoticeRiskTipsOnlineService {

	@Autowired
	NeeqNoticeRiskTipsOnlineMapper neeqNoticeRiskTipsOnlineMapper;

	@Override
	public List<NeeqNoticeRiskTipsOnline> readNeeqNoticeRiskTipsOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqNoticeRiskTipsOnline> neeqNoticeRiskTipsOnlines = null;
		NeeqNoticeRiskTipsOnlineExample example = new NeeqNoticeRiskTipsOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqNoticeRiskTipsOnlines = neeqNoticeRiskTipsOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqNoticeRiskTipsOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqNoticeRiskTipsOnlines = neeqNoticeRiskTipsOnlineMapper.selectByExampleWithBLOBs(example);
			}
		}
		return neeqNoticeRiskTipsOnlines;
	}

}
