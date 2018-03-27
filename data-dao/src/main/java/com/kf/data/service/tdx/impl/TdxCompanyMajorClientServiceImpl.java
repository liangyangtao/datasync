package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyMajorClient;
import com.kf.data.mybatis.entity.tdx.TdxCompanyMajorClientExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyMajorClientMapper;
import com.kf.data.service.tdx.TdxCompanyMajorClientService;

/**
 * @Title: TdxCompanyMajorClientServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 主要客户
 * @author: liangyt
 * @date: 2018年3月15日 下午6:24:54
 * @version V1.0
 */
@Service
public class TdxCompanyMajorClientServiceImpl implements TdxCompanyMajorClientService {

	@Autowired
	TdxCompanyMajorClientMapper tdxCompanyMajorClientMapper;

	@Override
	public void saveTdxCompanyMajorClient(TdxCompanyMajorClient tdxCompanyMajorClient) {
		TdxCompanyMajorClientExample example = new TdxCompanyMajorClientExample();
		example.or().andStockCodeEqualTo(tdxCompanyMajorClient.getStockCode())
				.andReportDateEqualTo(tdxCompanyMajorClient.getReportDate())
				.andClientNameEqualTo(tdxCompanyMajorClient.getClientName());
		if (tdxCompanyMajorClientMapper.countByExample(example) > 0) {
			tdxCompanyMajorClientMapper.updateByExampleSelective(tdxCompanyMajorClient, example);
		} else {
			tdxCompanyMajorClientMapper.insertSelective(tdxCompanyMajorClient);
		}
	}
}
