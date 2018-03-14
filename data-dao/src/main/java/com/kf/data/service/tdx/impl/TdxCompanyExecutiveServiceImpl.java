package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyExecutive;
import com.kf.data.mybatis.entity.tdx.TdxCompanyExecutiveExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyExecutiveMapper;
import com.kf.data.service.tdx.TdxCompanyExecutiveService;

/**
 * @Title: TdxCompanyExecutiveServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月14日 下午3:58:04
 * @version V1.0
 */

@Service
public class TdxCompanyExecutiveServiceImpl implements TdxCompanyExecutiveService {

	@Autowired
	TdxCompanyExecutiveMapper tdxCompanyExecutiveMapper;

	@Override
	public void saveTdxCompanyExecutive(TdxCompanyExecutive tdxCompanyExecutive) {
		TdxCompanyExecutiveExample example = new TdxCompanyExecutiveExample();
		example.or().andIdEqualTo(tdxCompanyExecutive.getId());
		if (tdxCompanyExecutiveMapper.countByExample(example) > 0) {
			tdxCompanyExecutiveMapper.updateByExampleSelective(tdxCompanyExecutive, example);
		} else {
			tdxCompanyExecutiveMapper.insertSelective(tdxCompanyExecutive);
		}

	}

}
