package com.kf.data.service.online;

import java.util.List;

import com.kf.data.mybatis.entity.online.NeeqCompanyTaxRatingOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;

/**  
 * @Title:  NeeqCompanyTaxRatingOnlineService.java   
 * @Package com.kf.data.service.online   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: liangyt    
 * @date:   2018年3月22日 下午1:35:17   
 * @version V1.0 
 */
public interface NeeqCompanyTaxRatingOnlineService {

	public List<NeeqCompanyTaxRatingOnline> readNeeqCompanyTaxRatingOnlines(TdxUpIndexOnline tdxUpIndexOnline);
}
