package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxNoticeFranchise;
import com.kf.data.mybatis.entity.tdx.TdxNoticeFranchiseExample;
import com.kf.data.mybatis.mapper.tdx.TdxNoticeFranchiseMapper;
import com.kf.data.service.tdx.TdxNoticeFranchiseService;

/**
 * @Title: TdxNoticeFranchiseServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午5:30:04
 * @version V1.0
 */
@Service
public class TdxNoticeFranchiseServiceImpl implements TdxNoticeFranchiseService {

	@Autowired
	TdxNoticeFranchiseMapper tdxNoticeFranchiseMapper;

	@Override
	public void saveTdxNoticeFranchise(TdxNoticeFranchise tdxNoticeFranchise) {
		TdxNoticeFranchiseExample example = new TdxNoticeFranchiseExample();
		
		example.or().andCompanyIdEqualTo(tdxNoticeFranchise.getCompanyId())
				.andAuthorNameEqualTo(tdxNoticeFranchise.getAuthorName())
				.andAuthorRangeBusiEqualTo(tdxNoticeFranchise.getAuthorRangeBusi())
				.andAuthorRangeGeogEqualTo(tdxNoticeFranchise.getAuthorRangeGeog());
		if (tdxNoticeFranchiseMapper.countByExample(example) > 0) {
			tdxNoticeFranchiseMapper.updateByExampleSelective(tdxNoticeFranchise, example);
		} else {
			tdxNoticeFranchiseMapper.insertSelective(tdxNoticeFranchise);
		}
	}

}
