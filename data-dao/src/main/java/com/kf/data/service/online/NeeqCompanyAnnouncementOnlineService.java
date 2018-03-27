package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyAnnouncementOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyAnnouncementOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 上午10:00:53
 * @version V1.0
 */
public interface NeeqCompanyAnnouncementOnlineService {
	public List<NeeqCompanyAnnouncementOnline> readNeeqCompanyAnnouncementOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
