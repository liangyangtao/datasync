package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyPatentStatOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyPatentStatOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyPatentStatOnlineMapper;
import com.kf.data.service.online.NeeqCompanyPatentStatOnlineService;

/**
 * @Title: NeeqCompanyPatentStatStatOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午6:06:47
 * @version V1.0
 */
@Service
public class NeeqCompanyPatentStatOnlineServiceImpl implements NeeqCompanyPatentStatOnlineService {

	@Autowired
	NeeqCompanyPatentStatOnlineMapper neeqCompanyPatentStatOnlineMapper;

	@Override
	public List<NeeqCompanyPatentStatOnline> readNeeqCompanyPatentStatOnlines(TdxUpIndexOnline tdxUpIndexOnline) {

		List<NeeqCompanyPatentStatOnline> neeqCompanyPatentStatOnlines = null;
		NeeqCompanyPatentStatOnlineExample example = new NeeqCompanyPatentStatOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyPatentStatOnlines = neeqCompanyPatentStatOnlineMapper.selectByExample(example);
		if (neeqCompanyPatentStatOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyPatentStatOnlines = neeqCompanyPatentStatOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyPatentStatOnlines;
	}

}
