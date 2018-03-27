package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyAccountingFirm;
import com.kf.data.mybatis.entity.tdx.TdxCompanyAccountingFirmExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyAccountingFirmMapper;
import com.kf.data.service.tdx.TdxCompanyAccountingFirmService;

/**
 * @Title: TdxCompanyAccountingFirmServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 会计事务所
 * @author: liangyt
 * @date: 2018年3月22日 下午5:28:05
 * @version V1.0
 */
@Service
public class TdxCompanyAccountingFirmServiceImpl implements TdxCompanyAccountingFirmService {

	@Autowired
	TdxCompanyAccountingFirmMapper tdxCompanyAccountingFirmMapper;

	@Override
	public void saveTdxCompanyAccountingFirm(TdxCompanyAccountingFirm tdxCompanyAccountingFirm) {
		TdxCompanyAccountingFirmExample example = new TdxCompanyAccountingFirmExample();
		example.or().andCompanyIdEqualTo(tdxCompanyAccountingFirm.getCompanyId())
				.andAccountingFirmIdEqualTo(tdxCompanyAccountingFirm.getAccountingFirmId());
		if (tdxCompanyAccountingFirmMapper.countByExample(example) > 0) {
			tdxCompanyAccountingFirmMapper.updateByExampleSelective(tdxCompanyAccountingFirm, example);
		} else {
			tdxCompanyAccountingFirmMapper.insertSelective(tdxCompanyAccountingFirm);
		}
	}

}
