package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyAbnormalOperationWithBLOBs;
import com.kf.data.mybatis.entity.tdx.TdxCompanyAbnormalOperation;
import com.kf.data.mybatis.entity.tdx.TdxCompanyAbnormalOperationExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyAbnormalOperationMapper;
import com.kf.data.service.tdx.TdxCompanyAbnormalOperationService;

/**
 * @Title: TdxCompanyAbnormalOperationServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 经营异常
 * @author: liangyt
 * @date: 2018年3月16日 下午5:07:47
 * @version V1.0
 */
@Service
public class TdxCompanyAbnormalOperationServiceImpl implements TdxCompanyAbnormalOperationService {

	@Autowired
	TdxCompanyAbnormalOperationMapper tdxCompanyAbnormalOperationMapper;

	@Override
	public void saveTdxCompanyAbnormalOperation(TdxCompanyAbnormalOperationWithBLOBs tdxCompanyAbnormalOperation) {
		TdxCompanyAbnormalOperationExample example = new TdxCompanyAbnormalOperationExample();
		example.or().andDtListEqualTo(tdxCompanyAbnormalOperation.getDtList())
				.andCompanyIdEqualTo(tdxCompanyAbnormalOperation.getCompanyId());
		if (tdxCompanyAbnormalOperationMapper.countByExample(example) > 0) {
			tdxCompanyAbnormalOperationMapper.updateByExampleSelective(tdxCompanyAbnormalOperation, example);
		} else {
			tdxCompanyAbnormalOperationMapper.insertSelective(tdxCompanyAbnormalOperation);
		}
	}
}
