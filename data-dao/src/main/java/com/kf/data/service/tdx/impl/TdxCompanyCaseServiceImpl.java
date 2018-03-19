package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyCase;
import com.kf.data.mybatis.entity.tdx.TdxCompanyCaseExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyCaseMapper;
import com.kf.data.service.tdx.TdxCompanyCaseService;

/**
 * @Title: TdxCompanyCaseServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 法院公告
 * @author: liangyt
 * @date: 2018年3月16日 下午4:43:10
 * @version V1.0
 */
@Service
public class TdxCompanyCaseServiceImpl implements TdxCompanyCaseService {

	@Autowired
	TdxCompanyCaseMapper tdxCompanyCaseMapper;

	@Override
	public void saveTdxCompanyCase(TdxCompanyCase tdxCompanyCase) {
		TdxCompanyCaseExample example = new TdxCompanyCaseExample();
		example.or().andCaseNumberEqualTo(tdxCompanyCase.getCaseNumber())
				.andCompanyIdEqualTo(tdxCompanyCase.getCompanyId());
		if (tdxCompanyCaseMapper.countByExample(example) > 0) {
			tdxCompanyCaseMapper.updateByExampleSelective(tdxCompanyCase, example);
		} else {
			tdxCompanyCaseMapper.insertSelective(tdxCompanyCase);
		}
	}
}
