package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyPatentExample;
import com.kf.data.mybatis.entity.tdx.TdxCompanyPatentWithBLOBs;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyPatentMapper;
import com.kf.data.service.tdx.TdxCompanyPatentService;

/**
 * @Title: TdxCompanyPatentService.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午3:33:54
 * @version V1.0
 */
@Service
public class TdxCompanyPatentServiceImpl implements TdxCompanyPatentService {

	@Autowired
	TdxCompanyPatentMapper tdxCompanyPatentMapper;

	@Override
	public void saveTdxCompanyPatent(TdxCompanyPatentWithBLOBs tdxCompanyPatent) {
		TdxCompanyPatentExample example = new TdxCompanyPatentExample();
		example.or().andCompanyIdEqualTo(tdxCompanyPatent.getCompanyId())
				.andPatentNameEqualTo(tdxCompanyPatent.getPatentName())
				.andPublishDateEqualTo(tdxCompanyPatent.getPublishDate());

		if (tdxCompanyPatentMapper.countByExample(example) > 0) {
			tdxCompanyPatentMapper.updateByExampleSelective(tdxCompanyPatent, example);
		} else {
			tdxCompanyPatentMapper.insertSelective(tdxCompanyPatent);
		}
	}
}
