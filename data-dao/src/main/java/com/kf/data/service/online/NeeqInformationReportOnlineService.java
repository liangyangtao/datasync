package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqInformationReportOnline;
import com.kf.data.mybatis.entity.online.NeeqInformationReportOnlineWithBLOBs;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqInformationReportOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午4:39:18
 * @version V1.0
 */
public interface NeeqInformationReportOnlineService {

	public List<NeeqInformationReportOnlineWithBLOBs> readNeeqInformationReportOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
