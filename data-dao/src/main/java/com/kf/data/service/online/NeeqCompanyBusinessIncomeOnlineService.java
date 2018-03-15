package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyBusinessIncomeOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyBusinessIncomeOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: 营收来源
 * @author: liangyt
 * @date: 2018年3月15日 下午1:56:47
 * @version V1.0
 */
public interface NeeqCompanyBusinessIncomeOnlineService {
	public List<NeeqCompanyBusinessIncomeOnline> readNeeqCompanyBusinessIncomeOnlines(
			TdxUpIndexOnline tdxUpIndexOnline);
}
