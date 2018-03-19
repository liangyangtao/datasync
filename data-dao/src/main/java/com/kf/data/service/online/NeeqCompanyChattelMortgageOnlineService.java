package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyChattelMortgageOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyChattelMortgageOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月16日 下午4:01:13
 * @version V1.0
 */
public interface NeeqCompanyChattelMortgageOnlineService {

	public List<NeeqCompanyChattelMortgageOnline> readNeeqCompanyChattelMortgageOnlines(
			TdxUpIndexOnline tdxUpIndexOnline);
}
