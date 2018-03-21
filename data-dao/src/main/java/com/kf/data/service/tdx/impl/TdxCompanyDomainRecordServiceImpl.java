package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyDomainRecord;
import com.kf.data.mybatis.entity.tdx.TdxCompanyDomainRecordExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyDomainRecordMapper;
import com.kf.data.service.tdx.TdxCompanyDomainRecordService;

/**
 * @Title: TdxCompanyDomainRecordServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午4:59:14
 * @version V1.0
 */
@Service
public class TdxCompanyDomainRecordServiceImpl implements TdxCompanyDomainRecordService {

	@Autowired
	TdxCompanyDomainRecordMapper tdxCompanyDomainRecordMapper;

	@Override
	public void saveTdxCompanyDomainRecord(TdxCompanyDomainRecord tdxCompanyDomainRecord) {
		TdxCompanyDomainRecordExample example = new TdxCompanyDomainRecordExample();
		example.or().andCompanyIdEqualTo(tdxCompanyDomainRecord.getCompanyId())
				.andDomainEqualTo(tdxCompanyDomainRecord.getDomain());
		if (tdxCompanyDomainRecordMapper.countByExample(example) > 0) {
			tdxCompanyDomainRecordMapper.updateByExampleSelective(tdxCompanyDomainRecord, example);
		} else {
			tdxCompanyDomainRecordMapper.insertSelective(tdxCompanyDomainRecord);
		}
	}

}
