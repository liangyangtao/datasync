package com.kf.data.mybatis.mapper.quartz;

import java.util.List;

import com.kf.data.mybatis.entity.quartz.JobAndTrigger;


public interface JobAndTriggerMapper {
	public List<JobAndTrigger> getJobAndTriggerDetails();
}
