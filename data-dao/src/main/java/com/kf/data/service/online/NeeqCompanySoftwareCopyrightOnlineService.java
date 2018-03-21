package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanySoftwareCopyrightOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanySoftwareCopyrightOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午2:34:18
 * @version V1.0
 */
public interface NeeqCompanySoftwareCopyrightOnlineService {

	public List<NeeqCompanySoftwareCopyrightOnline> readNeeqCompanySoftwareCopyrightOnlines(
			TdxUpIndexOnline tdxUpIndexOnline);
}
