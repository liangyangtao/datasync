package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyTaxArrearsOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyTaxArrearsOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 上午10:04:28
 * @version V1.0
 */
public interface NeeqCompanyTaxArrearsOnlineService {

	public List<NeeqCompanyTaxArrearsOnline> readNeeqCompanyTaxArrearsOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
