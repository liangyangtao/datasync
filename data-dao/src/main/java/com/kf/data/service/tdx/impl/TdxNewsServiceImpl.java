package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxNews;
import com.kf.data.mybatis.entity.tdx.TdxNewsExample;
import com.kf.data.mybatis.entity.tdx.TdxNews;
import com.kf.data.mybatis.mapper.tdx.TdxNewsMapper;
import com.kf.data.service.tdx.TdxNewsService;

/**
 * @Title: TdxNewsServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午2:58:52
 * @version V1.0
 */
@Service
public class TdxNewsServiceImpl implements TdxNewsService {

	@Autowired
	TdxNewsMapper tdxNewsMapper;

	@Override
	public void saveTdxNews(TdxNews tdxNews) {
		TdxNewsExample example = new TdxNewsExample();
		example.or().andTitleEqualTo(tdxNews.getTitle());
		if (tdxNewsMapper.countByExample(example) > 0) {
			tdxNewsMapper.updateByExampleSelective(tdxNews, example);
		} else {
			tdxNewsMapper.insertSelective(tdxNews);
		}
	}

}
