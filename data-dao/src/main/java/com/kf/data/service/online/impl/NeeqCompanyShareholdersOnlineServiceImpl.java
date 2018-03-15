package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyShareholdersOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyShareholdersOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyShareholdersOnlineMapper;
import com.kf.data.service.online.NeeqCompanyShareholdersOnlineService;

/**
 * @Title: NeeqCompanyShareholdersOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 股东
 * @author: liangyt
 * @date: 2018年3月15日 上午9:29:10
 * @version V1.0
 */
@Service
public class NeeqCompanyShareholdersOnlineServiceImpl implements NeeqCompanyShareholdersOnlineService {

	@Autowired
	NeeqCompanyShareholdersOnlineMapper neeqCompanyShareholdersOnlineMapper;

	@Override
	public List<NeeqCompanyShareholdersOnline> readNeeqCompanyShareholdersOnlines(TdxUpIndexOnline tdxUpIndexOnline) {

		List<NeeqCompanyShareholdersOnline> neeqCompanyShareholdersOnlines = null;
		NeeqCompanyShareholdersOnlineExample example = new NeeqCompanyShareholdersOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyShareholdersOnlines = neeqCompanyShareholdersOnlineMapper.selectByExample(example);
		if (neeqCompanyShareholdersOnlines.size() > 0) {
		} else {
			example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
			example.setOrderByClause("id asc limit 1");
			neeqCompanyShareholdersOnlines = neeqCompanyShareholdersOnlineMapper.selectByExample(example);
		}
		return neeqCompanyShareholdersOnlines;
	}

}
