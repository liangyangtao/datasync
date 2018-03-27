package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyAbnormalOperationOnlineWithBLOBs;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyAbnormalOperationOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: 
 * @author: liangyt
 * @date: 2018年3月16日 下午3:53:17
 * @version V1.0
 */
public interface NeeqCompanyAbnormalOperationOnlineService {

	public List<NeeqCompanyAbnormalOperationOnlineWithBLOBs> readNeeqCompanyAbnormalOperationOnlines(
			TdxUpIndexOnline tdxUpIndexOnline);
}
