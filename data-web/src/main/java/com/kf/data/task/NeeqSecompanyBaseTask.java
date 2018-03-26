package com.kf.data.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kf.data.mybatis.entity.online.NeeqSecompanyBaseOnline;
import com.kf.data.mybatis.entity.online.NeeqSecompanyMarketMakingHisOnline;
import com.kf.data.mybatis.entity.online.TdxUpIndexOnline;
import com.kf.data.mybatis.entity.tdx.TdxSecompanyBase;
import com.kf.data.service.online.NeeqSecompanyBaseOnlineService;
import com.kf.data.service.online.NeeqSecompanyMarketMakingHisOnlineService;
import com.kf.data.service.online.NeeqSecompanyPunishOnlineService;
import com.kf.data.service.online.TdxUpIndexOnlineService;
import com.kf.data.service.tdx.TdxSecompanyBaseService;

/**
 * @Title: NeeqSecompanyBaseTask.java
 * @Package com.kf.data.task
 * @Description: 主办券商
 * @author: liangyt
 * @date: 2018年3月23日 上午11:27:22
 * @version V1.0
 */
@Component
@EnableScheduling
public class NeeqSecompanyBaseTask {

	private static String tableName = "neeq_secompany_base";

	@Autowired
	TdxUpIndexOnlineService tdxUpIndexOnlineService;

	@Autowired
	NeeqSecompanyBaseOnlineService neeqSecompanyBaseOnlineService;

	@Autowired
	NeeqSecompanyMarketMakingHisOnlineService neeqSecompanyMarketMakingHisOnlineService;
	@Autowired
	NeeqSecompanyPunishOnlineService neeqSecompanyPunishOnlineService;

	@Autowired
	TdxSecompanyBaseService tdxSecompanyBaseService;

	@Scheduled(fixedDelay = 1000)
	public void executiveSyncTask() {
		List<TdxUpIndexOnline> tdxUpIndexs = tdxUpIndexOnlineService.readTdxUpIndexOnlineByTableName(tableName);
		TdxUpIndexOnline tdxUpIndexOnline = null;
		if (tdxUpIndexs.size() > 0) {
			tdxUpIndexOnline = tdxUpIndexs.get(0);
		} else {
			tdxUpIndexOnline = new TdxUpIndexOnline();
		}
		List<NeeqSecompanyBaseOnline> neeqSecompanyBaseOnlines = neeqSecompanyBaseOnlineService
				.readNeeqSecompanyBaseOnlines(tdxUpIndexOnline);
		if (neeqSecompanyBaseOnlines.size() > 0) {
			for (NeeqSecompanyBaseOnline neeqSecompanyBaseOnline : neeqSecompanyBaseOnlines) {
				try {
					TdxSecompanyBase tdxSecompanyBase = new TdxSecompanyBase();
					tdxSecompanyBase.setAddress(neeqSecompanyBaseOnline.getAddress());
					tdxSecompanyBase.setBusiness(neeqSecompanyBaseOnline.getBusiness());
					tdxSecompanyBase.setComplaintCall(neeqSecompanyBaseOnline.getComplaintCall());
					tdxSecompanyBase.setEmail(neeqSecompanyBaseOnline.getEmail());
					tdxSecompanyBase.setEstablishmentDate(neeqSecompanyBaseOnline.getEstablishmentDate());
					tdxSecompanyBase.setGeneralManager(neeqSecompanyBaseOnline.getGeneralManager());
					tdxSecompanyBase.setInfo(neeqSecompanyBaseOnline.getInfo());
					tdxSecompanyBase.setIsNeeq(neeqSecompanyBaseOnline.getIsNeeq());
					tdxSecompanyBase.setIsNeeqPunish(neeqSecompanyBaseOnline.getIsNeeqPunish());
					tdxSecompanyBase.setLegalRepresentative(neeqSecompanyBaseOnline.getLegalRepresentative());
					tdxSecompanyBase.setLicenseCode(neeqSecompanyBaseOnline.getLicenseCode());
					tdxSecompanyBase.setNetAsset(neeqSecompanyBaseOnline.getNetAsset());
					tdxSecompanyBase.setNetCapital(neeqSecompanyBaseOnline.getNetCapital());
					tdxSecompanyBase.setOfficialAddress(neeqSecompanyBaseOnline.getOfficialAddress());
					tdxSecompanyBase.setOfficialProvince(neeqSecompanyBaseOnline.getOfficialProvince());
					tdxSecompanyBase.setPost(neeqSecompanyBaseOnline.getPost());
					tdxSecompanyBase.setRegisteredCapital(neeqSecompanyBaseOnline.getRegisteredCapital());
					tdxSecompanyBase.setSalesNum(neeqSecompanyBaseOnline.getSalesNum());
					tdxSecompanyBase.setSecompanyId(neeqSecompanyBaseOnline.getSecompanyId());
					tdxSecompanyBase.setSecompanyName(neeqSecompanyBaseOnline.getSecompanyName());
					tdxSecompanyBase.setSecompanyShortname(neeqSecompanyBaseOnline.getSecompanyShortname());
					tdxSecompanyBase.setSummary(neeqSecompanyBaseOnline.getSummary());
					tdxSecompanyBase.setType(neeqSecompanyBaseOnline.getType());
					tdxSecompanyBase.setWebsite(neeqSecompanyBaseOnline.getWebsite());
					List<NeeqSecompanyMarketMakingHisOnline> neeqSecompanyMarketMakingHis = neeqSecompanyMarketMakingHisOnlineService
							.readNeeqSecompanyMarketMakingHisOnlinesByCompanyId(
									neeqSecompanyBaseOnline.getSecompanyId());
					if (neeqSecompanyMarketMakingHis.size() > 0) {
						// 1 推荐挂牌 2 做市 3 挂牌且做市
						for (NeeqSecompanyMarketMakingHisOnline neeqSecompanyMarketMakingHisOnline : neeqSecompanyMarketMakingHis) {
							if (neeqSecompanyMarketMakingHisOnline.getType().equals(1)) {
								tdxSecompanyBase.setListNum(neeqSecompanyMarketMakingHisOnline.getNumber());
							} else if (neeqSecompanyMarketMakingHisOnline.getType().equals(2)) {
								tdxSecompanyBase.setMarketNum(neeqSecompanyMarketMakingHisOnline.getNumber());
							} else if (neeqSecompanyMarketMakingHisOnline.getType().equals(3)) {
								tdxSecompanyBase.setListMarketNum(neeqSecompanyMarketMakingHisOnline.getNumber());
							}
						}
					}
					// List<NeeqSecompanyPunishOnline> neeqSecompanyPunishs =
					// neeqSecompanyPunishOnlineService
					// .readNeeqSecompanyPunishOnlineByCompanyId(neeqSecompanyBaseOnline.getSecompanyId());
					// if (neeqSecompanyPunishs.size() > 0) {
					//
					// }

					tdxSecompanyBaseService.saveTdxSecompanyBase(tdxSecompanyBase);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				NeeqSecompanyBaseOnline neeqSecompanyBaseOnline = neeqSecompanyBaseOnlines
						.get(neeqSecompanyBaseOnlines.size() - 1);
				tdxUpIndexOnline.setTableName(tableName);
				tdxUpIndexOnline.setUpid(neeqSecompanyBaseOnline.getId());
				tdxUpIndexOnline.setUptime(neeqSecompanyBaseOnline.getUpdatedAt());
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
