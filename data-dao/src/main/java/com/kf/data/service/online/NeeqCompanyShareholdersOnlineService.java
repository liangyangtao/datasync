package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyShareholdersOnline;

/**  
 * @Title:  NeeqCompanyShareholdersOnlineService.java   
 * @Package com.kf.data.service.online   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: liangyt    
 * @date:   2018年3月14日 下午2:09:57   
 * @version V1.0 
 */

public interface NeeqCompanyShareholdersOnlineService {
	
	public List<NeeqCompanyShareholdersOnline> readNeeqCompanyShareholdersOnlines();
}
