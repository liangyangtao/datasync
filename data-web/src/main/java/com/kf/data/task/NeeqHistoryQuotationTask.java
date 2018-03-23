package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqHistoryQuotationOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxHistoryQuotation;
import com.kf.data.service.online.NeeqHistoryQuotationOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxHistoryQuotationService;

/**
 * @Title: NeeqHistoryQuotationTask.java
 * @Package com.kf.data.task
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午1:33:40
 * @version V1.0
 */
//@Component
//@EnableScheduling
public class NeeqHistoryQuotationTask {

	private static String tableName = "neeq_history_quotation";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqHistoryQuotationOnlineService neeqHistoryQuotationOnlineService;

	@Autowired
	TdxHistoryQuotationService tdxHistoryQuotationService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqHistoryQuotationOnline> neeqHistoryQuotationOnlines = neeqHistoryQuotationOnlineService
				.readNeeqHistoryQuotationOnlines(tdxUpIndexOnline);
		if (neeqHistoryQuotationOnlines.size() > 0) {

			for (NeeqHistoryQuotationOnline neeqHistoryQuotationOnline : neeqHistoryQuotationOnlines) {

				try {
					TdxHistoryQuotation tdxHistoryQuotation = new TdxHistoryQuotation();
					tdxHistoryQuotation.setAvaragePrice(neeqHistoryQuotationOnline.getAvaragePrice());
					tdxHistoryQuotation.setBuyPrice1(neeqHistoryQuotationOnline.getBuyPrice1());
					tdxHistoryQuotation.setBuyPrice10(neeqHistoryQuotationOnline.getBuyPrice10());
					tdxHistoryQuotation.setBuyPrice2(neeqHistoryQuotationOnline.getBuyPrice2());
					tdxHistoryQuotation.setBuyPrice3(neeqHistoryQuotationOnline.getBuyPrice3());
					tdxHistoryQuotation.setBuyPrice4(neeqHistoryQuotationOnline.getBuyPrice4());
					tdxHistoryQuotation.setBuyPrice5(neeqHistoryQuotationOnline.getBuyPrice5());
					tdxHistoryQuotation.setBuyPrice6(neeqHistoryQuotationOnline.getBuyPrice6());
					tdxHistoryQuotation.setBuyPrice7(neeqHistoryQuotationOnline.getBuyPrice7());
					tdxHistoryQuotation.setBuyPrice8(neeqHistoryQuotationOnline.getBuyPrice8());
					tdxHistoryQuotation.setBuyPrice9(neeqHistoryQuotationOnline.getBuyPrice9());
					tdxHistoryQuotation.setBuyVolumn1(neeqHistoryQuotationOnline.getBuyVolumn1());
					tdxHistoryQuotation.setBuyVolumn10(neeqHistoryQuotationOnline.getBuyVolumn10());
					tdxHistoryQuotation.setBuyVolumn2(neeqHistoryQuotationOnline.getBuyVolumn2());
					tdxHistoryQuotation.setBuyVolumn3(neeqHistoryQuotationOnline.getBuyVolumn3());
					tdxHistoryQuotation.setBuyVolumn4(neeqHistoryQuotationOnline.getBuyVolumn4());
					tdxHistoryQuotation.setBuyVolumn5(neeqHistoryQuotationOnline.getBuyVolumn5());
					tdxHistoryQuotation.setBuyVolumn6(neeqHistoryQuotationOnline.getBuyVolumn6());
					tdxHistoryQuotation.setBuyVolumn7(neeqHistoryQuotationOnline.getBuyVolumn7());
					tdxHistoryQuotation.setBuyVolumn8(neeqHistoryQuotationOnline.getBuyVolumn8());
					tdxHistoryQuotation.setBuyVolumn9(neeqHistoryQuotationOnline.getBuyVolumn9());
					tdxHistoryQuotation.setChangeRangeRate(neeqHistoryQuotationOnline.getChangeRangeRate());
					tdxHistoryQuotation.setCurrentPrice(neeqHistoryQuotationOnline.getCurrentPrice());
					tdxHistoryQuotation.setDate(neeqHistoryQuotationOnline.getDate());
					tdxHistoryQuotation.setDealNum(neeqHistoryQuotationOnline.getDealNum());
					tdxHistoryQuotation.setDealSum(neeqHistoryQuotationOnline.getDealSum());
					tdxHistoryQuotation.setDealVolumn(neeqHistoryQuotationOnline.getDealVolumn());
					tdxHistoryQuotation.setDynamicPe(neeqHistoryQuotationOnline.getDynamicPe());
					tdxHistoryQuotation.setMarketValue(neeqHistoryQuotationOnline.getMarketValue());
					tdxHistoryQuotation.setMaxPrice(neeqHistoryQuotationOnline.getMaxPrice());
					tdxHistoryQuotation.setMinPrice(neeqHistoryQuotationOnline.getMinPrice());
					tdxHistoryQuotation.setOpenInterest(neeqHistoryQuotationOnline.getOpenInterest());
					tdxHistoryQuotation.setOpenPrice(neeqHistoryQuotationOnline.getOpenPrice());
					tdxHistoryQuotation.setPbRate(neeqHistoryQuotationOnline.getPbRate());
					tdxHistoryQuotation.setPeRate(neeqHistoryQuotationOnline.getPeRate());
					tdxHistoryQuotation.setPreviousPrice(neeqHistoryQuotationOnline.getPreviousPrice());
					tdxHistoryQuotation.setSellPrice1(neeqHistoryQuotationOnline.getSellPrice1());
					tdxHistoryQuotation.setSellPrice10(neeqHistoryQuotationOnline.getSellPrice10());
					tdxHistoryQuotation.setSellPrice2(neeqHistoryQuotationOnline.getSellPrice2());
					tdxHistoryQuotation.setSellPrice3(neeqHistoryQuotationOnline.getSellPrice3());
					tdxHistoryQuotation.setSellPrice4(neeqHistoryQuotationOnline.getSellPrice4());
					tdxHistoryQuotation.setSellPrice5(neeqHistoryQuotationOnline.getSellPrice5());
					tdxHistoryQuotation.setSellPrice6(neeqHistoryQuotationOnline.getSellPrice6());
					tdxHistoryQuotation.setSellPrice7(neeqHistoryQuotationOnline.getSellPrice7());
					tdxHistoryQuotation.setSellPrice8(neeqHistoryQuotationOnline.getSellPrice8());
					tdxHistoryQuotation.setSellPrice9(neeqHistoryQuotationOnline.getSellPrice9());
					tdxHistoryQuotation.setShortname(neeqHistoryQuotationOnline.getShortname());
					tdxHistoryQuotation.setStaticPe(neeqHistoryQuotationOnline.getStaticPe());
					tdxHistoryQuotation.setStockCode(neeqHistoryQuotationOnline.getStockCode());
					// tdxHistoryQuotation.setStockId(stockId);
					tdxHistoryQuotation.setTime(neeqHistoryQuotationOnline.getTime());
					tdxHistoryQuotation.setTotalValue(neeqHistoryQuotationOnline.getTotalValue());
					tdxHistoryQuotation.setTransRate(neeqHistoryQuotationOnline.getTransRate());
					tdxHistoryQuotation.setUpDownClose(neeqHistoryQuotationOnline.getUpDownClose());
					tdxHistoryQuotation.setUpDownLast(neeqHistoryQuotationOnline.getUpDownLast());
					tdxHistoryQuotation.setUpDownRateClose(neeqHistoryQuotationOnline.getUpDownRateClose());
					tdxHistoryQuotationService.saveTdxHistoryQuotation(tdxHistoryQuotation);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqHistoryQuotationOnline neeqHistoryQuotationOnline = neeqHistoryQuotationOnlines
						.get(neeqHistoryQuotationOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqHistoryQuotationOnline.getId());
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
