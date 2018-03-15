package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqEventsIssuePlanOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqEventsIssuePlanOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月15日 上午10:59:59
 * @version V1.0
 */
public interface NeeqEventsIssuePlanOnlineService {
	public List<NeeqEventsIssuePlanOnline> readNeeqEventsIssuePlanOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
 