package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyEquityFreezeOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyEquityFreezeOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyEquityFreezeOnlineMapper;
import com.kf.data.service.online.NeeqCompanyEquityFreezeOnlineService;

/**
 * @Title: NeeqCompanyEquityFreezeOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 股权冻结
 * @author: liangyt
 * @date: 2018年3月16日 下午4:14:37
 * @version V1.0
 */
@Service
public class NeeqCompanyEquityFreezeOnlineServiceImpl implements NeeqCompanyEquityFreezeOnlineService {

	@Autowired
	NeeqCompanyEquityFreezeOnlineMapper neeqCompanyEquityFreezeOnlineMapper;

	@Override
	public List<NeeqCompanyEquityFreezeOnline> readNeeqCompanyEquityFreezeOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyEquityFreezeOnline> neeqCompanyEquityFreezeOnlines = null;
		NeeqCompanyEquityFreezeOnlineExample example = new NeeqCompanyEquityFreezeOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyEquityFreezeOnlines = neeqCompanyEquityFreezeOnlineMapper.selectByExample(example);
		if (neeqCompanyEquityFreezeOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyEquityFreezeOnlines = neeqCompanyEquityFreezeOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyEquityFreezeOnlines;
	}

}
