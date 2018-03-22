package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyExecutor;
import com.kf.data.mybatis.entity.tdx.TdxCompanyExecutorExample;
import com.kf.data.mybatis.entity.tdx.TdxCompanyExecutor;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyExecutorMapper;
import com.kf.data.service.tdx.TdxCompanyExecutorService;

/**
 * @Title: TdxCompanyExecutorServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 上午10:56:19
 * @version V1.0
 */
@Service
public class TdxCompanyExecutorServiceImpl implements TdxCompanyExecutorService {

	@Autowired
	TdxCompanyExecutorMapper tdxCompanyExecutorMapper;

	@Override
	public void saveTdxCompanyExecutor(TdxCompanyExecutor tdxCompanyExecutor) {
		TdxCompanyExecutorExample example = new TdxCompanyExecutorExample();
		example.or().andCompanyIdEqualTo(tdxCompanyExecutor.getCompanyId())
				.andCaseNoEqualTo(tdxCompanyExecutor.getCaseNo());
		if (tdxCompanyExecutorMapper.countByExample(example) > 0) {
			tdxCompanyExecutorMapper.updateByExampleSelective(tdxCompanyExecutor, example);
		} else {
			tdxCompanyExecutorMapper.insertSelective(tdxCompanyExecutor);
		}

	}
}
