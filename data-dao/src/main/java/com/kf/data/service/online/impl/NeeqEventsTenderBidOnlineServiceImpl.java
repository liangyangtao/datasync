package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqEventsTenderBidOnline;
import com.kf.data.mybatis.entity.online.NeeqEventsTenderBidOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqEventsTenderBidOnlineMapper;
import com.kf.data.service.online.NeeqEventsTenderBidOnlineService;

/**
 * @Title: NeeqEventsTenderBidOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午1:45:42
 * @version V1.0
 */
@Service
public class NeeqEventsTenderBidOnlineServiceImpl implements NeeqEventsTenderBidOnlineService {

	@Autowired
	NeeqEventsTenderBidOnlineMapper neeqEventsTenderBidOnlineMapper;

	@Override
	public List<NeeqEventsTenderBidOnline> readNeeqEventsTenderBidOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqEventsTenderBidOnline> neeqEventsTenderBidOnlines = null;
		NeeqEventsTenderBidOnlineExample example = new NeeqEventsTenderBidOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 10");
		neeqEventsTenderBidOnlines = neeqEventsTenderBidOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqEventsTenderBidOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqEventsTenderBidOnlines = neeqEventsTenderBidOnlineMapper.selectByExampleWithBLOBs(example);
			}
		}
		return neeqEventsTenderBidOnlines;
	}

}
