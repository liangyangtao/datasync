package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqTagsOnline;
import com.kf.data.mybatis.entity.online.NeeqTagsOnlineExample;
import com.kf.data.mybatis.mapper.online.NeeqTagsOnlineMapper;
import com.kf.data.service.online.NeeqTagsOnlineService;

/**
 * @Title: NeeqTagsOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 公司标签
 * @author: liangyt
 * @date: 2018年3月20日 下午6:51:31
 * @version V1.0
 */
@Service
public class NeeqTagsOnlineServiceImpl implements NeeqTagsOnlineService {

	@Autowired
	NeeqTagsOnlineMapper neeqTagsOnlineMapper;

	@Override
	public List<NeeqTagsOnline> readNeeqTagsOnlinByTagId(String tagid) {
		NeeqTagsOnlineExample example = new NeeqTagsOnlineExample();
		example.or().andTagIdEqualTo(tagid);
		return neeqTagsOnlineMapper.selectByExample(example);
	}

}
