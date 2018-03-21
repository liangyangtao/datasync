package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyTrademarkOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyTrademarkOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyTrademarkOnlineMapper;
import com.kf.data.service.online.NeeqCompanyTrademarkOnlineService;

/**
 * @Title: NeeqCompanyTrademarkOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午2:29:30
 * @version V1.0
 */
@Service
public class NeeqCompanyTrademarkOnlineServiceImpl implements NeeqCompanyTrademarkOnlineService {
	@Autowired
	NeeqCompanyTrademarkOnlineMapper neeqCompanyTrademarkOnlineMapper;

	@Override
	public List<NeeqCompanyTrademarkOnline> readNeeqCompanyTrademarkOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyTrademarkOnline> neeqCompanyTrademarkOnlines = null;
		NeeqCompanyTrademarkOnlineExample example = new NeeqCompanyTrademarkOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyTrademarkOnlines = neeqCompanyTrademarkOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqCompanyTrademarkOnlines.size() > 0) {
		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyTrademarkOnlines = neeqCompanyTrademarkOnlineMapper.selectByExampleWithBLOBs(example);
			}
		}
		return neeqCompanyTrademarkOnlines;
	}

}
