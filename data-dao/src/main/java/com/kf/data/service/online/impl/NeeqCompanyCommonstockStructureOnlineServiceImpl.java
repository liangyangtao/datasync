package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyCommonstockStructureOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyCommonstockStructureOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyCommonstockStructureOnlineMapper;
import com.kf.data.service.online.NeeqCompanyCommonstockStructureOnlineService;

/**
 * @Title: NeeqCompanyCommonstockStructureOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 股本结构
 * @author: liangyt
 * @date: 2018年3月15日 上午10:19:44
 * @version V1.0
 */
@Service
public class NeeqCompanyCommonstockStructureOnlineServiceImpl implements NeeqCompanyCommonstockStructureOnlineService {

	@Autowired
	NeeqCompanyCommonstockStructureOnlineMapper neeqCompanyCommonstockStructureOnlineMapper;

	@Override
	public List<NeeqCompanyCommonstockStructureOnline> readNeeqCompanyCommonstockStructureOnlines(
			TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyCommonstockStructureOnline> neeqCompanyCommonstockStructureOnlines = null;
		NeeqCompanyCommonstockStructureOnlineExample example = new NeeqCompanyCommonstockStructureOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyCommonstockStructureOnlines = neeqCompanyCommonstockStructureOnlineMapper.selectByExample(example);
		if (neeqCompanyCommonstockStructureOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyCommonstockStructureOnlines = neeqCompanyCommonstockStructureOnlineMapper
						.selectByExample(example);
			}
		}
		return neeqCompanyCommonstockStructureOnlines;
	}

}
