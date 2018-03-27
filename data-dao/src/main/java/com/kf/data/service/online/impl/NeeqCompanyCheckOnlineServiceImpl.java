package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyCheckOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyCheckOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyCheckOnlineMapper;
import com.kf.data.service.online.NeeqCompanyCheckOnlineService;

/**
 * @Title: NeeqCompanyCheckOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 上午11:51:05
 * @version V1.0
 */
@Service
public class NeeqCompanyCheckOnlineServiceImpl implements NeeqCompanyCheckOnlineService {

	@Autowired
	NeeqCompanyCheckOnlineMapper neeqCompanyCheckOnlineMapper;

	@Override
	public List<NeeqCompanyCheckOnline> readNeeqCompanyCheckOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyCheckOnline> neeqCompanyCheckOnlines = null;
		NeeqCompanyCheckOnlineExample example = new NeeqCompanyCheckOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyCheckOnlines = neeqCompanyCheckOnlineMapper.selectByExample(example);
		if (neeqCompanyCheckOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyCheckOnlines = neeqCompanyCheckOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyCheckOnlines;
	}

}
