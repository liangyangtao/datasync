package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqCompanyTagOnline;
import com.kf.data.mybatis.entity.online.NeeqTagsOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxCompanyTag;
import com.kf.data.service.online.NeeqCompanyTagOnlineService;
import com.kf.data.service.online.NeeqTagsOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxCompanyTagService;

/**
 * @Title: NeeqCompanyTagTask.java
 * @Package com.kf.data.task
 * @Description: 公司标签
 * @author: liangyt
 * @date: 2018年3月20日 下午6:57:34
 * @version V1.0
 */
//@Component
//@EnableScheduling
public class NeeqCompanyTagTask {

	private static String tableName = "neeq_company_tag";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqCompanyTagOnlineService neeqCompanyTagOnlineService;

	@Autowired
	NeeqTagsOnlineService neeqTagsOnlineService;

	@Autowired
	TdxCompanyTagService tdxCompanyTagService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqCompanyTagOnline> neeqCompanyTagOnlines = neeqCompanyTagOnlineService
				.readNeeqCompanyTagOnlines(tdxUpIndexOnline);
		if (neeqCompanyTagOnlines.size() > 0) {

			for (NeeqCompanyTagOnline neeqCompanyTagOnline : neeqCompanyTagOnlines) {

				try {
					TdxCompanyTag tdxCompanyTag = new TdxCompanyTag();
					tdxCompanyTag.setCompanyId(neeqCompanyTagOnline.getCompanyId());
					List<NeeqTagsOnline> neeqTags = neeqTagsOnlineService
							.readNeeqTagsOnlinByTagId(neeqCompanyTagOnline.getTagId());
					if (neeqTags.size() > 0) {
						tdxCompanyTag.setTagName(neeqTags.get(0).getTagName());
						tdxCompanyTagService.saveTdxCompanyTag(tdxCompanyTag);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqCompanyTagOnline neeqCompanyTagOnline = neeqCompanyTagOnlines.get(neeqCompanyTagOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqCompanyTagOnline.getId());
				tdxUpIndexOnline.setUptime(neeqCompanyTagOnline.getUpdatedAt());
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
