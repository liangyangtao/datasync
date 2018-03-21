package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyCopyright;
import com.kf.data.mybatis.entity.tdx.TdxCompanyCopyrightExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyCopyrightMapper;
import com.kf.data.service.tdx.TdxCompanyCopyrightService;

/**
 * @Title: TdxCompanyCopyrightServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午4:21:40
 * @version V1.0
 */
@Service
public class TdxCompanyCopyrightServiceImpl implements TdxCompanyCopyrightService {

	@Autowired
	TdxCompanyCopyrightMapper tdxCompanyCopyrightMapper;

	@Override
	public void saveTdxCompanyCopyright(TdxCompanyCopyright tdxCompanyCopyright) {
		TdxCompanyCopyrightExample example = new TdxCompanyCopyrightExample();
		example.or().andCompanyIdEqualTo(tdxCompanyCopyright.getCompanyId())
				.andRegistrationNumberEqualTo(tdxCompanyCopyright.getRegistrationNumber());
		if (tdxCompanyCopyrightMapper.countByExample(example) > 0) {
			tdxCompanyCopyrightMapper.updateByExampleSelective(tdxCompanyCopyright, example);
		} else {
			tdxCompanyCopyrightMapper.insertSelective(tdxCompanyCopyright);
		}
	}

}
