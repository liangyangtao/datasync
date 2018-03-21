package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyTag;
import com.kf.data.mybatis.entity.tdx.TdxCompanyTagExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyTagMapper;
import com.kf.data.service.tdx.TdxCompanyTagService;

/**
 * @Title: TdxCompanyTagServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: 公司标签
 * @author: liangyt
 * @date: 2018年3月20日 下午5:37:47
 * @version V1.0
 */
@Service
public class TdxCompanyTagServiceImpl implements TdxCompanyTagService {
	@Autowired
	TdxCompanyTagMapper tdxCompanyTagMapper;

	@Override
	public void saveTdxCompanyTag(TdxCompanyTag tdxCompanyTag) {
		TdxCompanyTagExample example = new TdxCompanyTagExample();
		example.or().andCompanyIdEqualTo(tdxCompanyTag.getCompanyId()).andTagNameEqualTo(tdxCompanyTag.getTagName());
		if (tdxCompanyTagMapper.countByExample(example) > 0) {
			tdxCompanyTagMapper.updateByExampleSelective(tdxCompanyTag, example);
		} else {
			tdxCompanyTagMapper.insertSelective(tdxCompanyTag);
		}
	}

}
