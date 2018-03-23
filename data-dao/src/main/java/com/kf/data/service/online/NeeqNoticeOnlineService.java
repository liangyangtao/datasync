package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqNoticeOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqNoticOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午2:39:53
 * @version V1.0
 */
public interface NeeqNoticeOnlineService {

	public List<NeeqNoticeOnline> readNeeqNoticeOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
