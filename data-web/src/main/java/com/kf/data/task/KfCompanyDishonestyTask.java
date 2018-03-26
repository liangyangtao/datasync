package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.KfCompanyDishonestyOnline;
import com.kf.data.mybatis.entity.online.KfCompanyDishonestyOnlineWithBLOBs;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyDishonestyWithBLOBs;
import com.kf.data.service.online.KfCompanyDishonestyOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyDishonestyService;

/**
 * @Title: KfCompanyDishonestyTask.java
 * @Package com.kf.data.task
 * @Description: 失信信息
 * @author: liangyt
 * @date: 2018年3月16日 下午1:46:27
 * @version V1.0
 */
@Component
@EnableScheduling
public class KfCompanyDishonestyTask {

	private static String tableName = "kf_company_dishonesty";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	KfCompanyDishonestyOnlineService kfCompanyDishonestyOnlineService;

	@Autowired
	TdxCompanyDishonestyService tdxCompanyDishonestyService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<KfCompanyDishonestyOnlineWithBLOBs> kfCompanyDishonestyOnlines = kfCompanyDishonestyOnlineService
				.readKfCompanyDishonestyOnlines(tdxUpIndexOnline);
		if (kfCompanyDishonestyOnlines.size() > 0) {
			for (KfCompanyDishonestyOnlineWithBLOBs kfCompanyDishonestyOnline : kfCompanyDishonestyOnlines) {
				try {
					TdxCompanyDishonestyWithBLOBs tdxCompanyDishonesty = new TdxCompanyDishonestyWithBLOBs();
					tdxCompanyDishonesty.setBasisCaseNumber(kfCompanyDishonestyOnline.getBasisCaseNumber());
					tdxCompanyDishonesty.setCaseNumber(kfCompanyDishonestyOnline.getCaseNumber());
					tdxCompanyDishonesty.setCompanyId(kfCompanyDishonestyOnline.getCompanyId());
					tdxCompanyDishonesty.setCompanyName(kfCompanyDishonestyOnline.getCompanyName());
					tdxCompanyDishonesty.setCourtName(kfCompanyDishonestyOnline.getCourtName());
					tdxCompanyDishonesty.setRegisterDate(kfCompanyDishonestyOnline.getRegisterDate());
					tdxCompanyDishonesty.setReleaseDate(kfCompanyDishonestyOnline.getReleaseDate());
					tdxCompanyDishonesty.setJudicialText(kfCompanyDishonestyOnline.getJudicialText());
					tdxCompanyDishonesty.setPerformance(kfCompanyDishonestyOnline.getPerformance());
					// tdxCompanyDishonesty.setUpdatedAt(updatedAt);
					tdxCompanyDishonestyService.saveTdxCompanyDishonesty(tdxCompanyDishonesty);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				KfCompanyDishonestyOnline kfCompanyDishonestyOnline = kfCompanyDishonestyOnlines
						.get(kfCompanyDishonestyOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(kfCompanyDishonestyOnline.getId());
				tdxUpIndexOnline.setUptime(kfCompanyDishonestyOnline.getUpdatedAt());
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
