package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyChangeOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyChangeOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月15日 下午2:03:10
 * @version V1.0
 */
public interface NeeqCompanyChangeOnlineService {

	public List<NeeqCompanyChangeOnline> readNeeqCompanyChangeOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
