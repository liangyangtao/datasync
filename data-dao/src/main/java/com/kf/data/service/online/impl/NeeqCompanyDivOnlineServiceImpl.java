package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyDivOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyDivOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyDivOnlineMapper;
import com.kf.data.service.online.NeeqCompanyDivOnlineService;

/**
 * @Title: NeeqCompanyDivOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 分红
 * @author: liangyt
 * @date: 2018年3月15日 上午10:48:33
 * @version V1.0
 */
@Service
public class NeeqCompanyDivOnlineServiceImpl implements NeeqCompanyDivOnlineService {

	@Autowired
	NeeqCompanyDivOnlineMapper neeqCompanyDivOnlineMapper;

	@Override
	public List<NeeqCompanyDivOnline> readNeeqCompanyDivOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyDivOnline> neeqCompanyDivOnlines = null;
		NeeqCompanyDivOnlineExample example = new NeeqCompanyDivOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyDivOnlines = neeqCompanyDivOnlineMapper.selectByExample(example);
		if (neeqCompanyDivOnlines.size() > 0) {
		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyDivOnlines = neeqCompanyDivOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyDivOnlines;
	}

}
