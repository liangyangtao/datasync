package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqFinanceIndicator2014Online;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqFinanceIndicator2014OnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午4:44:13
 * @version V1.0
 */
public interface NeeqFinanceIndicator2014OnlineService {

	public List<NeeqFinanceIndicator2014Online> readNeeqFinanceIndicator2014Onlines(TdxUpIndexOnline tdxUpIndexOnline);
}
