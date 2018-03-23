package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxFinanceIndicator2017;
import com.kf.data.mybatis.entity.tdx.TdxFinanceIndicator2017Example;
import com.kf.data.mybatis.mapper.tdx.TdxFinanceIndicator2017Mapper;
import com.kf.data.service.tdx.TdxFinanceIndicator2017Service;

/**
 * @Title: TdxFinanceIndicator2017ServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午5:38:72
 * @version V1.0
 */
@Service
public class TdxFinanceIndicator2017ServiceImpl implements TdxFinanceIndicator2017Service {

	@Autowired
	TdxFinanceIndicator2017Mapper tdxFinanceIndicator2017Mapper;

	@Override
	public void saveTdxFinanceIndicator2017(TdxFinanceIndicator2017 tdxFinanceIndicator2017) {
		TdxFinanceIndicator2017Example example = new TdxFinanceIndicator2017Example();
		example.or().andCompanyIdEqualTo(tdxFinanceIndicator2017.getCompanyId())
				.andFinClassNameEqualTo(tdxFinanceIndicator2017.getFinClassName())
				.andFinDtEqualTo(tdxFinanceIndicator2017.getFinDt());
		if (tdxFinanceIndicator2017Mapper.countByExample(example) > 0) {
			tdxFinanceIndicator2017Mapper.updateByExampleSelective(tdxFinanceIndicator2017, example);
		} else {
			tdxFinanceIndicator2017Mapper.insertSelective(tdxFinanceIndicator2017);
		}
	}

}
