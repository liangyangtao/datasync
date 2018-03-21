package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyPatentStatOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyPatentStatOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午6:05:09
 * @version V1.0
 */
public interface NeeqCompanyPatentStatOnlineService {
	public List<NeeqCompanyPatentStatOnline> readNeeqCompanyPatentStatOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
