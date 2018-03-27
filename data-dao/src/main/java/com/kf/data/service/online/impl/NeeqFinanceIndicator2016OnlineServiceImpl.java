package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqFinanceIndicator2016Online;
import com.kf.data.mybatis.entity.online.NeeqFinanceIndicator2016OnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqFinanceIndicator2016OnlineMapper;
import com.kf.data.service.online.NeeqFinanceIndicator2016OnlineService;

/**
 * @Title: NeeqFinanceIndicator2016OnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午6:67:66
 * @version V1.0
 */
@Service
public class NeeqFinanceIndicator2016OnlineServiceImpl implements NeeqFinanceIndicator2016OnlineService {

	@Autowired
	NeeqFinanceIndicator2016OnlineMapper neeqFinanceIndicator2016OnlineMapper;

	@Override
	public List<NeeqFinanceIndicator2016Online> readNeeqFinanceIndicator2016Onlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqFinanceIndicator2016Online> neeqFinanceIndicator2016Onlines = null;
		NeeqFinanceIndicator2016OnlineExample example = new NeeqFinanceIndicator2016OnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 10");
		neeqFinanceIndicator2016Onlines = neeqFinanceIndicator2016OnlineMapper.selectByExample(example);
		if (neeqFinanceIndicator2016Onlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqFinanceIndicator2016Onlines = neeqFinanceIndicator2016OnlineMapper.selectByExample(example);
			}
		}
		return neeqFinanceIndicator2016Onlines;
	}

}
