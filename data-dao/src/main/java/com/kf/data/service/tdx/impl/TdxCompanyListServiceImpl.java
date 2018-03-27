package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyList;
import com.kf.data.mybatis.entity.tdx.TdxCompanyListExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyListMapper;
import com.kf.data.service.tdx.TdxCompanyListService;

/**
 * @Title: TdxCompanyListServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 挂牌信息
 * @author: liangyt
 * @date: 2018年3月22日 下午6:12:27
 * @version V1.0
 */
@Service
public class TdxCompanyListServiceImpl implements TdxCompanyListService {

	@Autowired
	TdxCompanyListMapper tdxCompanyListMapper;

	@Override
	public void saveTdxCompanyList(TdxCompanyList tdxCompanyList) {
		TdxCompanyListExample example = new TdxCompanyListExample();
		example.or().andCompanyIdEqualTo(tdxCompanyList.getCompanyId());
		if (tdxCompanyListMapper.countByExample(example) > 0) {
			tdxCompanyListMapper.updateByExampleSelective(tdxCompanyList, example);
		} else {
			tdxCompanyListMapper.insertSelective(tdxCompanyList);
		}

	}

}
