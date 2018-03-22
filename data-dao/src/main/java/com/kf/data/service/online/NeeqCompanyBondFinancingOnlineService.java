package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyBondFinancingOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyBondFinancingOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 上午11:53:12
 * @version V1.0
 */
public interface NeeqCompanyBondFinancingOnlineService {
	public List<NeeqCompanyBondFinancingOnline> readNeeqCompanyBondFinancingOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
