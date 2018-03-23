package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqNoticeOnline;
import com.kf.data.mybatis.entity.online.NeeqNoticeOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqNoticeOnlineMapper;
import com.kf.data.service.online.NeeqNoticeOnlineService;

/**
 * @Title: NeeqNoticeOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 公告
 * @author: liangyt
 * @date: 2018年3月23日 下午2:42:31
 * @version V1.0
 */
@Service
public class NeeqNoticeOnlineServiceImpl implements NeeqNoticeOnlineService {

	@Autowired
	NeeqNoticeOnlineMapper neeqNoticeOnlineMapper;

	@Override
	public List<NeeqNoticeOnline> readNeeqNoticeOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqNoticeOnline> neeqNoticeOnlines = null;
		NeeqNoticeOnlineExample example = new NeeqNoticeOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqNoticeOnlines = neeqNoticeOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqNoticeOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqNoticeOnlines = neeqNoticeOnlineMapper.selectByExampleWithBLOBs(example);
			}
		}
		return neeqNoticeOnlines;
	}

}
