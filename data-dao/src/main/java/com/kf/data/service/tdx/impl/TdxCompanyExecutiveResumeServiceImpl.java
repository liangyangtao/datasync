package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyExecutiveResume;
import com.kf.data.mybatis.entity.tdx.TdxCompanyExecutiveResumeExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyExecutiveResumeMapper;
import com.kf.data.service.tdx.TdxCompanyExecutiveResumeService;

/**
 * @Title: TdxCompanyExecutiveResumeServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月14日 下午5:04:35
 * @version V1.0
 */

@Service
public class TdxCompanyExecutiveResumeServiceImpl implements TdxCompanyExecutiveResumeService {

	@Autowired
	TdxCompanyExecutiveResumeMapper tdxCompanyExecutiveResumeMapper;

	@Override
	public void saveTdxCompanyExecutiveResume(TdxCompanyExecutiveResume tdxCompanyExecutiveResume) {
		TdxCompanyExecutiveResumeExample example = new TdxCompanyExecutiveResumeExample();
		example.or().andPersonIdEqualTo(tdxCompanyExecutiveResume.getPersonId());
		if (tdxCompanyExecutiveResumeMapper.countByExample(example) > 0) {
			tdxCompanyExecutiveResumeMapper.updateByExampleSelective(tdxCompanyExecutiveResume, example);
		} else {
			tdxCompanyExecutiveResumeMapper.insertSelective(tdxCompanyExecutiveResume);
		}

	}

}
