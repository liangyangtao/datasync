package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.KfCompanyDishonestyOnlineWithBLOBs;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: KfCompanyDishonestyOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月16日 下午3:26:45
 * @version V1.0
 */
public interface KfCompanyDishonestyOnlineService {
	public List<KfCompanyDishonestyOnlineWithBLOBs> readKfCompanyDishonestyOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
