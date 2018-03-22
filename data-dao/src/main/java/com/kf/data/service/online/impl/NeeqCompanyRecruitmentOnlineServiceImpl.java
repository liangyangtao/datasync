package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyRecruitmentOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyRecruitmentOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyRecruitmentOnlineMapper;
import com.kf.data.service.online.NeeqCompanyRecruitmentOnlineService;

/**
 * @Title: NeeqCompanyRecruitmentOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 招聘信息
 * @author: liangyt
 * @date: 2018年3月22日 下午1:50:15
 * @version V1.0
 */
@Service
public class NeeqCompanyRecruitmentOnlineServiceImpl implements NeeqCompanyRecruitmentOnlineService {

	@Autowired
	NeeqCompanyRecruitmentOnlineMapper neeqCompanyRecruitmentOnlineMapper;

	@Override
	public List<NeeqCompanyRecruitmentOnline> readNeeqCompanyRecruitmentOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyRecruitmentOnline> neeqCompanyRecruitmentOnlines = null;
		NeeqCompanyRecruitmentOnlineExample example = new NeeqCompanyRecruitmentOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyRecruitmentOnlines = neeqCompanyRecruitmentOnlineMapper.selectByExampleWithBLOBs(example);
		if (neeqCompanyRecruitmentOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyRecruitmentOnlines = neeqCompanyRecruitmentOnlineMapper.selectByExampleWithBLOBs(example);
			}
		}
		return neeqCompanyRecruitmentOnlines;
	}
}
