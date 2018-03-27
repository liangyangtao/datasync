package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyBranch;
import com.kf.data.mybatis.entity.tdx.TdxCompanyBranchExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyBranchMapper;
import com.kf.data.service.tdx.TdxCompanyBranchService;

/**
 * @Title: TdxCompanyBranchServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 分支机构
 * @author: liangyt
 * @date: 2018年3月16日 下午1:44:23
 * @version V1.0
 */
@Service
public class TdxCompanyBranchServiceImpl implements TdxCompanyBranchService {

	@Autowired
	TdxCompanyBranchMapper tdxCompanyBranchMapper;

	@Override
	public void saveTdxCompanyBranch(TdxCompanyBranch tdxCompanyBranch) {
		TdxCompanyBranchExample example = new TdxCompanyBranchExample();
		example.or().andBranchNameEqualTo(tdxCompanyBranch.getBranchName())
				.andCompanyIdEqualTo(tdxCompanyBranch.getCompanyId());
		if (tdxCompanyBranchMapper.countByExample(example) > 0) {
			tdxCompanyBranchMapper.updateByExampleSelective(tdxCompanyBranch, example);
		} else {
			tdxCompanyBranchMapper.insertSelective(tdxCompanyBranch);
		}
	}

}
