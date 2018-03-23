package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxFinanceIndicator2015;
import com.kf.data.mybatis.entity.tdx.TdxFinanceIndicator2015Example;
import com.kf.data.mybatis.mapper.tdx.TdxFinanceIndicator2015Mapper;
import com.kf.data.service.tdx.TdxFinanceIndicator2015Service;

/**
 * @Title: TdxFinanceIndicator2015ServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午5:38:52
 * @version V1.0
 */
@Service
public class TdxFinanceIndicator2015ServiceImpl implements TdxFinanceIndicator2015Service {

	@Autowired
	TdxFinanceIndicator2015Mapper tdxFinanceIndicator2015Mapper;

	@Override
	public void saveTdxFinanceIndicator2015(TdxFinanceIndicator2015 tdxFinanceIndicator2015) {
		TdxFinanceIndicator2015Example example = new TdxFinanceIndicator2015Example();
		example.or().andCompanyIdEqualTo(tdxFinanceIndicator2015.getCompanyId())
				.andFinClassNameEqualTo(tdxFinanceIndicator2015.getFinClassName())
				.andFinDtEqualTo(tdxFinanceIndicator2015.getFinDt());
		if (tdxFinanceIndicator2015Mapper.countByExample(example) > 0) {
			tdxFinanceIndicator2015Mapper.updateByExampleSelective(tdxFinanceIndicator2015, example);
		} else {
			tdxFinanceIndicator2015Mapper.insertSelective(tdxFinanceIndicator2015);
		}
	}

}
