package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyMajorSupplier;
import com.kf.data.mybatis.entity.tdx.TdxCompanyMajorSupplierExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyMajorSupplierMapper;
import com.kf.data.service.tdx.TdxCompanyMajorSupplierService;

/**
 * @Title: TdxCompanyMajorSupplierServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 主要供应商
 * @author: liangyt
 * @date: 2018年3月15日 下午6:11:23
 * @version V1.0
 */
@Service
public class TdxCompanyMajorSupplierServiceImpl implements TdxCompanyMajorSupplierService {

	@Autowired
	TdxCompanyMajorSupplierMapper tdxCompanyMajorSupplierMapper;

	@Override
	public void saveTdxCompanyMajorSupplier(TdxCompanyMajorSupplier tdxCompanyMajorSupplier) {
		TdxCompanyMajorSupplierExample example = new TdxCompanyMajorSupplierExample();
		example.or().andStockCodeEqualTo(tdxCompanyMajorSupplier.getStockCode())
				.andReportDateEqualTo(tdxCompanyMajorSupplier.getReportDate())
				.andSupplierNameEqualTo(tdxCompanyMajorSupplier.getSupplierName());
		if (tdxCompanyMajorSupplierMapper.countByExample(example) > 0) {
			tdxCompanyMajorSupplierMapper.updateByExampleSelective(tdxCompanyMajorSupplier, example);
		} else {
			tdxCompanyMajorSupplierMapper.insertSelective(tdxCompanyMajorSupplier);
		}
	}

}
