package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyChangeOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyChange;
import com.kf.data.service.online.NeeqCompanyChangeOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyChangeService;

/**
 * @Title: NeeqCompanyChangeTask.java
 * @Package com.kf.data.task
 * @Description: 变更信息
 * @author: liangyt
 * @date: 2018年3月15日 下午6:49:48
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqCompanyChangeTask {

	private static String tableName = "neeq_company_change";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyChangeOnlineService neeqCompanyChangeOnlineService;

	@Autowired
	TdxCompanyChangeService tdxCompanyChangeService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyChangeOnline> neeqCompanyChangeOnlines = neeqCompanyChangeOnlineService
				.readNeeqCompanyChangeOnlines(tdxUpIndexOnline);
		if (neeqCompanyChangeOnlines.size() > 0) {
			for (NeeqCompanyChangeOnline neeqCompanyChangeOnline : neeqCompanyChangeOnlines) {
				try {
					TdxCompanyChange tdxCompanyChange = new TdxCompanyChange();
					tdxCompanyChange.setChangeBack(neeqCompanyChangeOnline.getChangeBack());
					tdxCompanyChange.setChangeDate(neeqCompanyChangeOnline.getChangeDate());
					tdxCompanyChange.setChangeFirst(neeqCompanyChangeOnline.getChangeFirst());
					tdxCompanyChange.setChangeProject(neeqCompanyChangeOnline.getChangeProject());
					tdxCompanyChange.setCompanyId(neeqCompanyChangeOnline.getCompanyId());
					tdxCompanyChange.setCompanyName(neeqCompanyChangeOnline.getCompanyName());
					tdxCompanyChangeService.saveTdxCompanyChange(tdxCompanyChange);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyChangeOnline neeqCompanyChangeOnline = neeqCompanyChangeOnlines
						.get(neeqCompanyChangeOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyChangeOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyChangeOnline.getUpdatedAt());
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
