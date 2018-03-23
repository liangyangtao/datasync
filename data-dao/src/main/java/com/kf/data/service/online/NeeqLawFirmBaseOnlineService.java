package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqLawFirmBaseOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqLawFirmBaseOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 上午10:44:33
 * @version V1.0
 */
public interface NeeqLawFirmBaseOnlineService {

	public List<NeeqLawFirmBaseOnline> readNeeqLawFirmBaseOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
