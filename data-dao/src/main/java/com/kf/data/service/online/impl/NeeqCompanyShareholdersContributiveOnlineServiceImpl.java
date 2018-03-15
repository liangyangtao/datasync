package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqCompanyShareholdersContributiveOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyShareholdersContributiveOnlineExample;
import com.kf.data.mybatis.mapper.online.NeeqCompanyShareholdersContributiveOnlineMapper;
import com.kf.data.service.online.NeeqCompanyShareholdersContributiveOnlineService;

/**
 * @Title: NeeqCompanyShareholdersContributiveOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 股东出资
 * @author: liangyt
 * @date: 2018年3月15日 上午9:48:43
 * @version V1.0
 */
@Service
public class NeeqCompanyShareholdersContributiveOnlineServiceImpl
		implements NeeqCompanyShareholdersContributiveOnlineService {

	@Autowired
	NeeqCompanyShareholdersContributiveOnlineMapper neeqCompanyShareholdersContributiveOnlineMapper;

	@Override
	public List<NeeqCompanyShareholdersContributiveOnline> readNeeqCompanyShareholdersContributiveOnlineById(
			String shareholderId) {
		NeeqCompanyShareholdersContributiveOnlineExample example = new NeeqCompanyShareholdersContributiveOnlineExample();
		example.or().andStockholderIdEqualTo(shareholderId);
		return neeqCompanyShareholdersContributiveOnlineMapper.selectByExample(example);
	}

}
