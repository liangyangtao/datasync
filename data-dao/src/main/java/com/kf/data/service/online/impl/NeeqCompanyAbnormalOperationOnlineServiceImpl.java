package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyAbnormalOperationOnlineExample;
import com.kf.data.mybatis.entity.online.NeeqCompanyAbnormalOperationOnlineWithBLOBs;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyAbnormalOperationOnlineMapper;
import com.kf.data.service.online.NeeqCompanyAbnormalOperationOnlineService;

/**
 * @Title: NeeqCompanyAbnormalOperationOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 经营异常
 * @author: liangyt
 * @date: 2018年3月16日 下午3:54:00
 * @version V1.0
 */
@Service
public class NeeqCompanyAbnormalOperationOnlineServiceImpl implements NeeqCompanyAbnormalOperationOnlineService {

	@Autowired
	NeeqCompanyAbnormalOperationOnlineMapper neeqCompanyAbnormalOperationOnlineMapper;

	@Override
	public List<NeeqCompanyAbnormalOperationOnlineWithBLOBs> readNeeqCompanyAbnormalOperationOnlines(
			TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyAbnormalOperationOnlineWithBLOBs> neeqCompanyAbnormalOperationOnlines = null;
		NeeqCompanyAbnormalOperationOnlineExample example = new NeeqCompanyAbnormalOperationOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyAbnormalOperationOnlines = neeqCompanyAbnormalOperationOnlineMapper
				.selectByExampleWithBLOBs(example);
		if (neeqCompanyAbnormalOperationOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyAbnormalOperationOnlines = neeqCompanyAbnormalOperationOnlineMapper
						.selectByExampleWithBLOBs(example);
			}
		}
		return neeqCompanyAbnormalOperationOnlines;
	}

}
