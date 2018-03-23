package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxSecompanyBase;
import com.kf.data.mybatis.entity.tdx.TdxSecompanyBaseExample;
import com.kf.data.mybatis.mapper.tdx.TdxSecompanyBaseMapper;
import com.kf.data.service.tdx.TdxSecompanyBaseService;

/**
 * @Title: TdxSecompanyBaseServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 上午11:31:54
 * @version V1.0
 */
@Service
public class TdxSecompanyBaseServiceImpl implements TdxSecompanyBaseService {

	@Autowired
	TdxSecompanyBaseMapper tdxSecompanyBaseMapper;

	@Override
	public void saveTdxSecompanyBase(TdxSecompanyBase tdxSecompanyBase) {
		TdxSecompanyBaseExample example = new TdxSecompanyBaseExample();
		example.or().andSecompanyIdEqualTo(tdxSecompanyBase.getSecompanyId());
		if (tdxSecompanyBaseMapper.countByExample(example) > 0) {
			tdxSecompanyBaseMapper.updateByExampleSelective(tdxSecompanyBase, example);
		} else {
			tdxSecompanyBaseMapper.insertSelective(tdxSecompanyBase);
		}
	}

}
