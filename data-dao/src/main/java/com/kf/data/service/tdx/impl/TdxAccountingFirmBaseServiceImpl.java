package com.kf.data.service.tdx.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kf.data.mybatis.entity.tdx.TdxAccountingFirmBase;
import com.kf.data.mybatis.entity.tdx.TdxAccountingFirmBase;
import com.kf.data.mybatis.entity.tdx.TdxAccountingFirmBaseExample;
import com.kf.data.mybatis.mapper.tdx.TdxAccountingFirmBaseMapper;
import com.kf.data.service.tdx.TdxAccountingFirmBaseService;

/**  
 * @Title:  TdxAccountingFirmBaseServiceImpl.java   
 * @Package com.kf.data.service.tdx.impl   
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: liangyt    
 * @date:   2018年3月22日 下午6:27:39   
 * @version V1.0 
 */
@Service
public class TdxAccountingFirmBaseServiceImpl implements TdxAccountingFirmBaseService {

	@Autowired
	TdxAccountingFirmBaseMapper tdxAccountingFirmBaseMapper;

	@Override
	public void saveTdxAccountingFirmBase(TdxAccountingFirmBase tdxAccountingFirmBase) {
		TdxAccountingFirmBaseExample example = new TdxAccountingFirmBaseExample();
		example.or().andCompanyIdEqualTo(tdxAccountingFirmBase.getCompanyId());
		if (tdxAccountingFirmBaseMapper.countByExample(example) > 0) {
			tdxAccountingFirmBaseMapper.updateByExampleSelective(tdxAccountingFirmBase, example);
		} else {
			tdxAccountingFirmBaseMapper.insertSelective(tdxAccountingFirmBase);
		}
	}

}
