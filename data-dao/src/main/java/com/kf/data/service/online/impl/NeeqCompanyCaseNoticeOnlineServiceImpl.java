package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyCaseNoticeOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyCaseNoticeOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyCaseNoticeOnlineMapper;
import com.kf.data.service.online.NeeqCompanyCaseNoticeOnlineService;

/**
 * @Title: NeeqCompanyCaseNoticeOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 法院公告
 * @author: liangyt
 * @date: 2018年3月16日 下午3:50:07
 * @version V1.0
 */
@Service
public class NeeqCompanyCaseNoticeOnlineServiceImpl implements NeeqCompanyCaseNoticeOnlineService {

	@Autowired
	NeeqCompanyCaseNoticeOnlineMapper neeqCompanyCaseNoticeOnlineMapper;

	@Override
	public List<NeeqCompanyCaseNoticeOnline> readNeeqCompanyCaseNoticeOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyCaseNoticeOnline> neeqCompanyCaseNoticeOnlines = null;
		NeeqCompanyCaseNoticeOnlineExample example = new NeeqCompanyCaseNoticeOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyCaseNoticeOnlines = neeqCompanyCaseNoticeOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqCompanyCaseNoticeOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyCaseNoticeOnlines = neeqCompanyCaseNoticeOnlineMapper.selectByExampleWithBLOBs(example);
			}
		}
		return neeqCompanyCaseNoticeOnlines;
	}

}
