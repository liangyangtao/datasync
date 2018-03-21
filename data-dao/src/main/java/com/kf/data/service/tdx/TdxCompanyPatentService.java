package com.kf.data.service.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanyPatentWithBLOBs;

/**
 * @Title: TdxCompanyPatentService.java
 * @Package com.kf.data.service.tdx
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月21日 下午3:34:29
 * @version V1.0
 */
public interface TdxCompanyPatentService {

	public void saveTdxCompanyPatent(TdxCompanyPatentWithBLOBs tdxCompanyPatent);
}
