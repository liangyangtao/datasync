package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxNoticeCertificate;
import com.kf.data.mybatis.entity.tdx.TdxNoticeCertificateExample;
import com.kf.data.mybatis.mapper.tdx.TdxNoticeCertificateMapper;
import com.kf.data.service.tdx.TdxNoticeCertificateService;

/**
 * @Title: TdxNoticeCertificateServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午5:14:10
 * @version V1.0
 */
@Service
public class TdxNoticeCertificateServiceImpl implements TdxNoticeCertificateService {

	@Autowired
	TdxNoticeCertificateMapper tdxNoticeCertificateMapper;

	@Override
	public void saveTdxNoticeCertificate(TdxNoticeCertificate tdxNoticeCertificate) {
		TdxNoticeCertificateExample example = new TdxNoticeCertificateExample();
		example.or().andCompanyIdEqualTo(tdxNoticeCertificate.getCompanyId())
				.andCertifSerialNumEqualTo(tdxNoticeCertificate.getCertifSerialNum());
		if (tdxNoticeCertificateMapper.countByExample(example) > 0) {
			tdxNoticeCertificateMapper.updateByExampleSelective(tdxNoticeCertificate, example);
		} else {
			tdxNoticeCertificateMapper.insertSelective(tdxNoticeCertificate);
		}
	}

}
