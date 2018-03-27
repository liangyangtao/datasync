package com.kf.data.elasticsearch.tools;

import java.net.InetAddress;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

/**
 * ES工具类
 * 
 *
 */
public class ESUtils {

	private static TransportClient transportClient = null;

	public synchronized static Client getClient() {
		if (transportClient == null) {
			transportClient = getClusterClient(ServerConfig.clusterName, true, ServerConfig.port, ServerConfig.esUrl);
		}
		return transportClient;

	}

	/**
	 * 初始化并连接elasticsearch集群，返回连接后的client @ clusterName 中心节点名称 @
	 * clientTransportSniff 是否自动发现新加入的节点 @ port 节点端口 @ hostname 集群节点所在服务器IP，支持多个
	 * 
	 * @return 返回连接的集群的client
	 */
	public static TransportClient getClusterClient(String clusterName, boolean clientTransportSniff, int port,
			String hostname) {
		TransportClient transportClient = null;
		try {
			Settings settings = Settings.settingsBuilder().put("cluster.name", clusterName)
					.put("client.transport.sniff", true).build();
			transportClient = TransportClient.builder().settings(settings).build()
					.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(hostname), port));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return transportClient;
	}

}
