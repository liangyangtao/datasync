package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyBranchOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyBranchOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: 
 * @author: liangyt
 * @date: 2018年3月15日 下午1:52:52
 * @version V1.0
 */
public interface NeeqCompanyBranchOnlineService {
	public List<NeeqCompanyBranchOnline> readNeeqCompanyBranchOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
