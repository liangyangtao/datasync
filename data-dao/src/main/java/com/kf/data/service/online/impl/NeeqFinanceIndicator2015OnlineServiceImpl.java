package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqFinanceIndicator2015Online;
import com.kf.data.mybatis.entity.online.NeeqFinanceIndicator2015OnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqFinanceIndicator2015OnlineMapper;
import com.kf.data.service.online.NeeqFinanceIndicator2015OnlineService;

/**
 * @Title: NeeqFinanceIndicator2015OnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午5:57:56
 * @version V1.0
 */
@Service
public class NeeqFinanceIndicator2015OnlineServiceImpl implements NeeqFinanceIndicator2015OnlineService {

	@Autowired
	NeeqFinanceIndicator2015OnlineMapper neeqFinanceIndicator2015OnlineMapper;

	@Override
	public List<NeeqFinanceIndicator2015Online> readNeeqFinanceIndicator2015Onlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqFinanceIndicator2015Online> neeqFinanceIndicator2015Onlines = null;
		NeeqFinanceIndicator2015OnlineExample example = new NeeqFinanceIndicator2015OnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 10");
		neeqFinanceIndicator2015Onlines = neeqFinanceIndicator2015OnlineMapper.selectByExample(example);
		if (neeqFinanceIndicator2015Onlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqFinanceIndicator2015Onlines = neeqFinanceIndicator2015OnlineMapper.selectByExample(example);
			}
		}
		return neeqFinanceIndicator2015Onlines;
	}

}
