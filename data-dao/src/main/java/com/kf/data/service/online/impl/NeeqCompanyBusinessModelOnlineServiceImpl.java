package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyBusinessModelOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyBusinessModelOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyBusinessModelOnlineMapper;
import com.kf.data.service.online.NeeqCompanyBusinessModelOnlineService;

/**
 * @Title: NeeqCompanyBusinessModelOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月15日 下午1:59:10
 * @version V1.0
 */
@Service
public class NeeqCompanyBusinessModelOnlineServiceImpl implements NeeqCompanyBusinessModelOnlineService {

	@Autowired
	NeeqCompanyBusinessModelOnlineMapper neeqCompanyBusinessModelOnlineMapper;

	@Override
	public List<NeeqCompanyBusinessModelOnline> readNeeqCompanyBusinessModelOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyBusinessModelOnline> neeqCompanyBusinessModelOnlines = null;
		NeeqCompanyBusinessModelOnlineExample example = new NeeqCompanyBusinessModelOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyBusinessModelOnlines = neeqCompanyBusinessModelOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqCompanyBusinessModelOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyBusinessModelOnlines = neeqCompanyBusinessModelOnlineMapper
						.selectByExampleWithBLOBs(example);
			}
		}
		return neeqCompanyBusinessModelOnlines;
	}

}
