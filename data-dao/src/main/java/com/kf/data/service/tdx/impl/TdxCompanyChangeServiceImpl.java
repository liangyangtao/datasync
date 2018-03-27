package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyChange;
import com.kf.data.mybatis.entity.tdx.TdxCompanyChangeExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyChangeMapper;
import com.kf.data.service.tdx.TdxCompanyChangeService;

/**
 * @Title: TdxCompanyChangeServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月16日 上午10:17:20
 * @version V1.0
 */
@Service
public class TdxCompanyChangeServiceImpl implements TdxCompanyChangeService {

	@Autowired
	TdxCompanyChangeMapper tdxCompanyChangeMapper;

	@Override
	public void saveTdxCompanyChange(TdxCompanyChange tdxCompanyChange) {
		TdxCompanyChangeExample example = new TdxCompanyChangeExample();
		example.or().andChangeProjectEqualTo(tdxCompanyChange.getChangeProject())
				.andCompanyIdEqualTo(tdxCompanyChange.getCompanyId())
				.andChangeDateEqualTo(tdxCompanyChange.getChangeDate());
		if (tdxCompanyChangeMapper.countByExample(example) > 0) {
			tdxCompanyChangeMapper.updateByExampleSelective(tdxCompanyChange, example);
		} else {
			tdxCompanyChangeMapper.insertSelective(tdxCompanyChange);
		}
	}

}
