package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqBaseClassificationOnline;

/**
 * @Title: NeeqBaseClassificationOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午4:46:31
 * @version V1.0
 */
public interface NeeqBaseClassificationOnlineService {
	public List<NeeqBaseClassificationOnline> readNeeqBaseClassificationOnlineByClassId(String classId);
}
