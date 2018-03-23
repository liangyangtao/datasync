package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqInformationReportOnline;
import com.kf.data.mybatis.entity.online.NeeqInformationReportOnlineExample;
import com.kf.data.mybatis.entity.online.NeeqInformationReportOnlineWithBLOBs;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqInformationReportOnlineMapper;
import com.kf.data.service.online.NeeqInformationReportOnlineService;

/**
 * @Title: NeeqInformationReportOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午4:40:17
 * @version V1.0
 */
@Service
public class NeeqInformationReportOnlineServiceImpl implements NeeqInformationReportOnlineService {

	@Autowired
	NeeqInformationReportOnlineMapper neeqInformationReportOnlineMapper;

	@Override
	public List<NeeqInformationReportOnlineWithBLOBs> readNeeqInformationReportOnlines(
			TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqInformationReportOnlineWithBLOBs> neeqInformationReportOnlines = null;
		NeeqInformationReportOnlineExample example = new NeeqInformationReportOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqInformationReportOnlines = neeqInformationReportOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqInformationReportOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqInformationReportOnlines = neeqInformationReportOnlineMapper.selectByExampleWithBLOBs(example);
			}
		}
		return neeqInformationReportOnlines;
	}

}
