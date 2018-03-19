package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyAdmPenaltyOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyAdmPenaltyOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyAdmPenaltyOnlineMapper;
import com.kf.data.service.online.NeeqCompanyAdmPenaltyOnlineService;

/**
 * @Title: NeeqCompanyAdmPenaltyOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 行政处罚
 * @author: liangyt
 * @date: 2018年3月16日 下午3:57:59
 * @version V1.0
 */
@Service
public class NeeqCompanyAdmPenaltyOnlineServiceImpl implements NeeqCompanyAdmPenaltyOnlineService {

	@Autowired
	NeeqCompanyAdmPenaltyOnlineMapper neeqCompanyAdmPenaltyOnlineMapper;

	@Override
	public List<NeeqCompanyAdmPenaltyOnline> readNeeqCompanyAdmPenaltyOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyAdmPenaltyOnline> neeqCompanyAdmPenaltyOnlines = null;
		NeeqCompanyAdmPenaltyOnlineExample example = new NeeqCompanyAdmPenaltyOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyAdmPenaltyOnlines = neeqCompanyAdmPenaltyOnlineMapper.selectByExample(example);
		if (neeqCompanyAdmPenaltyOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyAdmPenaltyOnlines = neeqCompanyAdmPenaltyOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyAdmPenaltyOnlines;
	}

}
