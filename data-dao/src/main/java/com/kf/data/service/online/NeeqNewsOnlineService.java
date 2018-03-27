package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqNewsOnlineWithBLOBs;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqNewsOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午2:51:47
 * @version V1.0
 */
public interface NeeqNewsOnlineService {
	public List<NeeqNewsOnlineWithBLOBs> readNeeqNewsOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
