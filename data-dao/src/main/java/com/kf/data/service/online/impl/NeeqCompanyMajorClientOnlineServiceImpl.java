package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyMajorClientOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyMajorClientOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyMajorClientOnlineMapper;
import com.kf.data.service.online.NeeqCompanyMajorClientOnlineService;

/**
 * @Title: NeeqCompanyMajorClientOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 主要客户
 * @author: liangyt
 * @date: 2018年3月15日 下午7:00:26
 * @version V1.0
 */
@Service
public class NeeqCompanyMajorClientOnlineServiceImpl implements NeeqCompanyMajorClientOnlineService {

	@Autowired
	NeeqCompanyMajorClientOnlineMapper neeqCompanyMajorClientOnlineMapper;

	@Override
	public List<NeeqCompanyMajorClientOnline> readNeeqCompanyMajorClientOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyMajorClientOnline> neeqCompanyMajorClientOnlines = null;
		NeeqCompanyMajorClientOnlineExample example = new NeeqCompanyMajorClientOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyMajorClientOnlines = neeqCompanyMajorClientOnlineMapper.selectByExample(example);
		if (neeqCompanyMajorClientOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyMajorClientOnlines = neeqCompanyMajorClientOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyMajorClientOnlines;
	}

}
