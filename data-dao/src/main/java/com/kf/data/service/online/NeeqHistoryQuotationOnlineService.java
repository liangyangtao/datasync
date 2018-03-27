package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqHistoryQuotationOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqHistoryQuotationOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午4:43:40
 * @version V1.0
 */
public interface NeeqHistoryQuotationOnlineService {

	public List<NeeqHistoryQuotationOnline> readNeeqHistoryQuotationOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
