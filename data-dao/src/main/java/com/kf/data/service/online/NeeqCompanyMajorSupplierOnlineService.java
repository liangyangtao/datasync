package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyMajorSupplierOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyMajorSupplierOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月15日 下午7:07:13
 * @version V1.0
 */
public interface NeeqCompanyMajorSupplierOnlineService {
	public List<NeeqCompanyMajorSupplierOnline> readNeeqCompanyMajorSupplierOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
