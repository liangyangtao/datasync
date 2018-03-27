package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyExecutorOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyExecutorOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyExecutorOnlineMapper;
import com.kf.data.service.online.NeeqCompanyExecutorOnlineService;

/**
 * @Title: NeeqCompanyExecutorOnlineImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 上午9:54:08
 * @version V1.0
 */
@Service
public class NeeqCompanyExecutorOnlineServiceImpl implements NeeqCompanyExecutorOnlineService {

	@Autowired
	NeeqCompanyExecutorOnlineMapper neeqCompanyExecutorOnlineMapper;

	@Override
	public List<NeeqCompanyExecutorOnline> readNeeqCompanyExecutorOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyExecutorOnline> neeqCompanyExecutorOnlines = null;
		NeeqCompanyExecutorOnlineExample example = new NeeqCompanyExecutorOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyExecutorOnlines = neeqCompanyExecutorOnlineMapper.selectByExample(example);
		if (neeqCompanyExecutorOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyExecutorOnlines = neeqCompanyExecutorOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyExecutorOnlines;
	}

}
