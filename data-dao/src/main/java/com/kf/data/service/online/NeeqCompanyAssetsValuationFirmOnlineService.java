package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyAssetsValuationFirmOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyAssetsValuationFirmOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午5:22:03
 * @version V1.0
 */
public interface NeeqCompanyAssetsValuationFirmOnlineService {

	public List<NeeqCompanyAssetsValuationFirmOnline> readNeeqCompanyAssetsValuationFirmOnlines(
			TdxUpIndexOnline tdxUpIndexOnline);
}
