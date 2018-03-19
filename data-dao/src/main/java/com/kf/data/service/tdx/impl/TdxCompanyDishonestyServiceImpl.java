package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyDishonestyExample;
import com.kf.data.mybatis.entity.tdx.TdxCompanyDishonestyWithBLOBs;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyDishonestyMapper;
import com.kf.data.service.tdx.TdxCompanyDishonestyService;

/**
 * @Title: TdxCompanyDishonestyServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月16日 下午3:33:55
 * @version V1.0
 */
@Service
public class TdxCompanyDishonestyServiceImpl implements TdxCompanyDishonestyService {

	@Autowired
	TdxCompanyDishonestyMapper tdxCompanyDishonestyMapper;

	@Override
	public void saveTdxCompanyDishonesty(TdxCompanyDishonestyWithBLOBs tdxCompanyDishonesty) {
		TdxCompanyDishonestyExample example = new TdxCompanyDishonestyExample();
		example.or().andCaseNumberEqualTo(tdxCompanyDishonesty.getCaseNumber())
				.andCompanyIdEqualTo(tdxCompanyDishonesty.getCompanyId());
		if (tdxCompanyDishonestyMapper.countByExample(example) > 0) {
			tdxCompanyDishonestyMapper.updateByExampleSelective(tdxCompanyDishonesty, example);
		} else {
			tdxCompanyDishonestyMapper.insertSelective(tdxCompanyDishonesty);
		}
	}

}
