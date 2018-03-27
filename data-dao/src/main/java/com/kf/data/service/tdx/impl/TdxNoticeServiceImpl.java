package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxNotice;
import com.kf.data.mybatis.entity.tdx.TdxNoticeExample;
import com.kf.data.mybatis.mapper.tdx.TdxNoticeMapper;
import com.kf.data.service.tdx.TdxNoticeService;

/**
 * @Title: TdxNoticeServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午2:34:02
 * @version V1.0
 */
@Service
public class TdxNoticeServiceImpl implements TdxNoticeService {

	@Autowired
	TdxNoticeMapper tdxNoticeMapper;

	@Override
	public void saveTdxNotice(TdxNotice tdxNotice) {
		TdxNoticeExample example = new TdxNoticeExample();
		example.or().andCodeEqualTo(tdxNotice.getCode()).andPublishDateEqualTo(tdxNotice.getPublishDate())
				.andTitleEqualTo(tdxNotice.getTitle());
		if (tdxNoticeMapper.countByExample(example) > 0) {
			tdxNoticeMapper.updateByExampleSelective(tdxNotice, example);
		} else {
			tdxNoticeMapper.insertSelective(tdxNotice);
		}
	}

}
