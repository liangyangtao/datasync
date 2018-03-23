package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyAccountingFirmOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyAccountingFirmOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午5:16:32
 * @version V1.0
 */
public interface NeeqCompanyAccountingFirmOnlineService {

	public List<NeeqCompanyAccountingFirmOnline> readNeeqCompanyAccountingFirmOnlines(
			TdxUpIndexOnline tdxUpIndexOnline);
}
