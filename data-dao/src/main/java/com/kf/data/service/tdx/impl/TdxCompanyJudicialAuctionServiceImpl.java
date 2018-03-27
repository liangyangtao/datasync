package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyJudicialAuction;
import com.kf.data.mybatis.entity.tdx.TdxCompanyJudicialAuctionExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyJudicialAuctionMapper;
import com.kf.data.service.tdx.TdxCompanyJudicialAuctionService;

/**
 * @Title: TdxCompanyJudicialAuctionServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 司法拍卖
 * @author: liangyt
 * @date: 2018年3月16日 下午6:05:00
 * @version V1.0
 */
@Service
public class TdxCompanyJudicialAuctionServiceImpl implements TdxCompanyJudicialAuctionService {

	@Autowired
	TdxCompanyJudicialAuctionMapper tdxCompanyJudicialAuctionMapper;

	@Override
	public void saveTdxCompanyJudicialAuction(TdxCompanyJudicialAuction tdxCompanyJudicialAuction) {
		TdxCompanyJudicialAuctionExample example = new TdxCompanyJudicialAuctionExample();
		example.or().andCompanyIdEqualTo(tdxCompanyJudicialAuction.getCompanyId())
				.andTitleEqualTo(tdxCompanyJudicialAuction.getTitle());
		if (tdxCompanyJudicialAuctionMapper.countByExample(example) > 0) {
			tdxCompanyJudicialAuctionMapper.updateByExampleSelective(tdxCompanyJudicialAuction, example);
		} else {
			tdxCompanyJudicialAuctionMapper.insertSelective(tdxCompanyJudicialAuction);
		}

	}
}
