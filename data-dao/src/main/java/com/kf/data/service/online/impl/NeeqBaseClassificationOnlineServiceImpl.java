package com.kf.data.service.online.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.online.NeeqBaseClassificationOnline;
import com.kf.data.mybatis.entity.online.NeeqBaseClassificationOnlineExample;
import com.kf.data.mybatis.mapper.online.NeeqBaseClassificationOnlineMapper;
import com.kf.data.service.online.NeeqBaseClassificationOnlineService;

/**
 * @Title: NeeqBaseClassificationOnlineServiceImpl.java
 * @Package com.kf.data.service.online.impl
 * @Description: 基本分类表
 * @author: liangyt
 * @date: 2018年3月23日 下午4:47:37
 * @version V1.0
 */
@Service
public class NeeqBaseClassificationOnlineServiceImpl implements NeeqBaseClassificationOnlineService {

	@Autowired
	NeeqBaseClassificationOnlineMapper neeqBaseClassificationOnlineMapper;

	@Override
	public List<NeeqBaseClassificationOnline> readNeeqBaseClassificationOnlineByClassId(String classId) {
		NeeqBaseClassificationOnlineExample example = new NeeqBaseClassificationOnlineExample();
		example.or().andClassificationIdEqualTo(classId);
		return neeqBaseClassificationOnlineMapper.selectByExample(example);
	}

}
