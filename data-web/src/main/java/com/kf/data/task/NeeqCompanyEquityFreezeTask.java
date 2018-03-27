package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyEquityFreezeOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyEquityFreezeOnlineWithBLOBs;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyEquityFreeze;
import com.kf.data.service.online.NeeqCompanyEquityFreezeOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyEquityFreezeService;

/**
 * @Title: NeeqCompanyEquityFreezeTask.java
 * @Package com.kf.data.task
 * @Description: 股权冻结
 * @author: liangyt
 * @date: 2018年3月21日 下午2:09:39
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqCompanyEquityFreezeTask {

	private static String tableName = "neeq_company_equity_freeze";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyEquityFreezeOnlineService neeqCompanyEquityFreezeOnlineService;

	@Autowired
	TdxCompanyEquityFreezeService tdxCompanyEquityFreezeService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyEquityFreezeOnlineWithBLOBs> neeqCompanyEquityFreezeOnlines = neeqCompanyEquityFreezeOnlineService
				.readNeeqCompanyEquityFreezeOnlines(tdxUpIndexOnline);
		if (neeqCompanyEquityFreezeOnlines.size() > 0) {

			for (NeeqCompanyEquityFreezeOnlineWithBLOBs neeqCompanyEquityFreezeOnline : neeqCompanyEquityFreezeOnlines) {
				try {
					TdxCompanyEquityFreeze tdxCompanyEquityFreeze = new TdxCompanyEquityFreeze();
					tdxCompanyEquityFreeze.setCompanyId(neeqCompanyEquityFreezeOnline.getCompanyId());
					tdxCompanyEquityFreeze.setCompanyName(neeqCompanyEquityFreezeOnline.getCompanySname());
					tdxCompanyEquityFreeze.setDtEnd(neeqCompanyEquityFreezeOnline.getDtEnd());
					tdxCompanyEquityFreeze.setDtNotice(neeqCompanyEquityFreezeOnline.getDtNotice());
					tdxCompanyEquityFreeze.setDtStart(neeqCompanyEquityFreezeOnline.getDtStart());
					tdxCompanyEquityFreeze.setExecutiveName(neeqCompanyEquityFreezeOnline.getExecutiveName());
					tdxCompanyEquityFreeze.setFreezeNum(neeqCompanyEquityFreezeOnline.getFreezeNum());
					tdxCompanyEquityFreeze.setFreezeReason(neeqCompanyEquityFreezeOnline.getFreezeReason());
					tdxCompanyEquityFreeze.setStockCode(neeqCompanyEquityFreezeOnline.getStockCode());
					tdxCompanyEquityFreeze.setStockholderName(neeqCompanyEquityFreezeOnline.getStockholderName());
					// tdxCompanyEquityFreeze.setUpdatedAt(updatedAt);
					tdxCompanyEquityFreezeService.saveTdxCompanyEquityFreeze(tdxCompanyEquityFreeze);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyEquityFreezeOnline neeqCompanyEquityFreezeOnline = neeqCompanyEquityFreezeOnlines
						.get(neeqCompanyEquityFreezeOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyEquityFreezeOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyEquityFreezeOnline.getUpdatedAt());
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
