package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqNoticeOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxNotice;
import com.kf.data.service.online.NeeqNoticeOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxNoticeService;

/**
 * @Title: NeeqNoticeTask.java
 * @Package com.kf.data.task
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午2:45:24
 * @version V1.0
 */

//@Component
//@EnableScheduling
public class NeeqNoticeTask {

	private static String tableName = "neeq_notice";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqNoticeOnlineService neeqNoticeOnlineService;

	@Autowired
	TdxNoticeService tdxNoticeService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqNoticeOnline> neeqNoticeOnlines = neeqNoticeOnlineService.readNeeqNoticeOnlines(tdxUpIndexOnline);
		if (neeqNoticeOnlines.size() > 0) {
			for (NeeqNoticeOnline neeqNoticeOnline : neeqNoticeOnlines) {
				try {
					TdxNotice tdxNotice = new TdxNotice();
					tdxNotice.setCode(neeqNoticeOnline.getCode());
					tdxNotice.setCompanyid(neeqNoticeOnline.getCompanyid());
					tdxNotice.setCompanyName(neeqNoticeOnline.getCompanyName());
					tdxNotice.setContent(neeqNoticeOnline.getContent());
					tdxNotice.setNoticeTypeName(neeqNoticeOnline.getNoticeTypeName());
					tdxNotice.setPublishDate(neeqNoticeOnline.getPublishDate());
					tdxNotice.setTitle(neeqNoticeOnline.getTitle());
//					tdxNotice.setUpdatedAt(updatedAt);
					tdxNoticeService.saveTdxNotice(tdxNotice);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqNoticeOnline neeqNoticeOnline = neeqNoticeOnlines.get(neeqNoticeOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqNoticeOnline.getId());
				tdxUpIndexOnline.setUptime(neeqNoticeOnline.getUpdatedAt());
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
