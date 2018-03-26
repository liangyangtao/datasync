package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyCopyrightOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyCopyright;
import com.kf.data.service.online.NeeqCompanyCopyrightOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyCopyrightService;

/**
 * @Title: NeeqCompanyCopyright.java
 * @Package com.kf.data.task
 * @Description: 作品著作权
 * @author: liangyt
 * @date: 2018年3月21日 下午4:24:15
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqCompanyCopyrightTask {

	private static String tableName = "neeq_company_copyright";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyCopyrightOnlineService neeqCompanyCopyrightOnlineService;

	@Autowired
	TdxCompanyCopyrightService tdxCompanyCopyrightService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyCopyrightOnline> neeqCompanyCopyrightOnlines = neeqCompanyCopyrightOnlineService
				.readNeeqCompanyCopyrightOnlines(tdxUpIndexOnline);
		if (neeqCompanyCopyrightOnlines.size() > 0) {
			for (NeeqCompanyCopyrightOnline neeqCompanyCopyrightOnline : neeqCompanyCopyrightOnlines) {
				try {
					TdxCompanyCopyright tdxCompanyCopyright = new TdxCompanyCopyright();
					tdxCompanyCopyright.setAuthorName(neeqCompanyCopyrightOnline.getAuthorName());
					tdxCompanyCopyright.setClassificationNum(neeqCompanyCopyrightOnline.getClassificationNum());
					tdxCompanyCopyright.setCompanyId(neeqCompanyCopyrightOnline.getCompanyId());
					tdxCompanyCopyright.setCompanyName(neeqCompanyCopyrightOnline.getCompanyName());
					tdxCompanyCopyright.setName(neeqCompanyCopyrightOnline.getName());
					tdxCompanyCopyright.setPublishedDate(neeqCompanyCopyrightOnline.getPublishedDate());
					tdxCompanyCopyright.setRegistrationNumber(neeqCompanyCopyrightOnline.getRegistrationNumber());
					tdxCompanyCopyright.setType(neeqCompanyCopyrightOnline.getType());
					tdxCompanyCopyright.setVersion(neeqCompanyCopyrightOnline.getVersion());
					tdxCompanyCopyrightService.saveTdxCompanyCopyright(tdxCompanyCopyright);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyCopyrightOnline neeqCompanyCopyrightOnline = neeqCompanyCopyrightOnlines
						.get(neeqCompanyCopyrightOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyCopyrightOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyCopyrightOnline.getUpdatedAt());
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
