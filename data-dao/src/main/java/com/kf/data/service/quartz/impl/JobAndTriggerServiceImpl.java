package com.kf.data.service.quartz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.kf.data.mybatis.entity.quartz.JobAndTrigger;
import com.kf.data.mybatis.mapper.quartz.JobAndTriggerMapper;
import com.kf.data.service.quartz.JobAndTriggerService;


/**
 * @Title: JobAndTriggerServiceImpl.java
 * @Package com.kf.data.service.quartz.impl
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月26日 下午5:20:47
 * @version V1.0
 */
@Service
public class JobAndTriggerServiceImpl implements JobAndTriggerService {

	@Autowired
	private JobAndTriggerMapper jobAndTriggerMapper;

	@Override
	public PageInfo<JobAndTrigger> getJobAndTriggerDetails(Integer pageNum, Integer pageSize) {
		List<JobAndTrigger> list = jobAndTriggerMapper.getJobAndTriggerDetails();
		PageInfo<JobAndTrigger> page = new PageInfo<JobAndTrigger>(list);
		return page;
	}

}
