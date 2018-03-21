package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyPatentOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyPatentOnlineWithBLOBs;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyPatentOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午2:25:59
 * @version V1.0
 */
public interface NeeqCompanyPatentOnlineService {
	public List<NeeqCompanyPatentOnlineWithBLOBs> readNeeqCompanyPatentOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
