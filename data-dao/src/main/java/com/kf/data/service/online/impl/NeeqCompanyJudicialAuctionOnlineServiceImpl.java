package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyJudicialAuctionOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyJudicialAuctionOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyJudicialAuctionOnlineMapper;
import com.kf.data.service.online.NeeqCompanyJudicialAuctionOnlineService;

/**
 * @Title: NeeqCompanyJudicialAuctionOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 司法拍卖
 * @author: liangyt
 * @date: 2018年3月16日 下午4:05:43
 * @version V1.0
 */
@Service
public class NeeqCompanyJudicialAuctionOnlineServiceImpl implements NeeqCompanyJudicialAuctionOnlineService {

	@Autowired
	NeeqCompanyJudicialAuctionOnlineMapper neeqCompanyJudicialAuctionOnlineMapper;

	@Override
	public List<NeeqCompanyJudicialAuctionOnline> readNeeqCompanyJudicialAuctionOnlines(
			TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyJudicialAuctionOnline> neeqCompanyJudicialAuctionOnlines = null;
		NeeqCompanyJudicialAuctionOnlineExample example = new NeeqCompanyJudicialAuctionOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyJudicialAuctionOnlines = neeqCompanyJudicialAuctionOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqCompanyJudicialAuctionOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyJudicialAuctionOnlines = neeqCompanyJudicialAuctionOnlineMapper
						.selectByExampleWithBLOBs(example);
			}
		}
		return neeqCompanyJudicialAuctionOnlines;
	}

}
