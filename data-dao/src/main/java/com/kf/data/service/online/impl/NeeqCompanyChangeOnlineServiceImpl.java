package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyChangeOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyChangeOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyChangeOnlineMapper;
import com.kf.data.service.online.NeeqCompanyChangeOnlineService;

/**
 * @Title: NeeqCompanyChangeOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 变更信息
 * @author: liangyt
 * @date: 2018年3月15日 下午2:03:48
 * @version V1.0
 */
@Service
public class NeeqCompanyChangeOnlineServiceImpl implements NeeqCompanyChangeOnlineService {

	@Autowired
	NeeqCompanyChangeOnlineMapper neeqCompanyChangeOnlineMapper;

	@Override
	public List<NeeqCompanyChangeOnline> readNeeqCompanyChangeOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyChangeOnline> neeqCompanyChangeOnlines = null;
		NeeqCompanyChangeOnlineExample example = new NeeqCompanyChangeOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyChangeOnlines = neeqCompanyChangeOnlineMapper.selectByExample(example);
		if (neeqCompanyChangeOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyChangeOnlines = neeqCompanyChangeOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyChangeOnlines;
	}

}
