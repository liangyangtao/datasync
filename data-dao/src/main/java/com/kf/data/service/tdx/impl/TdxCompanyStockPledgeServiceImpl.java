package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyStockPledge;
import com.kf.data.mybatis.entity.tdx.TdxCompanyStockPledgeExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyStockPledgeMapper;
import com.kf.data.service.tdx.TdxCompanyStockPledgeService;

/**
 * @Title: TdxCompanyStockPledgeServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午12:01:30
 * @version V1.0
 */
@Service
public class TdxCompanyStockPledgeServiceImpl implements TdxCompanyStockPledgeService {

	@Autowired
	TdxCompanyStockPledgeMapper tdxCompanyStockPledgeMapper;

	@Override
	public void saveTdxCompanyStockPledge(TdxCompanyStockPledge tdxCompanyStockPledge) {
		TdxCompanyStockPledgeExample example = new TdxCompanyStockPledgeExample();
		example.or().andStockCodeEqualTo(tdxCompanyStockPledge.getStockCode())
				.andDtNoticeEqualTo(tdxCompanyStockPledge.getDtNotice())
				.andPldNameEqualTo(tdxCompanyStockPledge.getPldName())
				.andDtStartEqualTo(tdxCompanyStockPledge.getDtStart())
				.andPldShareNumEqualTo(tdxCompanyStockPledge.getPldShareNum());
		if (tdxCompanyStockPledgeMapper.countByExample(example) > 0) {
			tdxCompanyStockPledgeMapper.updateByExampleSelective(tdxCompanyStockPledge, example);
		} else {
			tdxCompanyStockPledgeMapper.insertSelective(tdxCompanyStockPledge);
		}
	}

}
