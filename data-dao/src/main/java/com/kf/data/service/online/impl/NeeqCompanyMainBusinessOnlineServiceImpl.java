package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyMainBusinessOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyMainBusinessOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyMainBusinessOnlineMapper;
import com.kf.data.service.online.NeeqCompanyMainBusinessOnlineService;

/**
 * @Title: NeeqCompanyMainBusinessOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 主营业务
 * @author: liangyt
 * @date: 2018年3月15日 下午6:43:32
 * @version V1.0
 */
@Service
public class NeeqCompanyMainBusinessOnlineServiceImpl implements NeeqCompanyMainBusinessOnlineService {

	@Autowired
	NeeqCompanyMainBusinessOnlineMapper neeqCompanyMainBusinessOnlineMapper;

	@Override
	public List<NeeqCompanyMainBusinessOnline> readNeeqCompanyMainBusinessOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyMainBusinessOnline> neeqCompanyMainBusinessOnlines = null;
		NeeqCompanyMainBusinessOnlineExample example = new NeeqCompanyMainBusinessOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyMainBusinessOnlines = neeqCompanyMainBusinessOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqCompanyMainBusinessOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyMainBusinessOnlines = neeqCompanyMainBusinessOnlineMapper.selectByExampleWithBLOBs(example);
			}
		}
		return neeqCompanyMainBusinessOnlines;
	}

}
