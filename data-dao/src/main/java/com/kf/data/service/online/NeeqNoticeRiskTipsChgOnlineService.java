package com.kf.data.service.online;

import java.util.Date;
import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqNoticeRiskTipsChgOnline;

/**
 * @Title: NeeqNoticeRiskTipsChgOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月16日 下午2:10:15
 * @version V1.0
 */
public interface NeeqNoticeRiskTipsChgOnlineService {

	public List<NeeqNoticeRiskTipsChgOnline> readNeeqNoticeRiskTipsChgOnlineByIdAndDate(String companyId,
			Date reportDate);
}
