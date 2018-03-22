package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxCompanyImExPort;
import com.kf.data.mybatis.entity.tdx.TdxCompanyImExPortExample;
import com.kf.data.mybatis.mapper.tdx.TdxCompanyImExPortMapper;
import com.kf.data.service.tdx.TdxCompanyImExPortService;

/**
 * @Title: TdxCompanyImExPortServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午2:44:27
 * @version V1.0
 */
@Service
public class TdxCompanyImExPortServiceImpl implements TdxCompanyImExPortService {

	@Autowired
	TdxCompanyImExPortMapper tdxCompanyImExPortMapper;

	@Override
	public void saveTdxCompanyImExPort(TdxCompanyImExPort tdxCompanyImExPort) {
		TdxCompanyImExPortExample example = new TdxCompanyImExPortExample();
		example.or().andCompanyIdEqualTo(tdxCompanyImExPort.getCompanyId())
				.andRegisterNumberEqualTo(tdxCompanyImExPort.getRegisterNumber());
		if (tdxCompanyImExPortMapper.countByExample(example) > 0) {
			tdxCompanyImExPortMapper.updateByExampleSelective(tdxCompanyImExPort, example);
		} else {
			tdxCompanyImExPortMapper.insertSelective(tdxCompanyImExPort);
		}
	}

}
