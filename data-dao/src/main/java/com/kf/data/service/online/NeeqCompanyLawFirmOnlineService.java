package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyLawFirmOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyLawFirmOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午4:32:37
 * @version V1.0
 */
public interface NeeqCompanyLawFirmOnlineService {

	public List<NeeqCompanyLawFirmOnline> readNeeqCompanyLawFirmOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
