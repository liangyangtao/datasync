package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyTagOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyTagOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyTagOnlineMapper;
import com.kf.data.service.online.NeeqCompanyTagOnlineService;

/**
 * @Title: NeeqCompanyTagOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 公司标签
 * @author: liangyt
 * @date: 2018年3月20日 下午6:53:47
 * @version V1.0
 */
@Service
public class NeeqCompanyTagOnlineServiceImpl implements NeeqCompanyTagOnlineService {

	@Autowired
	NeeqCompanyTagOnlineMapper neeqCompanyTagOnlineMapper;

	@Override
	public List<NeeqCompanyTagOnline> readNeeqCompanyTagOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyTagOnline> neeqCompanyTagOnlines = null;
		NeeqCompanyTagOnlineExample example = new NeeqCompanyTagOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyTagOnlines = neeqCompanyTagOnlineMapper.selectByExample(example);
		if (neeqCompanyTagOnlines.size() > 0) {
		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyTagOnlines = neeqCompanyTagOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyTagOnlines;
	}

}
