package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqAccountingFirmBaseOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**  
 * @Title:  NeeqAccountingFirmBaseOnlineService.java   
 * @Package com.kf.data.service.online   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: liangyt    
 * @date:   2018年3月22日 下午4:07:43   
 * @version V1.0 
 */
public interface NeeqAccountingFirmBaseOnlineService {

	public List<NeeqAccountingFirmBaseOnline> readNeeqAccountingFirmBaseOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
