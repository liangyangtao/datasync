package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyCorestaffOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyCorestaffOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月15日 下午4:16:35
 * @version V1.0
 */
public interface NeeqCompanyCorestaffOnlineService {
	public List<NeeqCompanyCorestaffOnline> readNeeqCompanyCorestaffOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
