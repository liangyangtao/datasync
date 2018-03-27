package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyIncomeStructureAnalysisOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**  
 * @Title:  NeeqCompanyIncomeStructureAnalysisOnlineService.java   
 * @Package com.kf.data.service.online   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: liangyt    
 * @date:   2018年3月27日 上午10:09:07   
 * @version V1.0 
 */
public interface NeeqCompanyIncomeStructureAnalysisOnlineService {
	public List<NeeqCompanyIncomeStructureAnalysisOnline> readNeeqCompanyIncomeStructureAnalysisOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
