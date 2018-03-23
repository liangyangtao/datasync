package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqFinanceIndicator2015Online;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**  
 * @Title:  NeeqFinanceIndicator2015OnlineService.java   
 * @Package com.kf.data.service.online   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: liangyt    
 * @date:   2018年3月23日 下午4:55:13   
 * @version V1.0 
 */
public interface NeeqFinanceIndicator2015OnlineService {

	public List<NeeqFinanceIndicator2015Online> readNeeqFinanceIndicator2015Onlines(TdxUpIndexOnline tdxUpIndexOnline);
}
