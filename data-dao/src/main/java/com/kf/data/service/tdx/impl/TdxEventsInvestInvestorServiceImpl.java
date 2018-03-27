package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxEventsInvestInvestor;
import com.kf.data.mybatis.entity.tdx.TdxEventsInvestInvestorExample;
import com.kf.data.mybatis.mapper.tdx.TdxEventsInvestInvestorMapper;
import com.kf.data.service.tdx.TdxEventsInvestInvestorService;

/**
 * @Title: TdxEventsInvestInvestorServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 上午11:04:02
 * @version V1.0
 */
@Service
public class TdxEventsInvestInvestorServiceImpl implements TdxEventsInvestInvestorService {

	@Autowired
	TdxEventsInvestInvestorMapper tdxEventsInvestInvestorMapper;

	@Override
	public void saveTdxEventsInvestInvestor(TdxEventsInvestInvestor tdxEventsInvestInvestor) {
		TdxEventsInvestInvestorExample example = new TdxEventsInvestInvestorExample();
		example.or().andEventIdEqualTo(tdxEventsInvestInvestor.getEventId())
				.andCompanyIdEqualTo(tdxEventsInvestInvestor.getEventId())
				.andInvestorIdEqualTo(tdxEventsInvestInvestor.getEventId());
		if (tdxEventsInvestInvestorMapper.countByExample(example) > 0) {
			tdxEventsInvestInvestorMapper.updateByExampleSelective(tdxEventsInvestInvestor, example);
		} else {
			tdxEventsInvestInvestorMapper.insertSelective(tdxEventsInvestInvestor);
		}
	}

}
