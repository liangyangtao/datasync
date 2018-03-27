package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqNoticeFranchiseOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqNoticeFranchiseOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午2:43:56
 * @version V1.0
 */
public interface NeeqNoticeFranchiseOnlineService {
	public List<NeeqNoticeFranchiseOnline> readNeeqNoticeFranchiseOnlines(TdxUpIndexOnline tdxUpIndexOnline);

}
