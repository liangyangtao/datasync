package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyRecruitment;
import com.kf.data.mybatis.entity.tdx.TdxCompanyRecruitmentExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyRecruitmentMapper;
import com.kf.data.service.tdx.TdxCompanyRecruitmentService;

/**
 * @Title: TdxCompanyRecruitmentServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午2:03:36
 * @version V1.0
 */
@Service
public class TdxCompanyRecruitmentServiceImpl implements TdxCompanyRecruitmentService {

	@Autowired
	TdxCompanyRecruitmentMapper tdxCompanyRecruitmentMapper;

	@Override
	public void saveTdxCompanyRecruitment(TdxCompanyRecruitment tdxCompanyRecruitment) {
		TdxCompanyRecruitmentExample example = new TdxCompanyRecruitmentExample();
		example.or().andCompanyIdEqualTo(tdxCompanyRecruitment.getCompanyId())
				.andJobTitleEqualTo(tdxCompanyRecruitment.getJobTitle())
				.andReleaseDateEqualTo(tdxCompanyRecruitment.getReleaseDate());
		if (tdxCompanyRecruitmentMapper.countByExample(example) > 0) {
			tdxCompanyRecruitmentMapper.updateByExampleSelective(tdxCompanyRecruitment, example);
		} else {
			tdxCompanyRecruitmentMapper.insertSelective(tdxCompanyRecruitment);
		}
	}

}
