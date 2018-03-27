package com.kf.data.service.es;

import com.kf.data.elasticsearch.entity.EsNews;

/**
 * @Title: ElasticsearchNewsService.java
 * @Package com.kf.data.service.es
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: liangyt
 * @date: 2018年3月26日 上午10:47:27
 * @version V1.0
 */
public interface ElasticsearchNewsService {

	public EsNews readEsNewsByNewsId(String newsid);
}
