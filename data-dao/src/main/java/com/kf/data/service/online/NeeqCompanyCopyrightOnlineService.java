package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyCopyrightOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyCopyrightOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午2:31:51
 * @version V1.0
 */
public interface NeeqCompanyCopyrightOnlineService {
	public List<NeeqCompanyCopyrightOnline> readNeeqCompanyCopyrightOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
