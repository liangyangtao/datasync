package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqNewsOnlineExample;
import com.kf.data.mybatis.entity.online.NeeqNewsOnlineWithBLOBs;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqNewsOnlineMapper;
import com.kf.data.service.online.NeeqNewsOnlineService;

/**
 * @Title: NeeqNewsOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午2:52:44
 * @version V1.0
 */
@Service
public class NeeqNewsOnlineServiceImpl implements NeeqNewsOnlineService {
	@Autowired
	NeeqNewsOnlineMapper neeqNewsOnlineMapper;

	@Override
	public List<NeeqNewsOnlineWithBLOBs> readNeeqNewsOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqNewsOnlineWithBLOBs> neeqNewsOnlines = null;
		NeeqNewsOnlineExample example = new NeeqNewsOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqNewsOnlines = neeqNewsOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqNewsOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqNewsOnlines = neeqNewsOnlineMapper.selectByExampleWithBLOBs(example);
			}
		}
		return neeqNewsOnlines;
	}

}
