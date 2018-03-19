package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyJudicialAuctionOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyJudicialAuctionOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月16日 下午4:04:48
 * @version V1.0
 */
public interface NeeqCompanyJudicialAuctionOnlineService {

	public List<NeeqCompanyJudicialAuctionOnline> readNeeqCompanyJudicialAuctionOnlines(
			TdxUpIndexOnline tdxUpIndexOnline);
}
