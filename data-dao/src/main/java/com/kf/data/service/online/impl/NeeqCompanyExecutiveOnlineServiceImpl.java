package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyExecutiveOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyExecutiveOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyExecutiveOnlineMapper;
import com.kf.data.service.online.NeeqCompanyExecutiveOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;

/**
 * @Title: NeeqCompanyExecutiveOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 公司高管
 * @author: liangyt
 * @date: 2018年3月14日 下午2:07:25
 * @version V1.0
 */
@Service
public class NeeqCompanyExecutiveOnlineServiceImpl implements NeeqCompanyExecutiveOnlineService {

	private static final String tableName = "neeq_company_executive";

	@Autowired
	NeeqCompanyExecutiveOnlineMapper neeqCompanyExecutiveOnlineMapper;

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Override
	public List<NeeqCompanyExecutiveOnline> readNeeqCompanyExecutiveOnlines() {
		List<NeeqCompanyExecutiveOnline> neeqCompanyExecutiveOnlines = null;
		try {
			List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
			NeeqCompanyExecutiveOnlineExample example = new NeeqCompanyExecutiveOnlineExample();
			TdxUpIndexOnline tdxUpIndexOnline = null;
			if (tdxUpIndexs.size() > 0) {
				tdxUpIndexOnline = tdxUpIndexs.get(0);
				example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime())
						.andIdGreaterThan(tdxUpIndexOnline.getUpid());
			} else {
				tdxUpIndexOnline = new TdxUpIndexOnline();
			}
			example.setOrderByClause("id asc limit 100");
			neeqCompanyExecutiveOnlines = neeqCompanyExecutiveOnlineMapper.selectByExample(example);
			if (neeqCompanyExecutiveOnlines.size() > 0) {
				NeeqCompanyExecutiveOnline neeqCompanyExecutiveOnline = neeqCompanyExecutiveOnlines
						.get(neeqCompanyExecutiveOnlines.size() - 1);
				tdxUpIndexOnline.setTable(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyExecutiveOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyExecutiveOnline.getUpdatedAt());
				tdxUpIndexOnlineService.saveTdxUpIndexOnline(tdxUpIndexOnline);
			} else {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime());
				example.setOrderByClause("id asc limit 1");
				neeqCompanyExecutiveOnlines = neeqCompanyExecutiveOnlineMapper.selectByExample(example);
				if (neeqCompanyExecutiveOnlines.size() > 0) {
					NeeqCompanyExecutiveOnline neeqCompanyExecutiveOnline = neeqCompanyExecutiveOnlines
							.get(neeqCompanyExecutiveOnlines.size() - 1);
					tdxUpIndexOnline.setTable(tableName);
					tdxUpIndexOnline.setUpid(neeqCompanyExecutiveOnline.getId());
					tdxUpIndexOnline.setUptime(neeqCompanyExecutiveOnline.getUpdatedAt());
					tdxUpIndexOnlineService.saveTdxUpIndexOnline(tdxUpIndexOnline);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return neeqCompanyExecutiveOnlines;
	}

}
