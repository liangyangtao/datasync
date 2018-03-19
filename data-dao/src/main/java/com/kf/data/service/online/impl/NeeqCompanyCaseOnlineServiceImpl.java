package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyCaseOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyCaseOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyCaseOnlineMapper;
import com.kf.data.service.online.NeeqCompanyCaseOnlineService;

/**
 * @Title: NeeqCompanyCaseOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 法院公告
 * @author: liangyt
 * @date: 2018年3月16日 下午4:33:36
 * @version V1.0
 */
@Service
public class NeeqCompanyCaseOnlineServiceImpl implements NeeqCompanyCaseOnlineService {

	@Autowired
	NeeqCompanyCaseOnlineMapper neeqCompanyCaseOnlineMapper;

	@Override
	public List<NeeqCompanyCaseOnline> readNeeqCompanyCaseOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyCaseOnline> neeqCompanyCaseOnlines = null;
		NeeqCompanyCaseOnlineExample example = new NeeqCompanyCaseOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyCaseOnlines = neeqCompanyCaseOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqCompanyCaseOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyCaseOnlines = neeqCompanyCaseOnlineMapper.selectByExampleWithBLOBs(example);
			}
		}
		return neeqCompanyCaseOnlines;
	}

}
