package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyBranchOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyBranch;
import com.kf.data.service.online.NeeqCompanyBranchOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyBranchService;

/**
 * @Title: NeeqCompanyBranchTask.java
 * @Package com.kf.data.task
 * @Description: 分支机构
 * @author: liangyt
 * @date: 2018年3月16日 下午1:46:27
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqCompanyBranchTask {

	private static String tableName = "neeq_company_branch";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyBranchOnlineService neeqCompanyBranchOnlineService;

	@Autowired
	TdxCompanyBranchService tdxCompanyBranchService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyBranchOnline> neeqCompanyBranchOnlines = neeqCompanyBranchOnlineService
				.readNeeqCompanyBranchOnlines(tdxUpIndexOnline);
		if (neeqCompanyBranchOnlines.size() > 0) {
			for (NeeqCompanyBranchOnline neeqCompanyBranchOnline : neeqCompanyBranchOnlines) {
				try {
					TdxCompanyBranch tdxCompanyBranch = new TdxCompanyBranch();
					tdxCompanyBranch.setBranchId(neeqCompanyBranchOnline.getBranchId());
					tdxCompanyBranch.setBranchName(neeqCompanyBranchOnline.getBranchName());
					tdxCompanyBranch.setCompanyId(neeqCompanyBranchOnline.getCompanyId());
					tdxCompanyBranch.setCompanyName(neeqCompanyBranchOnline.getCompanyName());
					tdxCompanyBranch.setStockCode(neeqCompanyBranchOnline.getStockCode());
					tdxCompanyBranchService.saveTdxCompanyBranch(tdxCompanyBranch);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyBranchOnline neeqCompanyBranchOnline = neeqCompanyBranchOnlines
						.get(neeqCompanyBranchOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyBranchOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyBranchOnline.getUpdatedAt());
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
