package com.kf.data.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Title: BaseJob.java
 * @Package com.kf.data.job
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月26日 下午3:39:19
 * @version V1.0
 */
public interface BaseJob extends Job {
	public void execute(JobExecutionContext context) throws JobExecutionException;

}
