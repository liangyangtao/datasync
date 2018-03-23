package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxInformationReport;
import com.kf.data.mybatis.entity.tdx.TdxInformationReportExample;
import com.kf.data.mybatis.mapper.tdx.TdxInformationReportMapper;
import com.kf.data.service.tdx.TdxInformationReportService;

/**
 * @Title: TdxInformationReportServiceImpl.java
 * @Package com.kf.data.service.tdx.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午2:07:47
 * @version V1.0
 */
@Service
public class TdxInformationReportServiceImpl implements TdxInformationReportService {

	@Autowired
	TdxInformationReportMapper tdxInformationReportMapper;

	@Override
	public void saveTdxInformationReport(TdxInformationReport tdxInformationReport) {
		TdxInformationReportExample example = new TdxInformationReportExample();
		example.or().andTitleEqualTo(tdxInformationReport.getTitle())
				.andPublishDateEqualTo(tdxInformationReport.getPublishDate());
		if (tdxInformationReportMapper.countByExample(example) > 0) {
			tdxInformationReportMapper.updateByExampleSelective(tdxInformationReport, example);
		} else {
			tdxInformationReportMapper.insertSelective(tdxInformationReport);
		}
	}

}
