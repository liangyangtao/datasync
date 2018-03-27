package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyBondFinancing;
import com.kf.data.mybatis.entity.tdx.TdxCompanyBondFinancingExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyBondFinancingMapper;
import com.kf.data.service.tdx.TdxCompanyBondFinancingService;

/**
 * @Title: TdxCompanyBondFinancingServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午3:10:17
 * @version V1.0
 */
@Service
public class TdxCompanyBondFinancingServiceImpl implements TdxCompanyBondFinancingService {
	@Autowired
	TdxCompanyBondFinancingMapper tdxCompanyBondFinancingMapper;

	@Override
	public void saveTdxCompanyBondFinancing(TdxCompanyBondFinancing tdxCompanyBondFinancing) {
		TdxCompanyBondFinancingExample example = new TdxCompanyBondFinancingExample();
		example.or().andCompanyIdEqualTo(tdxCompanyBondFinancing.getCompanyId())
				.andBondNumEqualTo(tdxCompanyBondFinancing.getBondNum());
		if (tdxCompanyBondFinancingMapper.countByExample(example) > 0) {
			tdxCompanyBondFinancingMapper.updateByExampleSelective(tdxCompanyBondFinancing, example);
		} else {
			tdxCompanyBondFinancingMapper.insertSelective(tdxCompanyBondFinancing);
		}
	}

}
