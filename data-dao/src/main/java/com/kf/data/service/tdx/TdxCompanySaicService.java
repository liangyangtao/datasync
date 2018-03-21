package com.kf.data.service.tdx;

import com.kf.data.mybatis.entity.tdx.TdxCompanySaicWithBLOBs;

/**  
 * @Title:  TdxCompanySaicService.java   
 * @Package com.kf.data.service.tdx   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: liangyt    
 * @date:   2018年3月20日 下午5:28:58   
 * @version V1.0 
 */
public interface TdxCompanySaicService {
	public void saveTdxCompanySaic(TdxCompanySaicWithBLOBs tdxCompanySaic);
}
