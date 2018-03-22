package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyImExportOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyImExportOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyImExportOnlineMapper;
import com.kf.data.service.online.NeeqCompanyImExportOnlineService;

/**
 * @Title: NeeqCompanyImExportOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午1:39:14
 * @version V1.0
 */
@Service
public class NeeqCompanyImExportOnlineServiceImpl implements NeeqCompanyImExportOnlineService {

	@Autowired
	NeeqCompanyImExportOnlineMapper neeqCompanyImExportOnlineMapper;

	@Override
	public List<NeeqCompanyImExportOnline> readNeeqCompanyImExportOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyImExportOnline> neeqCompanyImExportOnlines = null;
		NeeqCompanyImExportOnlineExample example = new NeeqCompanyImExportOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyImExportOnlines = neeqCompanyImExportOnlineMapper.selectByExample(example);
		if (neeqCompanyImExportOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyImExportOnlines = neeqCompanyImExportOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyImExportOnlines;
	}

}
