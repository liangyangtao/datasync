package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqTagsOnline;

/**
 * @Title: NeeqTagsOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月20日 下午6:50:34
 * @version V1.0
 */
public interface NeeqTagsOnlineService {
	public List<NeeqTagsOnline> readNeeqTagsOnlinByTagId(String tagid);
}
