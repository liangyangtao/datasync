package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyMainBusinessOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**  
 * @Title:  NeeqCompanyMainBusinessOnlineService.java   
 * @Package com.kf.data.service.online   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: liangyt    
 * @date:   2018年3月15日 下午6:42:44   
 * @version V1.0 
 */
public interface NeeqCompanyMainBusinessOnlineService {
	
	public List<NeeqCompanyMainBusinessOnline> readNeeqCompanyMainBusinessOnlines(
			TdxUpIndexOnline tdxUpIndexOnline);

}
	