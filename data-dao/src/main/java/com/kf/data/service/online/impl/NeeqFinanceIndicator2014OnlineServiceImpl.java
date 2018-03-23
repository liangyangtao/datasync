package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqFinanceIndicator2014Online;
import com.kf.data.mybatis.entity.online.NeeqFinanceIndicator2014OnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqFinanceIndicator2014OnlineMapper;
import com.kf.data.service.online.NeeqFinanceIndicator2014OnlineService;

/**
 * @Title: NeeqFinanceIndicator2014OnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午4:57:56
 * @version V1.0
 */
@Service
public class NeeqFinanceIndicator2014OnlineServiceImpl implements NeeqFinanceIndicator2014OnlineService {

	@Autowired
	NeeqFinanceIndicator2014OnlineMapper neeqFinanceIndicator2014OnlineMapper;

	@Override
	public List<NeeqFinanceIndicator2014Online> readNeeqFinanceIndicator2014Onlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqFinanceIndicator2014Online> neeqFinanceIndicator2014Onlines = null;
		NeeqFinanceIndicator2014OnlineExample example = new NeeqFinanceIndicator2014OnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 10");
		neeqFinanceIndicator2014Onlines = neeqFinanceIndicator2014OnlineMapper.selectByExample(example);
		if (neeqFinanceIndicator2014Onlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqFinanceIndicator2014Onlines = neeqFinanceIndicator2014OnlineMapper.selectByExample(example);
			}
		}
		return neeqFinanceIndicator2014Onlines;
	}

}
