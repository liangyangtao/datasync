package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyImExportOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyImExportOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午1:38:40
 * @version V1.0
 */
public interface NeeqCompanyImExportOnlineService {

	public List<NeeqCompanyImExportOnline> readNeeqCompanyImExportOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
