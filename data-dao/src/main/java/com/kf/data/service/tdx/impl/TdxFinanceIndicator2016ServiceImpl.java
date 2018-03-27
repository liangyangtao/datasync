package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxFinanceIndicator2016;
import com.kf.data.mybatis.entity.tdx.TdxFinanceIndicator2016Example;
import com.kf.data.mybatis.mapper.tdx.TdxFinanceIndicator2016Mapper;
import com.kf.data.service.tdx.TdxFinanceIndicator2016Service;

/**
 * @Title: TdxFinanceIndicator2016ServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午5:38:62
 * @version V1.0
 */
@Service
public class TdxFinanceIndicator2016ServiceImpl implements TdxFinanceIndicator2016Service {

	@Autowired
	TdxFinanceIndicator2016Mapper tdxFinanceIndicator2016Mapper;

	@Override
	public void saveTdxFinanceIndicator2016(TdxFinanceIndicator2016 tdxFinanceIndicator2016) {
		TdxFinanceIndicator2016Example example = new TdxFinanceIndicator2016Example();
		example.or().andCompanyIdEqualTo(tdxFinanceIndicator2016.getCompanyId())
				.andFinClassNameEqualTo(tdxFinanceIndicator2016.getFinClassName())
				.andFinDtEqualTo(tdxFinanceIndicator2016.getFinDt());
		if (tdxFinanceIndicator2016Mapper.countByExample(example) > 0) {
			tdxFinanceIndicator2016Mapper.updateByExampleSelective(tdxFinanceIndicator2016, example);
		} else {
			tdxFinanceIndicator2016Mapper.insertSelective(tdxFinanceIndicator2016);
		}
	}

}
