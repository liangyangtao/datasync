package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyBusinessModel;
import com.kf.data.mybatis.entity.tdx.TdxCompanyBusinessModelExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyBusinessModelMapper;
import com.kf.data.service.tdx.TdxCompanyBusinessModelService;

/**  
 * @Title:  TdxCompanyBusinessModelServiceImpl.java   
 * @Package com.kf.data.service.tdx.impl   
 * @Description:   商业模式
 * @author: liangyt    
 * @date:   2018年3月15日 下午6:05:54   
 * @version V1.0 
 */
@Service
public class TdxCompanyBusinessModelServiceImpl implements TdxCompanyBusinessModelService {

	@Autowired
	TdxCompanyBusinessModelMapper tdxCompanyBusinessModelMapper;

	@Override
	public void saveTdxCompanyBusinessModel(TdxCompanyBusinessModel tdxCompanyBusinessModel) {
		TdxCompanyBusinessModelExample example = new TdxCompanyBusinessModelExample();
		example.or().andStockCodeEqualTo(tdxCompanyBusinessModel.getStockCode())
		.andReportDateEqualTo(tdxCompanyBusinessModel.getReportDate());
		if (tdxCompanyBusinessModelMapper.countByExample(example) > 0) {
			tdxCompanyBusinessModelMapper.updateByExampleSelective(tdxCompanyBusinessModel, example);
		} else {
			tdxCompanyBusinessModelMapper.insertSelective(tdxCompanyBusinessModel);
		}
	}


}
