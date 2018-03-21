package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyInfo;
import com.kf.data.mybatis.entity.tdx.TdxCompanyInfoExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyInfoMapper;
import com.kf.data.service.tdx.TdxCompanyInfoService;

/**
 * @Title: TdxCompanyInfoServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 公司信息
 * @author: liangyt
 * @date: 2018年3月20日 下午5:07:01
 * @version V1.0
 */
@Service
public class TdxCompanyInfoServiceImpl implements TdxCompanyInfoService {

	@Autowired
	TdxCompanyInfoMapper tdxCompanyInfoMapper;

	@Override
	public void saveTdxCompanyInfo(TdxCompanyInfo tdxCompanyInfo) {
		TdxCompanyInfoExample example = new TdxCompanyInfoExample();
		example.or().andCompanyIdEqualTo(tdxCompanyInfo.getCompanyId());
		if (tdxCompanyInfoMapper.countByExample(example) > 0) {
			tdxCompanyInfoMapper.updateByExampleSelective(tdxCompanyInfo, example);
		} else {
			tdxCompanyInfoMapper.insertSelective(tdxCompanyInfo);
		}
	}

}
