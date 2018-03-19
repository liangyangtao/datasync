package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.KfCompanyDishonestyOnlineExample;
import com.kf.data.mybatis.entity.online.KfCompanyDishonestyOnlineWithBLOBs;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.KfCompanyDishonestyOnlineMapper;
import com.kf.data.service.online.KfCompanyDishonestyOnlineService;

/**
 * @Title: KfCompanyDishonestyOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 失信信息
 * @author: liangyt
 * @date: 2018年3月16日 下午3:27:43
 * @version V1.0
 */
@Service
public class KfCompanyDishonestyOnlineServiceImpl implements KfCompanyDishonestyOnlineService {

	@Autowired
	KfCompanyDishonestyOnlineMapper kfCompanyDishonestyOnlineMapper;

	@Override
	public List<KfCompanyDishonestyOnlineWithBLOBs> readKfCompanyDishonestyOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<KfCompanyDishonestyOnlineWithBLOBs> kfCompanyDishonestyOnlines = null;
		KfCompanyDishonestyOnlineExample example = new KfCompanyDishonestyOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		kfCompanyDishonestyOnlines = kfCompanyDishonestyOnlineMapper.selectByExampleWithBLOBs(example);
		if (kfCompanyDishonestyOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				kfCompanyDishonestyOnlines = kfCompanyDishonestyOnlineMapper.selectByExampleWithBLOBs(example);
			}
		}
		return kfCompanyDishonestyOnlines;
	}

}
