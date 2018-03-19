package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyCaseNoticeOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**  
 * @Title:  NeeqCompanyCaseNoticeOnlineService.java   
 * @Package com.kf.data.service.online   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: liangyt    
 * @date:   2018年3月16日 下午3:49:14   
 * @version V1.0 
 */
public interface NeeqCompanyCaseNoticeOnlineService {
	public List<NeeqCompanyCaseNoticeOnline> readNeeqCompanyCaseNoticeOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
