package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyPatentOnlineExample;
import com.kf.data.mybatis.entity.online.NeeqCompanyPatentOnlineWithBLOBs;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyPatentOnlineMapper;
import com.kf.data.service.online.NeeqCompanyPatentOnlineService;

/**
 * @Title: NeeqCompanyPatentOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午2:26:37
 * @version V1.0
 */
@Service
public class NeeqCompanyPatentOnlineServiceImpl implements NeeqCompanyPatentOnlineService {

	@Autowired
	NeeqCompanyPatentOnlineMapper neeqCompanyPatentOnlineMapper;

	@Override
	public List<NeeqCompanyPatentOnlineWithBLOBs> readNeeqCompanyPatentOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		
		List<NeeqCompanyPatentOnlineWithBLOBs> neeqCompanyPatentOnlines = null;
		NeeqCompanyPatentOnlineExample example = new NeeqCompanyPatentOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyPatentOnlines = neeqCompanyPatentOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqCompanyPatentOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyPatentOnlines = neeqCompanyPatentOnlineMapper.selectByExampleWithBLOBs(example);
			}
		}
		return neeqCompanyPatentOnlines;
	}

}
