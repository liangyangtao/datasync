package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyAnnouncement;
import com.kf.data.mybatis.entity.tdx.TdxCompanyAnnouncementExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyAnnouncementMapper;
import com.kf.data.service.tdx.TdxCompanyAnnouncementService;

/**
 * @Title: TdxCompanyAnnouncementServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 上午11:10:30
 * @version V1.0
 */
@Service
public class TdxCompanyAnnouncementServiceImpl implements TdxCompanyAnnouncementService {

	@Autowired
	TdxCompanyAnnouncementMapper tdxCompanyAnnouncementMapper;

	@Override
	public void saveTdxCompanyAnnouncement(TdxCompanyAnnouncement tdxCompanyAnnouncement) {
		TdxCompanyAnnouncementExample example = new TdxCompanyAnnouncementExample();
		example.or().andCompanyIdEqualTo(tdxCompanyAnnouncement.getCompanyId())
				.andCaseNoEqualTo(tdxCompanyAnnouncement.getCaseNo());
		if (tdxCompanyAnnouncementMapper.countByExample(example) > 0) {
			tdxCompanyAnnouncementMapper.updateByExampleSelective(tdxCompanyAnnouncement, example);
		} else {
			tdxCompanyAnnouncementMapper.insertSelective(tdxCompanyAnnouncement);
		}
	}

}
