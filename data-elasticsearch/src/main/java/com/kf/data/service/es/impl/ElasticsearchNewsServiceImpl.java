package com.kf.data.service.es.impl;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.TermQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kf.data.elasticsearch.entity.EsNews;
import com.kf.data.elasticsearch.tools.ESUtils;
import com.kf.data.elasticsearch.tools.ServerConfig;
import com.kf.data.service.es.ElasticsearchNewsService;

/**
 * @Title: ElasticsearchNewsServiceImpl.java
 * @Package com.kf.data.service.es.impl
 * @Description: es
 * @author: liangyt
 * @date: 2018年3月26日 上午10:48:46
 * @version V1.0
 */
@Service
public class ElasticsearchNewsServiceImpl implements ElasticsearchNewsService {

	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();

	@Override
	public EsNews readEsNewsByNewsId(String newsid) {
		Client client = ESUtils.getClient();
		BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();
		TermQueryBuilder termQuery = QueryBuilders.termQuery("news_id", newsid);
		boolQuery.must(termQuery);
		SearchRequestBuilder searchRequestBuilder = client.prepareSearch(ServerConfig.newsindexName)
				.setTypes(ServerConfig.newsdataType).setSearchType(SearchType.DFS_QUERY_THEN_FETCH).setFrom(0)
				.setSize(1).setQuery(boolQuery);
		SearchResponse response = searchRequestBuilder.execute().actionGet();
		SearchHits searchHits = response.getHits();
		SearchHit[] hits = searchHits.getHits();
		EsNews esNews = null;
		for (SearchHit hit : hits) {
			String json = hit.getSourceAsString();
			esNews = gson.fromJson(json, EsNews.class);
		}
		return esNews;
	}

}
