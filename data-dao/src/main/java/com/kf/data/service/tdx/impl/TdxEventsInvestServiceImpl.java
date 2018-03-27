package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxEventsInvest;
import com.kf.data.mybatis.entity.tdx.TdxEventsInvestExample;
import com.kf.data.mybatis.mapper.tdx.TdxEventsInvestMapper;
import com.kf.data.service.tdx.TdxEventsInvestService;

/**
 * @Title: TdxEventsInvestServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 上午10:59:55
 * @version V1.0
 */
@Service
public class TdxEventsInvestServiceImpl implements TdxEventsInvestService {

	@Autowired
	TdxEventsInvestMapper tdxEventsInvestMapper;

	@Override
	public void saveTdxEventsInvest(TdxEventsInvest tdxEventsInvest) {
		TdxEventsInvestExample example = new TdxEventsInvestExample();
		example.or().andEventIdEqualTo(tdxEventsInvest.getEventId());
		if (tdxEventsInvestMapper.countByExample(example) > 0) {
			tdxEventsInvestMapper.updateByExampleSelective(tdxEventsInvest, example);
		} else {
			tdxEventsInvestMapper.insertSelective(tdxEventsInvest);
		}
	}

}
