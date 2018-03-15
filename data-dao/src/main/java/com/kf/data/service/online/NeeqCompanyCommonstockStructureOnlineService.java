package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyCommonstockStructureOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyCommonstockStructureOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月15日 上午10:19:05
 * @version V1.0
 */
public interface NeeqCompanyCommonstockStructureOnlineService {
	public List<NeeqCompanyCommonstockStructureOnline> readNeeqCompanyCommonstockStructureOnlines(
			TdxUpIndexOnline tdxUpIndexOnline);
}
