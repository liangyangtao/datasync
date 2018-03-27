package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyIndustryRatingOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyIndustryRatingService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月16日 上午10:37:31
 * @version V1.0
 */
public interface NeeqCompanyIndustryRatingOnlineService {
	public List<NeeqCompanyIndustryRatingOnline> readNeeqCompanyIndustryRatingOnlines(
			TdxUpIndexOnline tdxUpIndexOnline);
}
