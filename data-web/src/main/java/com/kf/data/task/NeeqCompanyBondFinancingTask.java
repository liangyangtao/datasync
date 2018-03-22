package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyBondFinancingOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyBondFinancing;
import com.kf.data.service.online.NeeqCompanyBondFinancingOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyBondFinancingService;

/**
 * @Title: NeeqCompanyBondFinancingTask.java
 * @Package com.kf.data.task
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月22日 下午3:12:34
 * @version V1.0
 */

//@Component
//@EnableScheduling
public class NeeqCompanyBondFinancingTask {

	private static String tableName = "neeq_company_bond_financing";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyBondFinancingOnlineService neeqCompanyBondFinancingOnlineService;

	@Autowired
	TdxCompanyBondFinancingService tdxCompanyBondFinancingService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyBondFinancingOnline> neeqCompanyBondFinancingOnlines = neeqCompanyBondFinancingOnlineService
				.readNeeqCompanyBondFinancingOnlines(tdxUpIndexOnline);
		if (neeqCompanyBondFinancingOnlines.size() > 0) {
			for (NeeqCompanyBondFinancingOnline neeqCompanyBondFinancingOnline : neeqCompanyBondFinancingOnlines) {
				try {
					TdxCompanyBondFinancing tdxCompanyBondFinancing = new TdxCompanyBondFinancing();
					tdxCompanyBondFinancing.setBondName(neeqCompanyBondFinancingOnline.getBondName());
					tdxCompanyBondFinancing.setBondNum(neeqCompanyBondFinancingOnline.getBondNum());
					tdxCompanyBondFinancing.setBondStopTime(neeqCompanyBondFinancingOnline.getBondStopTime());
					tdxCompanyBondFinancing.setBondTimeLimit(neeqCompanyBondFinancingOnline.getBondTimeLimit());
					tdxCompanyBondFinancing.setBondTradeTime(neeqCompanyBondFinancingOnline.getBondTradeTime());
					tdxCompanyBondFinancing.setBondType(neeqCompanyBondFinancingOnline.getBondType());
					tdxCompanyBondFinancing.setCalInterestType(neeqCompanyBondFinancingOnline.getCalInterestType());
					tdxCompanyBondFinancing.setCompanyId(neeqCompanyBondFinancingOnline.getCompanyId());
					tdxCompanyBondFinancing.setCreditRatingGov(neeqCompanyBondFinancingOnline.getCreditRatingGov());
					tdxCompanyBondFinancing.setDebtRating(neeqCompanyBondFinancingOnline.getDebtRating());
					tdxCompanyBondFinancing.setEscrowAgent(neeqCompanyBondFinancingOnline.getEscrowAgent());
					tdxCompanyBondFinancing.setExeRightTime(neeqCompanyBondFinancingOnline.getExeRightTime());
					tdxCompanyBondFinancing.setExeRightType(neeqCompanyBondFinancingOnline.getExeRightType());
					tdxCompanyBondFinancing.setFaceInterestRate(neeqCompanyBondFinancingOnline.getFaceInterestRate());
					tdxCompanyBondFinancing.setFaceValue(neeqCompanyBondFinancingOnline.getFaceValue());
					tdxCompanyBondFinancing.setFlowRange(neeqCompanyBondFinancingOnline.getFlowRange());
					// tdxCompanyBondFinancing.setId(id);
					tdxCompanyBondFinancing.setInfoDelete(neeqCompanyBondFinancingOnline.getInfoDelete());
					tdxCompanyBondFinancing.setInterestDiff(neeqCompanyBondFinancingOnline.getInterestDiff());
					tdxCompanyBondFinancing.setIssuedPrice(neeqCompanyBondFinancingOnline.getIssuedPrice());
					tdxCompanyBondFinancing.setPayInterestHz(neeqCompanyBondFinancingOnline.getPayInterestHz());
					tdxCompanyBondFinancing
							.setPlanIssuedQuantity(neeqCompanyBondFinancingOnline.getPlanIssuedQuantity());
					tdxCompanyBondFinancing.setPublisherName(neeqCompanyBondFinancingOnline.getPublisherName());
					tdxCompanyBondFinancing.setPublishExpireTime(neeqCompanyBondFinancingOnline.getPublishExpireTime());
					tdxCompanyBondFinancing.setPublishTime(neeqCompanyBondFinancingOnline.getPublishTime());
					tdxCompanyBondFinancing
							.setRealIssuedQuantity(neeqCompanyBondFinancingOnline.getRealIssuedQuantity());
					tdxCompanyBondFinancing.setRefInterestRate(neeqCompanyBondFinancingOnline.getRefInterestRate());
					tdxCompanyBondFinancing.setRemark(neeqCompanyBondFinancingOnline.getRemark());
					tdxCompanyBondFinancing
							.setStartCalInterestTime(neeqCompanyBondFinancingOnline.getStartCalInterestTime());
					tdxCompanyBondFinancing.setTip(neeqCompanyBondFinancingOnline.getTip());
					// tdxCompanyBondFinancing.setUpdatedAt(updatedAt);
					tdxCompanyBondFinancingService.saveTdxCompanyBondFinancing(tdxCompanyBondFinancing);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyBondFinancingOnline neeqCompanyBondFinancingOnline = neeqCompanyBondFinancingOnlines
						.get(neeqCompanyBondFinancingOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyBondFinancingOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyBondFinancingOnline.getUpdatedAt());
				tdxUpIndexOnlineService.saveTdxUpIndexOnline(tdxUpIndexOnline);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			try {
				Thread.sleep(5 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}
