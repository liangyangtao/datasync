package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqNoticeRiskTipsOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqNoticeRiskTipsOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月16日 下午1:56:27
 * @version V1.0
 */
public interface NeeqNoticeRiskTipsOnlineService {
	public List<NeeqNoticeRiskTipsOnline> readNeeqNoticeRiskTipsOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
