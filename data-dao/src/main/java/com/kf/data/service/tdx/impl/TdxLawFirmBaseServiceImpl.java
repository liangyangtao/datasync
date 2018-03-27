package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxLawFirmBase;
import com.kf.data.mybatis.entity.tdx.TdxLawFirmBaseExample;
import com.kf.data.mybatis.mapper.tdx.TdxLawFirmBaseMapper;
import com.kf.data.service.tdx.TdxLawFirmBaseService;

/**
 * @Title: TdxLawFirmBaseServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 上午10:51:36
 * @version V1.0
 */
@Service
public class TdxLawFirmBaseServiceImpl implements TdxLawFirmBaseService {

	@Autowired
	TdxLawFirmBaseMapper tdxLawFirmBaseMapper;

	@Override
	public void saveTdxLawFirmBase(TdxLawFirmBase tdxLawFirmBase) {
		TdxLawFirmBaseExample example = new TdxLawFirmBaseExample();
		example.or().andCompanyIdEqualTo(tdxLawFirmBase.getCompanyId());
		if (tdxLawFirmBaseMapper.countByExample(example) > 0) {
			tdxLawFirmBaseMapper.updateByExampleSelective(tdxLawFirmBase, example);
		} else {
			tdxLawFirmBaseMapper.insertSelective(tdxLawFirmBase);
		}
	}

}
