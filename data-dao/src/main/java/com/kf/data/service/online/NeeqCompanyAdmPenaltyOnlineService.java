package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyAdmPenaltyOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyAdmPenaltyOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月16日 下午3:57:14
 * @version V1.0
 */
public interface NeeqCompanyAdmPenaltyOnlineService {
	public List<NeeqCompanyAdmPenaltyOnline> readNeeqCompanyAdmPenaltyOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
