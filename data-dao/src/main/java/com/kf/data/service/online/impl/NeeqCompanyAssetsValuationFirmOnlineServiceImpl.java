package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyAssetsValuationFirmOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyAssetsValuationFirmOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqCompanyAssetsValuationFirmOnlineMapper;
import com.kf.data.service.online.NeeqCompanyAssetsValuationFirmOnlineService;

/**
 * @Title: NeeqCompanyAssetsValuationFirmOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 资产评估
 * @author: liangyt
 * @date: 2018年3月22日 下午5:22:44
 * @version V1.0
 */
@Service
public class NeeqCompanyAssetsValuationFirmOnlineServiceImpl implements NeeqCompanyAssetsValuationFirmOnlineService {
	@Autowired
	NeeqCompanyAssetsValuationFirmOnlineMapper neeqCompanyAssetsValuationFirmOnlineMapper;

	@Override
	public List<NeeqCompanyAssetsValuationFirmOnline> readNeeqCompanyAssetsValuationFirmOnlines(
			TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqCompanyAssetsValuationFirmOnline> neeqCompanyAssetsValuationFirmOnlines = null;
		NeeqCompanyAssetsValuationFirmOnlineExample example = new NeeqCompanyAssetsValuationFirmOnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 100");
		neeqCompanyAssetsValuationFirmOnlines = neeqCompanyAssetsValuationFirmOnlineMapper.selectByExample(example);
		if (neeqCompanyAssetsValuationFirmOnlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqCompanyAssetsValuationFirmOnlines = neeqCompanyAssetsValuationFirmOnlineMapper
						.selectByExample(example);
			}
		}
		return neeqCompanyAssetsValuationFirmOnlines;
	}

}
