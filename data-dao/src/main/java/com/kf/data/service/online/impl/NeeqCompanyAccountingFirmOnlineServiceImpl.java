package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyAccountingFirmOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyAccountingFirmOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyAccountingFirmOnlineMapper;
import com.kf.data.service.online.NeeqCompanyAccountingFirmOnlineService;

/**
 * @Title: NeeqCompanyAccountingFirmOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description:会计
 * @author: liangyt
 * @date: 2018年3月22日 下午5:17:11
 * @version V1.0
 */
@Service
public class NeeqCompanyAccountingFirmOnlineServiceImpl implements NeeqCompanyAccountingFirmOnlineService {

	@Autowired
	NeeqCompanyAccountingFirmOnlineMapper neeqCompanyAccountingFirmOnlineMapper;

	@Override
	public List<NeeqCompanyAccountingFirmOnline> readNeeqCompanyAccountingFirmOnlines(
			TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyAccountingFirmOnline> neeqCompanyAccountingFirmOnlines = null;
		NeeqCompanyAccountingFirmOnlineExample example = new NeeqCompanyAccountingFirmOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyAccountingFirmOnlines = neeqCompanyAccountingFirmOnlineMapper.selectByExample(example);
		if (neeqCompanyAccountingFirmOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyAccountingFirmOnlines = neeqCompanyAccountingFirmOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyAccountingFirmOnlines;
	}

}
