package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyAssetsValuationFirm;
import com.kf.data.mybatis.entity.tdx.TdxCompanyAssetsValuationFirmExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyAssetsValuationFirmMapper;
import com.kf.data.service.tdx.TdxCompanyAssetsValuationFirmService;

/**
 * @Title: TdxCompanyAssetsValuationFirmServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 资产评估
 * @author: liangyt
 * @date: 2018年3月22日 下午5:47:47
 * @version V1.0
 */
@Service
public class TdxCompanyAssetsValuationFirmServiceImpl implements TdxCompanyAssetsValuationFirmService {

	@Autowired
	TdxCompanyAssetsValuationFirmMapper tdxCompanyAssetsValuationFirmMapper;

	@Override
	public void saveTdxCompanyAssetsValuationFirm(TdxCompanyAssetsValuationFirm tdxCompanyAssetsValuationFirm) {
		TdxCompanyAssetsValuationFirmExample example = new TdxCompanyAssetsValuationFirmExample();
		example.or().andCompanyIdEqualTo(tdxCompanyAssetsValuationFirm.getCompanyId())
				.andAssetsValuationFirmIdEqualTo(tdxCompanyAssetsValuationFirm.getAssetsValuationFirmId());
		if (tdxCompanyAssetsValuationFirmMapper.countByExample(example) > 0) {
			tdxCompanyAssetsValuationFirmMapper.updateByExampleSelective(tdxCompanyAssetsValuationFirm, example);
		} else {
			tdxCompanyAssetsValuationFirmMapper.insertSelective(tdxCompanyAssetsValuationFirm);
		}
	}

}
