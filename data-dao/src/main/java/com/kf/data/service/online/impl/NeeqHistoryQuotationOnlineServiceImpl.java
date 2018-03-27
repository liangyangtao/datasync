package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqHistoryQuotationOnline;
import com.kf.data.mybatis.entity.online.NeeqHistoryQuotationOnlineExample;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.mapper.online.NeeqHistoryQuotationOnlineMapper;
import com.kf.data.service.online.NeeqHistoryQuotationOnlineService;

/**
 * @Title: NeeqHistoryQuotationOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 历史行情
 * @author: liangyt
 * @date: 2018年3月22日 下午4:44:21
 * @version V1.0
 */
@Service
public class NeeqHistoryQuotationOnlineServiceImpl implements NeeqHistoryQuotationOnlineService {

	@Autowired
	NeeqHistoryQuotationOnlineMapper neeqHistoryQuotationOnlineMapper;

	@Override
	public List<NeeqHistoryQuotationOnline> readNeeqHistoryQuotationOnlines(TdxUpIndexOnline tdxUpIndexOnline) {
		NeeqHistoryQuotationOnlineExample example = new NeeqHistoryQuotationOnlineExample();
		if (tdxUpIndexOnline != null && tdxUpIndexOnline.getUpid() != null) {
			example.or().andIdGreaterThan(tdxUpIndexOnline.getUpid());
		}
		example.setOrderByClause("id asc limit 100");
		return neeqHistoryQuotationOnlineMapper.selectByExample(example);
	}

}
