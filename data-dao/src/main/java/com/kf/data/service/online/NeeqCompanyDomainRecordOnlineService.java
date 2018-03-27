package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyDomainRecordOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyDomainRecordOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: 
 * @author: liangyt
 * @date: 2018年3月21日 下午2:37:12
 * @version V1.0
 */
public interface NeeqCompanyDomainRecordOnlineService {
	public List<NeeqCompanyDomainRecordOnline> readNeeqCompanyDomainRecordOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
