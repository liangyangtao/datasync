package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqEventsInvestOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqEventsInvestOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月16日 上午11:48:29
 * @version V1.0
 */
public interface NeeqEventsInvestOnlineService {
	public List<NeeqEventsInvestOnline> readNeeqEventsInvestOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
