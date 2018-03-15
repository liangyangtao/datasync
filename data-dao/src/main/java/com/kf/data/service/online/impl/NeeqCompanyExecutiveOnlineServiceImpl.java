package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyExecutiveOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyExecutiveOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyExecutiveOnlineMapper;
import com.kf.data.service.online.NeeqCompanyExecutiveOnlineService;

/**
 * @Title: NeeqCompanyExecutiveOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 公司高管
 * @author: liangyt
 * @date: 2018年3月14日 下午2:07:25
 * @version V1.0
 */
@Service
public class NeeqCompanyExecutiveOnlineServiceImpl implements NeeqCompanyExecutiveOnlineService {

	@Autowired
	NeeqCompanyExecutiveOnlineMapper neeqCompanyExecutiveOnlineMapper;

	@Override
	public List<NeeqCompanyExecutiveOnline> readNeeqCompanyExecutiveOnlines() {
		return null;
	}

	@Override
	public List<NeeqCompanyExecutiveOnline> readNeeqCompanyExecutiveOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyExecutiveOnline> neeqCompanyExecutiveOnlines = null;
		NeeqCompanyExecutiveOnlineExample example = new NeeqCompanyExecutiveOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyExecutiveOnlines = neeqCompanyExecutiveOnlineMapper.selectByExample(example);
		if (neeqCompanyExecutiveOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyExecutiveOnlines = neeqCompanyExecutiveOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyExecutiveOnlines;

	}

}
