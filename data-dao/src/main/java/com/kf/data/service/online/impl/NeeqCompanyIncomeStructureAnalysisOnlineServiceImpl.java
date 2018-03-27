package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyIncomeStructureAnalysisOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyIncomeStructureAnalysisOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyIncomeStructureAnalysisOnlineMapper;
import com.kf.data.service.online.NeeqCompanyIncomeStructureAnalysisOnlineService;

/**
 * @Title: NeeqCompanyIncomeStructureAnalysisOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月27日 上午10:09:49
 * @version V1.0
 */
@Service
public class NeeqCompanyIncomeStructureAnalysisOnlineServiceImpl
		implements NeeqCompanyIncomeStructureAnalysisOnlineService {
	@Autowired
	NeeqCompanyIncomeStructureAnalysisOnlineMapper neeqCompanyIncomeStructureAnalysisOnlineMapper;

	@Override
	public List<NeeqCompanyIncomeStructureAnalysisOnline> readNeeqCompanyIncomeStructureAnalysisOnlines(
			TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyIncomeStructureAnalysisOnline> neeqCompanyIncomeStructureAnalysisOnlines = null;
		NeeqCompanyIncomeStructureAnalysisOnlineExample example = new NeeqCompanyIncomeStructureAnalysisOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 2);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 2);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyIncomeStructureAnalysisOnlines = neeqCompanyIncomeStructureAnalysisOnlineMapper
				.selectByExample(example);
		if (neeqCompanyIncomeStructureAnalysisOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 2);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyIncomeStructureAnalysisOnlines = neeqCompanyIncomeStructureAnalysisOnlineMapper
						.selectByExample(example);
			}
		}
		return neeqCompanyIncomeStructureAnalysisOnlines;
	}

}
