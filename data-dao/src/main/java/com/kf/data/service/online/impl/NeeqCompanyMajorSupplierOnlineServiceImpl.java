package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyMajorSupplierOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyMajorSupplierOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyMajorSupplierOnlineMapper;
import com.kf.data.service.online.NeeqCompanyMajorSupplierOnlineService;

/**
 * @Title: NeeqCompanyMajorSupplierOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 主要供应商
 * @author: liangyt
 * @date: 2018年3月15日 下午7:07:52
 * @version V1.0
 */
@Service
public class NeeqCompanyMajorSupplierOnlineServiceImpl implements NeeqCompanyMajorSupplierOnlineService {

	@Autowired
	NeeqCompanyMajorSupplierOnlineMapper neeqCompanyMajorSupplierOnlineMapper;

	@Override
	public List<NeeqCompanyMajorSupplierOnline> readNeeqCompanyMajorSupplierOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyMajorSupplierOnline> neeqCompanyMajorSupplierOnlines = null;
		NeeqCompanyMajorSupplierOnlineExample example = new NeeqCompanyMajorSupplierOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyMajorSupplierOnlines = neeqCompanyMajorSupplierOnlineMapper.selectByExample(example);
		if (neeqCompanyMajorSupplierOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyMajorSupplierOnlines = neeqCompanyMajorSupplierOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyMajorSupplierOnlines;
	}

}
