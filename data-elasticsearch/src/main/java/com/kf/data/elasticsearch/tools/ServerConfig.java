package com.kf.data.elasticsearch.tools;

public class ServerConfig {
	/**
	 * ES索引库地址
	 */
	public static String esUrl;
	/**
	 * es集群名称
	 */
	public static String clusterName;

	/**
	 * 新闻索引名称
	 */
	public static String newsindexName;
	/**
	 * 新闻索引类型
	 */
	public static String newsdataType;

	/**
	 * 公司新闻索引名称
	 */
	public static String newsFilmindexName;
	/**
	 * 公司新闻索引类型
	 */
	public static String newsFilmdataType;

	/**
	 * 法律法规 索引名称
	 */
	public static String laws_indexName;
	/**
	 * 法律法规 索引类型
	 */
	public static String laws_dataType;
	/**
	 * 研报 索引名称
	 */
	public static String reportIndexName;
	/**
	 * 研报 索引类型
	 */
	public static String reportDataType;
	/**
	 * 企业公告 索引名称
	 */
	public static String noticeIndexName;
	/**
	 * 企业公告 索引类型
	 */
	public static String noticeDataType;

	
	
	public static int port;

	public static String getEsUrl() {
		return esUrl;
	}

	public static void setEsUrl(String esUrl) {
		ServerConfig.esUrl = esUrl;
	}

	public static String getClusterName() {
		return clusterName;
	}

	public static void setClusterName(String clusterName) {
		ServerConfig.clusterName = clusterName;
	}

	public static String getNewsindexName() {
		return newsindexName;
	}

	public static void setNewsindexName(String newsindexName) {
		ServerConfig.newsindexName = newsindexName;
	}

	public static String getNewsdataType() {
		return newsdataType;
	}

	public static void setNewsdataType(String newsdataType) {
		ServerConfig.newsdataType = newsdataType;
	}

	public static String getNewsFilmindexName() {
		return newsFilmindexName;
	}

	public static void setNewsFilmindexName(String newsFilmindexName) {
		ServerConfig.newsFilmindexName = newsFilmindexName;
	}

	public static String getNewsFilmdataType() {
		return newsFilmdataType;
	}

	public static void setNewsFilmdataType(String newsFilmdataType) {
		ServerConfig.newsFilmdataType = newsFilmdataType;
	}

	public static String getLaws_indexName() {
		return laws_indexName;
	}

	public static void setLaws_indexName(String laws_indexName) {
		ServerConfig.laws_indexName = laws_indexName;
	}

	public static String getLaws_dataType() {
		return laws_dataType;
	}

	public static void setLaws_dataType(String laws_dataType) {
		ServerConfig.laws_dataType = laws_dataType;
	}

	public static String getReportIndexName() {
		return reportIndexName;
	}

	public static void setReportIndexName(String reportIndexName) {
		ServerConfig.reportIndexName = reportIndexName;
	}

	public static String getReportDataType() {
		return reportDataType;
	}

	public static void setReportDataType(String reportDataType) {
		ServerConfig.reportDataType = reportDataType;
	}

	public static int getPort() {
		return port;
	}

	public static void setPort(int port) {
		ServerConfig.port = port;
	}

	public static String getNoticeIndexName() {
		return noticeIndexName;
	}

	public static void setNoticeIndexName(String noticeIndexName) {
		ServerConfig.noticeIndexName = noticeIndexName;
	}

	public static String getNoticeDataType() {
		return noticeDataType;
	}

	public static void setNoticeDataType(String noticeDataType) {
		ServerConfig.noticeDataType = noticeDataType;
	}

	
}
