package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyPatentStat;
import com.kf.data.mybatis.entity.tdx.TdxCompanyPatentStatExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyPatentStatMapper;
import com.kf.data.service.tdx.TdxCompanyPatentStatService;

/**
 * @Title: TdxCompanyPatentStatServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午6:01:05
 * @version V1.0
 */
@Service
public class TdxCompanyPatentStatServiceImpl implements TdxCompanyPatentStatService {

	@Autowired
	TdxCompanyPatentStatMapper tdxCompanyPatentStatMapper;

	@Override
	public void saveTdxCompanyPatentStat(TdxCompanyPatentStat tdxCompanyPatentStat) {
		TdxCompanyPatentStatExample example = new TdxCompanyPatentStatExample();
		example.or().andCompanyIdEqualTo(tdxCompanyPatentStat.getCompanyId())
				.andCategoryEqualTo(tdxCompanyPatentStat.getCategory());
		if (tdxCompanyPatentStatMapper.countByExample(example) > 0) {
			tdxCompanyPatentStatMapper.updateByExampleSelective(tdxCompanyPatentStat, example);
		} else {
			tdxCompanyPatentStatMapper.insertSelective(tdxCompanyPatentStat);
		}
	}

}
