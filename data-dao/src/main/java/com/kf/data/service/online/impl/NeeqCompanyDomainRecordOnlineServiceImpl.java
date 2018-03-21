package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyDomainRecordOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyDomainRecordOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyDomainRecordOnlineMapper;
import com.kf.data.service.online.NeeqCompanyDomainRecordOnlineService;

/**
 * @Title: NeeqCompanyDomainRecordOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 域名
 * @author: liangyt
 * @date: 2018年3月21日 下午2:38:50
 * @version V1.0
 */
@Service
public class NeeqCompanyDomainRecordOnlineServiceImpl implements NeeqCompanyDomainRecordOnlineService {

	@Autowired
	NeeqCompanyDomainRecordOnlineMapper neeqCompanyDomainRecordOnlineMapper;

	@Override
	public List<NeeqCompanyDomainRecordOnline> readNeeqCompanyDomainRecordOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyDomainRecordOnline> neeqCompanyDomainRecordOnlines = null;
		NeeqCompanyDomainRecordOnlineExample example = new NeeqCompanyDomainRecordOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyDomainRecordOnlines = neeqCompanyDomainRecordOnlineMapper.selectByExample(example);
		if (neeqCompanyDomainRecordOnlines.size() > 0) {
		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyDomainRecordOnlines = neeqCompanyDomainRecordOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyDomainRecordOnlines;
	}

}
