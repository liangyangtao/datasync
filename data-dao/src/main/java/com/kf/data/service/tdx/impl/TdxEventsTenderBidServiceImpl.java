package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxEventsTenderBid;
import com.kf.data.mybatis.entity.tdx.TdxEventsTenderBidExample;
import com.kf.data.mybatis.mapper.tdx.TdxEventsTenderBidMapper;
import com.kf.data.service.tdx.TdxEventsTenderBidService;

/**
 * @Title: TdxEventsTenderBidServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午2:16:28
 * @version V1.0
 */
@Service
public class TdxEventsTenderBidServiceImpl implements TdxEventsTenderBidService {

	@Autowired
	TdxEventsTenderBidMapper tdxEventsTenderBidMapper;

	@Override
	public void saveTdxEventsTenderBid(TdxEventsTenderBid tdxEventsTenderBid) {

		TdxEventsTenderBidExample example = new TdxEventsTenderBidExample();

		example.or().andCompanyIdEqualTo(tdxEventsTenderBid.getCompanyId())
				.andTitleEqualTo(tdxEventsTenderBid.getTitle()).andDateEqualTo(tdxEventsTenderBid.getDate());

		if (tdxEventsTenderBidMapper.countByExample(example) > 0) {
			tdxEventsTenderBidMapper.updateByExampleSelective(tdxEventsTenderBid, example);
		} else {
			tdxEventsTenderBidMapper.insertSelective(tdxEventsTenderBid);
		}
	}

}
