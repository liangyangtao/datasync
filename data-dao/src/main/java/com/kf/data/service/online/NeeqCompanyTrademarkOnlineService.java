package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyTrademarkOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**  
 * @Title:  NeeqCompanyTrademarkOnlineService.java   
 * @Package com.kf.data.service.online   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: liangyt    
 * @date:   2018年3月21日 下午2:28:29   
 * @version V1.0 
 */
public interface NeeqCompanyTrademarkOnlineService {

	public List<NeeqCompanyTrademarkOnline> readNeeqCompanyTrademarkOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
