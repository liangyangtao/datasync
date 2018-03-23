package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxFinanceIndicator2014;
import com.kf.data.mybatis.entity.tdx.TdxFinanceIndicator2014Example;
import com.kf.data.mybatis.mapper.tdx.TdxFinanceIndicator2014Mapper;
import com.kf.data.service.tdx.TdxFinanceIndicator2014Service;

/**
 * @Title: TdxFinanceIndicator2014ServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午5:38:42
 * @version V1.0
 */
@Service
public class TdxFinanceIndicator2014ServiceImpl implements TdxFinanceIndicator2014Service {

	@Autowired
	TdxFinanceIndicator2014Mapper tdxFinanceIndicator2014Mapper;

	@Override
	public void saveTdxFinanceIndicator2014(TdxFinanceIndicator2014 tdxFinanceIndicator2014) {
		TdxFinanceIndicator2014Example example = new TdxFinanceIndicator2014Example();
		example.or().andCompanyIdEqualTo(tdxFinanceIndicator2014.getCompanyId())
				.andFinClassNameEqualTo(tdxFinanceIndicator2014.getFinClassName())
				.andFinDtEqualTo(tdxFinanceIndicator2014.getFinDt());
		if (tdxFinanceIndicator2014Mapper.countByExample(example) > 0) {
			tdxFinanceIndicator2014Mapper.updateByExampleSelective(tdxFinanceIndicator2014, example);
		} else {
			tdxFinanceIndicator2014Mapper.insertSelective(tdxFinanceIndicator2014);
		}
	}

}
