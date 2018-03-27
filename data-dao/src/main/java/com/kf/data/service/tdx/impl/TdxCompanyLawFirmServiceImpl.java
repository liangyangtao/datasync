package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyLawFirm;
import com.kf.data.mybatis.entity.tdx.TdxCompanyLawFirmExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyLawFirmMapper;
import com.kf.data.service.tdx.TdxCompanyLawFirmService;

/**
 * @Title: TdxCompanyLawFirmServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description:律师
 * @author: liangyt
 * @date: 2018年3月22日 下午5:44:02
 * @version V1.0
 */
@Service
public class TdxCompanyLawFirmServiceImpl implements TdxCompanyLawFirmService {

	@Autowired
	TdxCompanyLawFirmMapper tdxCompanyLawFirmMapper;

	@Override
	public void saveTdxCompanyLawFirm(TdxCompanyLawFirm tdxCompanyLawFirm) {
		TdxCompanyLawFirmExample example = new TdxCompanyLawFirmExample();
		example.or().andCompanyIdEqualTo(tdxCompanyLawFirm.getCompanyId())
				.andLawFirmIdEqualTo(tdxCompanyLawFirm.getLawFirmId());
		if (tdxCompanyLawFirmMapper.countByExample(example) > 0) {
			tdxCompanyLawFirmMapper.updateByExampleSelective(tdxCompanyLawFirm, example);
		} else {
			tdxCompanyLawFirmMapper.insertSelective(tdxCompanyLawFirm);
		}

	}
}
