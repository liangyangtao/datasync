package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyDivOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyDivOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月15日 上午10:47:35
 * @version V1.0
 */
public interface NeeqCompanyDivOnlineService {

	public List<NeeqCompanyDivOnline> readNeeqCompanyDivOnlines(TdxUpIndexOnline tdxUpIndexOnline);

}
