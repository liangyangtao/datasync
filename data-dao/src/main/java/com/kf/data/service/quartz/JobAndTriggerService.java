package com.kf.data.service.quartz;

import com.github.pagehelper.PageInfo;
import com.kf.data.mybatis.entity.quartz.JobAndTrigger;

/**  
 * @Title:  JobAndTriggerService.java   
 * @Package com.kf.data.service.quartz   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: liangyt    
 * @date:   2018年3月26日 下午3:45:44   
 * @version V1.0 
 */
public interface JobAndTriggerService {

	/**
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	PageInfo<JobAndTrigger> getJobAndTriggerDetails(Integer pageNum, Integer pageSize);

}
