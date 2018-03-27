package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqFinanceIndicator2016Online;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**  
 * @Title:  NeeqFinanceIndicator2016OnlineService.java   
 * @Package com.kf.data.service.online   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: liangyt    
 * @date:   2018年3月23日 下午4:55:13   
 * @version V1.0 
 */
public interface NeeqFinanceIndicator2016OnlineService {

	public List<NeeqFinanceIndicator2016Online> readNeeqFinanceIndicator2016Onlines(TdxUpIndexOnline tdxUpIndexOnline);
}
