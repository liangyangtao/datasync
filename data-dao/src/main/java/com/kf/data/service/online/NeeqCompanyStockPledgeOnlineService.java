package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyStockPledgeOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyStockPledgeOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月16日 下午4:10:03
 * @version V1.0
 */
public interface NeeqCompanyStockPledgeOnlineService {
	public List<NeeqCompanyStockPledgeOnline> readNeeqCompanyStockPledgeOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
