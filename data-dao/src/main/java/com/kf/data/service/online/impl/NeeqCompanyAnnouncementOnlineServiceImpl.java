package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyAnnouncementOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyAnnouncementOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyAnnouncementOnlineMapper;
import com.kf.data.service.online.NeeqCompanyAnnouncementOnlineService;

/**
 * @Title: NeeqCompanyAnnouncementOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 上午10:01:44
 * @version V1.0
 */
@Service
public class NeeqCompanyAnnouncementOnlineServiceImpl implements NeeqCompanyAnnouncementOnlineService {

	@Autowired
	NeeqCompanyAnnouncementOnlineMapper neeqCompanyAnnouncementOnlineMapper;

	@Override
	public List<NeeqCompanyAnnouncementOnline> readNeeqCompanyAnnouncementOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyAnnouncementOnline> neeqCompanyAnnouncementOnlines = null;
		NeeqCompanyAnnouncementOnlineExample example = new NeeqCompanyAnnouncementOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyAnnouncementOnlines = neeqCompanyAnnouncementOnlineMapper.selectByExample(example);
		if (neeqCompanyAnnouncementOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyAnnouncementOnlines = neeqCompanyAnnouncementOnlineMapper.selectByExample(example);
			}
		}
		return neeqCompanyAnnouncementOnlines;
	}

}
