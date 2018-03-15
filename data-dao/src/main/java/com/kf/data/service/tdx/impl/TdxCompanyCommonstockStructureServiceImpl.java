package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyCommonstockStructure;
import com.kf.data.mybatis.entity.tdx.TdxCompanyCommonstockStructureExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyCommonstockStructureMapper;
import com.kf.data.service.tdx.TdxCompanyCommonstockStructureService;

/**
 * @Title: TdxCompanyCommonstockStructureServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 股本结构
 * @author: liangyt
 * @date: 2018年3月15日 上午10:24:31
 * @version V1.0
 */
@Service
public class TdxCompanyCommonstockStructureServiceImpl implements TdxCompanyCommonstockStructureService {

	@Autowired
	TdxCompanyCommonstockStructureMapper tdxCompanyCommonstockStructureMapper;

	@Override
	public void saveTdxCompanyCommonstockStructure(TdxCompanyCommonstockStructure tdxCompanyCommonstockStructure) {
		TdxCompanyCommonstockStructureExample example = new TdxCompanyCommonstockStructureExample();
		example.or().andIdEqualTo(tdxCompanyCommonstockStructure.getId());
		if (tdxCompanyCommonstockStructureMapper.countByExample(example) > 0) {
			tdxCompanyCommonstockStructureMapper.updateByExampleSelective(tdxCompanyCommonstockStructure, example);
		} else {
			tdxCompanyCommonstockStructureMapper.insertSelective(tdxCompanyCommonstockStructure);
		}
	}

}
