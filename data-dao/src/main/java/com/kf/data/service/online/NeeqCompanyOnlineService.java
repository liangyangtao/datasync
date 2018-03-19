package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月19日 上午10:00:10
 * @version V1.0
 */
public interface NeeqCompanyOnlineService {
	public List<NeeqCompanyOnline> readNeeqCompanyOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
