package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyAbnormalOperationOnline;
import com.kf.data.mybatis.entity.online.NeeqCompanyAbnormalOperationOnlineWithBLOBs;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyAbnormalOperationWithBLOBs;
import com.kf.data.service.online.NeeqCompanyAbnormalOperationOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyAbnormalOperationService;

/**
 * @Title: NeeqCompanyAbnormalOperationTask.java
 * @Package com.kf.data.task
 * @Description: 经营异常
 * @author: liangyt
 * @date: 2018年3月16日 下午1:46:27
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqCompanyAbnormalOperationTask {

	private static String tableName = "neeq_company_abnormal_operation";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyAbnormalOperationOnlineService neeqCompanyAbnormalOperationOnlineService;

	@Autowired
	TdxCompanyAbnormalOperationService TdxCompanyAbnormalOperationService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyAbnormalOperationOnlineWithBLOBs> neeqCompanyAbnormalOperationOnlines = neeqCompanyAbnormalOperationOnlineService
				.readNeeqCompanyAbnormalOperationOnlines(tdxUpIndexOnline);
		if (neeqCompanyAbnormalOperationOnlines.size() > 0) {
			for (NeeqCompanyAbnormalOperationOnlineWithBLOBs neeqCompanyAbnormalOperationOnline : neeqCompanyAbnormalOperationOnlines) {
				try {
					TdxCompanyAbnormalOperationWithBLOBs tdxCompanyAbnormalOperation = new TdxCompanyAbnormalOperationWithBLOBs();
					tdxCompanyAbnormalOperation.setAgencyList(neeqCompanyAbnormalOperationOnline.getAgencyList());
					tdxCompanyAbnormalOperation.setAgencyRemove(neeqCompanyAbnormalOperationOnline.getAgencyRemove());
					tdxCompanyAbnormalOperation.setCompanyId(neeqCompanyAbnormalOperationOnline.getCompanyId());
					tdxCompanyAbnormalOperation.setCompanyName(neeqCompanyAbnormalOperationOnline.getCompanyName());
					tdxCompanyAbnormalOperation.setDtList(neeqCompanyAbnormalOperationOnline.getDtList());
					tdxCompanyAbnormalOperation.setDtRemove(neeqCompanyAbnormalOperationOnline.getDtRemove());
					tdxCompanyAbnormalOperation.setReasonList(neeqCompanyAbnormalOperationOnline.getReasonList());
					tdxCompanyAbnormalOperation.setReasonRemove(neeqCompanyAbnormalOperationOnline.getReasonRemove());
					// tdxCompanyAbnormalOperation.setUpdatedAt(updatedAt);

					TdxCompanyAbnormalOperationService.saveTdxCompanyAbnormalOperation(tdxCompanyAbnormalOperation);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyAbnormalOperationOnline neeqCompanyAbnormalOperationOnline = neeqCompanyAbnormalOperationOnlines
						.get(neeqCompanyAbnormalOperationOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyAbnormalOperationOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyAbnormalOperationOnline.getUpdatedAt());
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
