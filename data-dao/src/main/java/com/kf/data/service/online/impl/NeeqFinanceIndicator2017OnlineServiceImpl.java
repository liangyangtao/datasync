package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqFinanceIndicator2017Online;
import com.kf.data.mybatis.entity.online.NeeqFinanceIndicator2017OnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqFinanceIndicator2017OnlineMapper;
import com.kf.data.service.online.NeeqFinanceIndicator2017OnlineService;

/**
 * @Title: NeeqFinanceIndicator2017OnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午7:77:77
 * @version V1.0
 */
@Service
public class NeeqFinanceIndicator2017OnlineServiceImpl implements NeeqFinanceIndicator2017OnlineService {

	@Autowired
	NeeqFinanceIndicator2017OnlineMapper neeqFinanceIndicator2017OnlineMapper;

	@Override
	public List<NeeqFinanceIndicator2017Online> readNeeqFinanceIndicator2017Onlines(TdxUpIndexOnline tdxUpIndexOnline) {
		List<NeeqFinanceIndicator2017Online> neeqFinanceIndicator2017Onlines = null;
		NeeqFinanceIndicator2017OnlineExample example = new NeeqFinanceIndicator2017OnlineExample();
		if (tdxUpIndexOnline.getUptime() == null) {
			example.or().andStatusEqualTo((byte) 1);
		} else {
			example.or().andUpdatedAtEqualTo(tdxUpIndexOnline.getUptime()).andIdGreaterThan(tdxUpIndexOnline.getUpid())
					.andStatusEqualTo((byte) 1);
		}
		example.setOrderByClause("id asc limit 10");
		neeqFinanceIndicator2017Onlines = neeqFinanceIndicator2017OnlineMapper.selectByExample(example);
		if (neeqFinanceIndicator2017Onlines.size() > 0) {

		} else {
			if (tdxUpIndexOnline.getUptime() != null) {
				example.or().andUpdatedAtGreaterThan(tdxUpIndexOnline.getUptime()).andStatusEqualTo((byte) 1);
				example.setOrderByClause("id asc limit 1");
				neeqFinanceIndicator2017Onlines = neeqFinanceIndicator2017OnlineMapper.selectByExample(example);
			}
		}
		return neeqFinanceIndicator2017Onlines;
	}

}
