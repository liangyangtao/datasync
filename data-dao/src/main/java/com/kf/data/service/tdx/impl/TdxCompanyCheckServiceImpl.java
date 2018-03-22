package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyCheck;
import com.kf.data.mybatis.entity.tdx.TdxCompanyCheckExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyCheckMapper;
import com.kf.data.service.tdx.TdxCompanyCheckService;

/**
 * @Title: TdxCompanyCheckServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 抽查检查
 * @author: liangyt
 * @date: 2018年3月22日 下午3:25:27
 * @version V1.0
 */
@Service
public class TdxCompanyCheckServiceImpl implements TdxCompanyCheckService {

	@Autowired
	TdxCompanyCheckMapper tdxCompanyCheckMapper;

	@Override
	public void saveTdxCompanyCheck(TdxCompanyCheck tdxCompanyCheck) {
		TdxCompanyCheckExample example = new TdxCompanyCheckExample();
		example.or().andCompanyIdEqualTo(tdxCompanyCheck.getCompanyId()).andDateEqualTo(tdxCompanyCheck.getDate());
		if (tdxCompanyCheckMapper.countByExample(example) > 0) {
			tdxCompanyCheckMapper.updateByExampleSelective(tdxCompanyCheck, example);
		} else {
			tdxCompanyCheckMapper.insertSelective(tdxCompanyCheck);
		}
	}

}
