package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqNewsOnline;
import com.kf.data.mybatis.entity.online.NeeqNewsOnlineWithBLOBs;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxNews;
import com.kf.data.service.online.NeeqNewsOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxNewsService;

/**
 * @Title: NeeqNewsTask.java
 * @Package com.kf.data.task
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月23日 下午3:01:37
 * @version V1.0
 */
//@Component
//@EnableScheduling
public class NeeqNewsTask {

	private static String tableName = "neeq_news";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqNewsOnlineService neeqNewsOnlineService;

	@Autowired
	TdxNewsService tdxNewsService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {

		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqNewsOnlineWithBLOBs> neeqNewsOnlines = neeqNewsOnlineService.readNeeqNewsOnlines(tdxUpIndexOnline);
		if (neeqNewsOnlines.size() > 0) {

			for (NeeqNewsOnlineWithBLOBs neeqNewsOnline : neeqNewsOnlines) {

				try {
					TdxNews tdxNews = new TdxNews();
					tdxNews.setAuthor(neeqNewsOnline.getAuthor());
					tdxNews.setCategoryName(neeqNewsOnline.getCategoryName());
					tdxNews.setContent(neeqNewsOnline.getContent());
					tdxNews.setLabel(neeqNewsOnline.getLabel());
					tdxNews.setReleaseDate(neeqNewsOnline.getReleaseDate());
					tdxNews.setSource(neeqNewsOnline.getSource());
					tdxNews.setSummary(neeqNewsOnline.getSummary());
					tdxNews.setTag(neeqNewsOnline.getTag());
					tdxNews.setTitle(neeqNewsOnline.getTitle());
					tdxNewsService.saveTdxNews(tdxNews);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqNewsOnline neeqNewsOnline = neeqNewsOnlines.get(neeqNewsOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqNewsOnline.getId());
				tdxUpIndexOnline.setUptime(neeqNewsOnline.getUpdatedAt());
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
