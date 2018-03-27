package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqEventsInvestInvestorsOnline;

/**
 * @Title: NeeqEventsInvestInvestorsOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 上午10:32:17
 * @version V1.0
 */
public interface NeeqEventsInvestInvestorsOnlineService {
	
	public List<NeeqEventsInvestInvestorsOnline> readNeeqEventsInvestInvestorsOnlinesByEventId(String eventId);
}
