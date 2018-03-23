package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqAccountingFirmBaseOnline;
import com.kf.data.mybatis.entity.online.NeeqAccountingFirmBaseOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqAccountingFirmBaseOnlineMapper;
import com.kf.data.service.online.NeeqAccountingFirmBaseOnlineService;

/**
 * @Title: NeeqAccountingFirmBaseOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午4:09:28
 * @version V1.0
 */
@Service
public class NeeqAccountingFirmBaseOnlineServiceImpl implements NeeqAccountingFirmBaseOnlineService {

	@Autowired
	NeeqAccountingFirmBaseOnlineMapper neeqAccountingFirmBaseOnlineMapper;

	@Override
	public List<NeeqAccountingFirmBaseOnline> readNeeqAccountingFirmBaseOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqAccountingFirmBaseOnline> neeqAccountingFirmBaseOnlines = null;
		NeeqAccountingFirmBaseOnlineExample example = new NeeqAccountingFirmBaseOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqAccountingFirmBaseOnlines = neeqAccountingFirmBaseOnlineMapper.selectByExample(example);
		if (neeqAccountingFirmBaseOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqAccountingFirmBaseOnlines = neeqAccountingFirmBaseOnlineMapper.selectByExample(example);
			}
		}
		return neeqAccountingFirmBaseOnlines;
	}

}
