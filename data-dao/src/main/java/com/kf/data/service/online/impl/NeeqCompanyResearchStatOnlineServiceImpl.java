package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyResearchStatOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyResearchStatOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyResearchStatOnlineMapper;
import com.kf.data.service.online.NeeqCompanyResearchStatOnlineService;

/**
 * @Title: NeeqCompanyResearchStatOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 研发投入
 * @author: liangyt
 * @date: 2018年3月21日 下午2:22:56
 * @version V1.0
 */
@Service
public class NeeqCompanyResearchStatOnlineServiceImpl implements NeeqCompanyResearchStatOnlineService {

	@Autowired
	NeeqCompanyResearchStatOnlineMapper neeqCompanyResearchStatOnlineMapper;

	@Override
	public List<NeeqCompanyResearchStatOnline> readNeeqCompanyResearchStatOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyResearchStatOnline> neeqCompanyResearchStatOnlines = null;
		NeeqCompanyResearchStatOnlineExample example = new NeeqCompanyResearchStatOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyResearchStatOnlines = neeqCompanyResearchStatOnlineMapper.selectByExample(example);
		if (neeqCompanyResearchStatOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyResearchStatOnlines = neeqCompanyResearchStatOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyResearchStatOnlines;
	}

}
