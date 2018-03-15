package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyShareholdersContributiveOnline;

/**
 * @Title: NeeqCompanyShareholdersContributiveOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月15日 上午9:34:58
 * @version V1.0
 */
public interface NeeqCompanyShareholdersContributiveOnlineService {
	public List<NeeqCompanyShareholdersContributiveOnline> readNeeqCompanyShareholdersContributiveOnlineById(
			String shareholderId);

}
