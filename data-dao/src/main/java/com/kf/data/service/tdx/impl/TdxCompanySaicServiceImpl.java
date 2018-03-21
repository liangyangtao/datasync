package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanySaic;
import com.kf.data.mybatis.entity.tdx.TdxCompanySaicExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanySaicMapper;
import com.kf.data.service.tdx.TdxCompanySaicService;

/**
 * @Title: TdxCompanySaicServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 工商信息
 * @author: liangyt
 * @date: 2018年3月20日 下午5:29:35
 * @version V1.0
 */
@Service
public class TdxCompanySaicServiceImpl implements TdxCompanySaicService {

	@Autowired
	TdxCompanySaicMapper tdxCompanySaicMapper;

	@Override
	public void saveTdxCompanySaic(TdxCompanySaic tdxCompanySaic) {
		TdxCompanySaicExample example = new TdxCompanySaicExample();
		example.or().andCompanyIdEqualTo(tdxCompanySaic.getCompanyId());
		if (tdxCompanySaicMapper.countByExample(example) > 0) {
			tdxCompanySaicMapper.updateByExampleSelective(tdxCompanySaic, example);
		} else {
			tdxCompanySaicMapper.insertSelective(tdxCompanySaic);
		}
	}

}
