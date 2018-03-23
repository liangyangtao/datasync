package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqSecompanyMarketMakingHisOnline;

/**
 * @Title: NeeqSecompanyMarketMakingHisOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 上午11:19:20
 * @version V1.0
 */
public interface NeeqSecompanyMarketMakingHisOnlineService {

	public List<NeeqSecompanyMarketMakingHisOnline> readNeeqSecompanyMarketMakingHisOnlinesByCompanyId(String companyId);
}
