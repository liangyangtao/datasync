package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: TdxUpIndexService.java
 * @Package com.kf.data.service.tdx
 * @Description: 同步索引
 * @author: liangyt
 * @date: 2018年3月14日 下午3:16:34
 * @version V1.0
 */
public interface TdxUpIndexOnlineService {

	public void saveTdxUpIndexOnline(TdxUpIndexOnline tdxUpIndexOnline);

	public List<TdxUpIndexOnline> readTdxUpIndexOnlineByTableName(String tableName);
	

}
