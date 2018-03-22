package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyMainStaff;
import com.kf.data.mybatis.entity.tdx.TdxCompanyMainStaffExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyMainStaffMapper;
import com.kf.data.service.tdx.TdxCompanyMainStaffService;

/**
 * @Title: TdxCompanyMainStaffServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午2:32:46
 * @version V1.0
 */
@Service
public class TdxCompanyMainStaffServiceImpl implements TdxCompanyMainStaffService {

	@Autowired
	TdxCompanyMainStaffMapper tdxCompanyMainStaffMapper;

	@Override
	public void saveTdxCompanyMainStaff(TdxCompanyMainStaff tdxCompanyMainStaff) {
		TdxCompanyMainStaffExample example = new TdxCompanyMainStaffExample();
		example.or().andCompanyIdEqualTo(tdxCompanyMainStaff.getCompanyId())
				.andNameEqualTo(tdxCompanyMainStaff.getName()).andTitleEqualTo(tdxCompanyMainStaff.getTitle());
		if (tdxCompanyMainStaffMapper.countByExample(example) > 0) {
			tdxCompanyMainStaffMapper.updateByExampleSelective(tdxCompanyMainStaff, example);
		} else {
			tdxCompanyMainStaffMapper.insertSelective(tdxCompanyMainStaff);
		}

	}

}
