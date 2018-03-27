package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanySoftwareCopyright;
import com.kf.data.mybatis.entity.tdx.TdxCompanySoftwareCopyrightExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanySoftwareCopyrightMapper;
import com.kf.data.service.tdx.TdxCompanySoftwareCopyrightService;

/**
 * @Title: TdxCompanySoftwareCopyrightServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午4:34:35
 * @version V1.0
 */
@Service
public class TdxCompanySoftwareCopyrightServiceImpl implements TdxCompanySoftwareCopyrightService {

	@Autowired
	TdxCompanySoftwareCopyrightMapper tdxCompanySoftwareCopyrightMapper;	

	@Override
	public void saveTdxCompanySoftwareCopyright(TdxCompanySoftwareCopyright tdxCompanySoftwareCopyright) {
		TdxCompanySoftwareCopyrightExample example = new TdxCompanySoftwareCopyrightExample();
		example.or().andCompanyIdEqualTo(tdxCompanySoftwareCopyright.getCompanyId())
				.andRegistrationNumberEqualTo(tdxCompanySoftwareCopyright.getRegistrationNumber());
		if (tdxCompanySoftwareCopyrightMapper.countByExample(example) > 0) {
			tdxCompanySoftwareCopyrightMapper.updateByExampleSelective(tdxCompanySoftwareCopyright, example);
		} else {
			tdxCompanySoftwareCopyrightMapper.insertSelective(tdxCompanySoftwareCopyright);
		}
	}

}
