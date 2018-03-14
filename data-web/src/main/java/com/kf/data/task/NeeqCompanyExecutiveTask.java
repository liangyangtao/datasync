package com.kf.data.task;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Title: NeeqCompanyExecutiveTask.java
 * @Package com.kf.data.task
 * @Description: 高管数据同步
 * @author: liangyt
 * @date: 2018年3月14日 下午4:07:32
 * @version V1.0
 */

@Component
@EnableScheduling
public class NeeqCompanyExecutiveTask {

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		
		

	}
}
