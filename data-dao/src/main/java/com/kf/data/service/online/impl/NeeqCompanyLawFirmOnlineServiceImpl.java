package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyLawFirmOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyLawFirmOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyLawFirmOnlineMapper;
import com.kf.data.service.online.NeeqCompanyLawFirmOnlineService;

/**
 * @Title: NeeqCompanyLawFirmOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 律师
 * @author: liangyt
 * @date: 2018年3月22日 下午4:33:31
 * @version V1.0
 */
@Service
public class NeeqCompanyLawFirmOnlineServiceImpl implements NeeqCompanyLawFirmOnlineService {

	@Autowired
	NeeqCompanyLawFirmOnlineMapper neeqCompanyLawFirmOnlineMapper;

	@Override
	public List<NeeqCompanyLawFirmOnline> readNeeqCompanyLawFirmOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyLawFirmOnline> neeqCompanyLawFirmOnlines = null;
		NeeqCompanyLawFirmOnlineExample example = new NeeqCompanyLawFirmOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyLawFirmOnlines = neeqCompanyLawFirmOnlineMapper.selectByExample(example);
		if (neeqCompanyLawFirmOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyLawFirmOnlines = neeqCompanyLawFirmOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyLawFirmOnlines;
	}

}
