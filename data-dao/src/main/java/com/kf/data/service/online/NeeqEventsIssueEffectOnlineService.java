package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqEventsIssueEffectOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqEventsIssueEffectOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月15日 下午4:44:23
 * @version V1.0
 */
public interface NeeqEventsIssueEffectOnlineService {

	public List<NeeqEventsIssueEffectOnline> readNeeqEventsIssueEffectOnlineByid(String eventsId);

	public List<NeeqEventsIssueEffectOnline> readNeeqEventsIssueEffectOnlines(TdxUpIndexOnline tdxUpIndexOnline);

}
