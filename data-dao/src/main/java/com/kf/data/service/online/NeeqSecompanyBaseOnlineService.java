package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqSecompanyBaseOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqSecompanyBaseOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午4:04:37
 * @version V1.0
 */
public interface NeeqSecompanyBaseOnlineService {
	public List<NeeqSecompanyBaseOnline> readNeeqSecompanyBaseOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
