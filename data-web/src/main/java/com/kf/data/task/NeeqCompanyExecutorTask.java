package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyExecutorOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyExecutor;
import com.kf.data.service.online.NeeqCompanyExecutorOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyExecutorService;

/**
 * @Title: NeeqCompanyExecutorTask.java
 * @Package com.kf.data.task
 * @Description:被执行人
 * @author: liangyt
 * @date: 2018年3月22日 上午10:59:59
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqCompanyExecutorTask {

	private static String tableName = "neeq_company_executor";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyExecutorOnlineService neeqCompanyExecutorOnlineService;

	@Autowired
	TdxCompanyExecutorService tdxCompanyExecutorService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyExecutorOnline> neeqCompanyExecutorOnlines = neeqCompanyExecutorOnlineService
				.readNeeqCompanyExecutorOnlines(tdxUpIndexOnline);
		if (neeqCompanyExecutorOnlines.size() > 0) {

			for (NeeqCompanyExecutorOnline neeqCompanyExecutorOnline : neeqCompanyExecutorOnlines) {
				try {
					// 先保存高管基本信息
					TdxCompanyExecutor tdxCompanyExecutor = new TdxCompanyExecutor();
					tdxCompanyExecutor.setCaseNo(neeqCompanyExecutorOnline.getCaseNo());
					tdxCompanyExecutor.setCompanyId(neeqCompanyExecutorOnline.getCompanyId());
					tdxCompanyExecutor.setCourt(neeqCompanyExecutorOnline.getCourt());
					tdxCompanyExecutor.setPublishDate(neeqCompanyExecutorOnline.getPublishDate());
					tdxCompanyExecutor.setTarget(neeqCompanyExecutorOnline.getTarget());
					tdxCompanyExecutorService.saveTdxCompanyExecutor(tdxCompanyExecutor);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyExecutorOnline neeqCompanyExecutorOnline = neeqCompanyExecutorOnlines
						.get(neeqCompanyExecutorOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyExecutorOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyExecutorOnline.getUpdatedAt());
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
