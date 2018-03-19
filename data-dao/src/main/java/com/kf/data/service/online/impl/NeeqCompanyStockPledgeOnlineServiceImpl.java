package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyStockPledgeOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyStockPledgeOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyStockPledgeOnlineMapper;
import com.kf.data.service.online.NeeqCompanyStockPledgeOnlineService;

/**
 * @Title: NeeqCompanyStockPledgeOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 股权质押
 * @author: liangyt
 * @date: 2018年3月16日 下午4:10:46
 * @version V1.0
 */
@Service
public class NeeqCompanyStockPledgeOnlineServiceImpl implements NeeqCompanyStockPledgeOnlineService {

	@Autowired
	NeeqCompanyStockPledgeOnlineMapper neeqCompanyStockPledgeOnlineMapper;

	@Override
	public List<NeeqCompanyStockPledgeOnline> readNeeqCompanyStockPledgeOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyStockPledgeOnline> neeqCompanyStockPledgeOnlines = null;
		NeeqCompanyStockPledgeOnlineExample example = new NeeqCompanyStockPledgeOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyStockPledgeOnlines = neeqCompanyStockPledgeOnlineMapper.selectByExample(example);
		if (neeqCompanyStockPledgeOnlines.size() > 0) {
		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyStockPledgeOnlines = neeqCompanyStockPledgeOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyStockPledgeOnlines;
	}

}
