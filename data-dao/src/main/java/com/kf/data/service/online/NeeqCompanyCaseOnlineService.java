package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyCaseOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyCaseOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月16日 下午4:32:57
 * @version V1.0
 */
public interface NeeqCompanyCaseOnlineService {

	public List<NeeqCompanyCaseOnline> readNeeqCompanyCaseOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
