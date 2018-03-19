package com.kf.data.service.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyDishonestyWithBLOBs;

/**
 * @Title: TdxCompanyDishonestyService.java
 * @Package com.kf.data.service.tdx
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月16日 下午3:32:04
 * @version V1.0
 */
public interface TdxCompanyDishonestyService {
	public void saveTdxCompanyDishonesty(TdxCompanyDishonestyWithBLOBs tdxCompanyDishonesty);
}
