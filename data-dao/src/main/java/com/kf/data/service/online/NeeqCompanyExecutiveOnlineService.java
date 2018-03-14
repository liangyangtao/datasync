/**  
 * @Title:  NeeqCompanyExecutiveOnlineService.java   
 * @Package com.kf.data.service.online   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: liangyt    
 * @date:   2018年3月14日 下午2:05:13   
 * @version V1.0 
 */
package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyExecutiveOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**
 * @Title: NeeqCompanyExecutiveOnlineService.java
 * @Package com.kf.data.service.online
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月14日 下午2:05:13
 * @version V1.0
 */
public interface NeeqCompanyExecutiveOnlineService {
	public List<NeeqCompanyExecutiveOnline> readNeeqCompanyExecutiveOnlines();

	public List<NeeqCompanyExecutiveOnline> readNeeqCompanyExecutiveOnlines(TdxUpIndexOnline tdxUpIndexOnline);

}
