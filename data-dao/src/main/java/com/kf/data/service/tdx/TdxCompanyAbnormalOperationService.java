package com.kf.data.service.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyAbnormalOperationWithBLOBs;

/**
 * @Title: TdxCompanyAbnormalOperationService.java
 * @Package com.kf.data.service.tdx
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月16日 下午5:04:27
 * @version V1.0
 */
public interface TdxCompanyAbnormalOperationService {

	public void saveTdxCompanyAbnormalOperation(TdxCompanyAbnormalOperationWithBLOBs tdxCompanyAbnormalOperation);
}
