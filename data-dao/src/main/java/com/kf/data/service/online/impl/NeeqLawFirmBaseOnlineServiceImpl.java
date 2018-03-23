package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqLawFirmBaseOnline;
import com.kf.data.mybatis.entity.online.NeeqLawFirmBaseOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqLawFirmBaseOnlineMapper;
import com.kf.data.service.online.NeeqLawFirmBaseOnlineService;

/**
 * @Title: NeeqLawFirmBaseOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 上午10:45:32
 * @version V1.0
 */
@Service
public class NeeqLawFirmBaseOnlineServiceImpl implements NeeqLawFirmBaseOnlineService {

	@Autowired
	NeeqLawFirmBaseOnlineMapper neeqLawFirmBaseOnlineMapper;

	@Override
	public List<NeeqLawFirmBaseOnline> readNeeqLawFirmBaseOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqLawFirmBaseOnline> neeqLawFirmBaseOnlines = null;
		NeeqLawFirmBaseOnlineExample example = new NeeqLawFirmBaseOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqLawFirmBaseOnlines = neeqLawFirmBaseOnlineMapper.selectByExample(example);
		if (neeqLawFirmBaseOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqLawFirmBaseOnlines = neeqLawFirmBaseOnlineMapper.selectByExample(example);
			}
		}
		return neeqLawFirmBaseOnlines;
	}

}
