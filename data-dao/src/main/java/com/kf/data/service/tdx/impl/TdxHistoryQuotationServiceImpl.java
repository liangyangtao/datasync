package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxHistoryQuotation;
import com.kf.data.mybatis.entity.tdx.TdxHistoryQuotationExample;
import com.kf.data.mybatis.mapper.tdx.TdxHistoryQuotationMapper;
import com.kf.data.service.tdx.TdxHistoryQuotationService;

/**
 * @Title: TdxHistoryQuotationServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午12:01:14
 * @version V1.0
 */
@Service
public class TdxHistoryQuotationServiceImpl implements TdxHistoryQuotationService {

	@Autowired
	TdxHistoryQuotationMapper tdxHistoryQuotationMapper;

	@Override
	public void saveTdxHistoryQuotation(TdxHistoryQuotation tdxHistoryQuotation) {
		TdxHistoryQuotationExample example = new TdxHistoryQuotationExample();
		example.or().andDateEqualTo(tdxHistoryQuotation.getDate()).andTimeEqualTo(tdxHistoryQuotation.getTime())
				.andStockCodeEqualTo(tdxHistoryQuotation.getStockCode());
		if (tdxHistoryQuotationMapper.countByExample(example) > 0) {
			tdxHistoryQuotationMapper.updateByExampleSelective(tdxHistoryQuotation, example);
		} else {
			tdxHistoryQuotationMapper.insertSelective(tdxHistoryQuotation);
		}
	}

}
