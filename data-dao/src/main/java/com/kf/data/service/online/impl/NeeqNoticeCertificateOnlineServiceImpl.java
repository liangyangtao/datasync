package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqNoticeCertificateOnline;
import com.kf.data.mybatis.entity.online.NeeqNoticeCertificateOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqNoticeCertificateOnlineMapper;
import com.kf.data.service.online.NeeqNoticeCertificateOnlineService;

/**
 * @Title: NeeqNoticeCertificateOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午2:41:52
 * @version V1.0
 */
@Service
public class NeeqNoticeCertificateOnlineServiceImpl implements NeeqNoticeCertificateOnlineService {

	@Autowired
	NeeqNoticeCertificateOnlineMapper neeqNoticeCertificateOnlineMapper;

	@Override
	public List<NeeqNoticeCertificateOnline> readNeeqNoticeCertificateOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqNoticeCertificateOnline> neeqNoticeCertificateOnlines = null;
		NeeqNoticeCertificateOnlineExample example = new NeeqNoticeCertificateOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqNoticeCertificateOnlines = neeqNoticeCertificateOnlineMapper.selectByExample(example);
		if (neeqNoticeCertificateOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqNoticeCertificateOnlines = neeqNoticeCertificateOnlineMapper.selectByExample(example);
			}
		}
		return neeqNoticeCertificateOnlines;
	}

}
