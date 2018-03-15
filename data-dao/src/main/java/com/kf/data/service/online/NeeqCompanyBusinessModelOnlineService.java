package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyBusinessModelOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyBusinessModelOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月15日 下午1:58:11
 * @version V1.0
 */
public interface NeeqCompanyBusinessModelOnlineService {
	public List<NeeqCompanyBusinessModelOnline> readNeeqCompanyBusinessModelOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
