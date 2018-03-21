package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqNoticeFranchiseOnline;
import com.kf.data.mybatis.entity.online.NeeqNoticeFranchiseOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqNoticeFranchiseOnlineMapper;
import com.kf.data.service.online.NeeqNoticeFranchiseOnlineService;

/**
 * @Title: NeeqNoticeFranchiseOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 特许经营权
 * @author: liangyt
 * @date: 2018年3月21日 下午2:44:51
 * @version V1.0
 */
@Service
public class NeeqNoticeFranchiseOnlineServiceImpl implements NeeqNoticeFranchiseOnlineService {

	@Autowired
	NeeqNoticeFranchiseOnlineMapper neeqNoticeFranchiseOnlineMapper;

	@Override
	public List<NeeqNoticeFranchiseOnline> readNeeqNoticeFranchiseOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqNoticeFranchiseOnline> neeqNoticeFranchiseOnlines = null;
		NeeqNoticeFranchiseOnlineExample example = new NeeqNoticeFranchiseOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqNoticeFranchiseOnlines = neeqNoticeFranchiseOnlineMapper.selectByExample(example);
		if (neeqNoticeFranchiseOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
				example.setOrderByClause("id asc limit 1");
				neeqNoticeFranchiseOnlines = neeqNoticeFranchiseOnlineMapper.selectByExample(example);
			}
		}
		return neeqNoticeFranchiseOnlines;
	}

}
