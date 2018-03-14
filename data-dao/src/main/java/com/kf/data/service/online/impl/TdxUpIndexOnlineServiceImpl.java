package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnlineExample;
import com.kf.data.mybatis.mapper.online.TdxUpIndexOnlineMapper;
import com.kf.data.service.online.TdxUpIndexOnlineService;

/**
 * @Title: TdxUpIndexServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 同步索引
 * @author: liangyt
 * @date: 2018年3月14日 下午3:18:40
 * @version V1.0
 */
@Service
public class TdxUpIndexOnlineServiceImpl implements TdxUpIndexOnlineService {

	@Autowired
	TdxUpIndexOnlineMapper tdxUpIndexOnlineMapper;

	@Override
	public void saveTdxUpIndexOnline(TdxUpIndexOnline tdxUpIndex) {
		TdxUpIndexOnlineExample example = new TdxUpIndexOnlineExample();
		example.or().andTableEqualTo(tdxUpIndex.getTable());
		if (tdxUpIndexOnlineMapper.countByExample(example) > 0) {
			tdxUpIndexOnlineMapper.updateByExample(tdxUpIndex, example);
		} else {
			tdxUpIndexOnlineMapper.insertSelective(tdxUpIndex);
		}

	}

	@Override
	public List<TdxUpIndexOnline> readTdxUpIndexOnlineByTableName(String tableName) {
		TdxUpIndexOnlineExample example = new TdxUpIndexOnlineExample();
		example.or().andTableEqualTo(tableName);
		return tdxUpIndexOnlineMapper.selectByExample(example);
	}

}
