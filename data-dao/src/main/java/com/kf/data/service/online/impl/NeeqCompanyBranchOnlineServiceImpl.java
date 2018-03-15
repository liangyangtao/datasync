package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyBranchOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyBranchOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyBranchOnlineMapper;
import com.kf.data.service.online.NeeqCompanyBranchOnlineService;

/**
 * @Title: NeeqCompanyBranchOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 分支
 * @author: liangyt
 * @date: 2018年3月15日 下午1:53:37
 * @version V1.0
 */
@Service
public class NeeqCompanyBranchOnlineServiceImpl implements NeeqCompanyBranchOnlineService {

	@Autowired
	NeeqCompanyBranchOnlineMapper neeqCompanyBranchOnlineMapper;

	@Override
	public List<NeeqCompanyBranchOnline> readNeeqCompanyBranchOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyBranchOnline> neeqCompanyBranchOnlines = null;
		NeeqCompanyBranchOnlineExample example = new NeeqCompanyBranchOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyBranchOnlines = neeqCompanyBranchOnlineMapper.selectByExample(example);
		if (neeqCompanyBranchOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyBranchOnlines = neeqCompanyBranchOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyBranchOnlines;
	}

}
