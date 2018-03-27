package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyExecutorOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyExecutorOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 上午9:52:00
 * @version V1.0
 */
public interface NeeqCompanyExecutorOnlineService {

	public List<NeeqCompanyExecutorOnline> readNeeqCompanyExecutorOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
