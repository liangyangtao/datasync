package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyMajorClientOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyMajorClientOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月15日 下午6:58:04
 * @version V1.0
 */
public interface NeeqCompanyMajorClientOnlineService {
	public List<NeeqCompanyMajorClientOnline> readNeeqCompanyMajorClientOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
