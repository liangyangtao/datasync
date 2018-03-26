package com.kf.data.config;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.kf.data.elasticsearch.tools.ServerConfig;

@Configuration
@EnableTransactionManagement
@ComponentScan({ "com.kf.data" })
@PropertySource(value = { "classpath:application.properties" })
@MapperScan({ "com.kf.data.mybatis.mapper" })
public class MyBatisConfiguration {

	@Autowired
	private Environment environment;

	@Bean
	public DataSource dataSourceCrawler() {
		DataSource dataSource = new DataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
		dataSource.setUrl(environment.getRequiredProperty("jdbc.crawler.url"));
		dataSource.setUsername(environment.getRequiredProperty("jdbc.crawler.username"));
		dataSource.setPassword(environment.getRequiredProperty("jdbc.crawler.password"));
		dataSource.setMaxIdle(Integer.parseInt(environment.getRequiredProperty("jdbc.pool.maxIdle")));
		dataSource.setMaxActive(Integer.parseInt(environment.getRequiredProperty("jdbc.pool.maxActive")));
		dataSource.setMaxWait(Integer.parseInt(environment.getRequiredProperty("jdbc.maxWait")));
		dataSource.setRemoveAbandoned(Boolean.parseBoolean(environment.getRequiredProperty("jdbc.removeAbandoned")));
		dataSource.setRemoveAbandonedTimeout(
				Integer.parseInt(environment.getRequiredProperty("jdbc.removeAbandonedTimeout")));
		dataSource.setTimeBetweenEvictionRunsMillis(
				Integer.parseInt(environment.getRequiredProperty("jdbc.timeBetweenEvictionRunsMillis")));
		dataSource.setMinEvictableIdleTimeMillis(
				Integer.parseInt(environment.getRequiredProperty("jdbc.minEvictableIdleTimeMillis")));
		dataSource.setTestOnBorrow(Boolean.parseBoolean(environment.getRequiredProperty("jdbc.testOnBorrow")));
		dataSource.setValidationQuery(environment.getRequiredProperty("jdbc.validationQuery"));
		return dataSource;
	}

	@Bean
	public DataSource dataSourceOnline() {
		DataSource dataSource = new DataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
		dataSource.setUrl(environment.getRequiredProperty("jdbc.online.url"));
		dataSource.setUsername(environment.getRequiredProperty("jdbc.online.username"));
		dataSource.setPassword(environment.getRequiredProperty("jdbc.online.password"));
		dataSource.setMaxIdle(Integer.parseInt(environment.getRequiredProperty("jdbc.pool.maxIdle")));
		dataSource.setMaxActive(Integer.parseInt(environment.getRequiredProperty("jdbc.pool.maxActive")));
		dataSource.setMaxWait(Integer.parseInt(environment.getRequiredProperty("jdbc.maxWait")));
		dataSource.setRemoveAbandoned(Boolean.parseBoolean(environment.getRequiredProperty("jdbc.removeAbandoned")));
		dataSource.setRemoveAbandonedTimeout(
				Integer.parseInt(environment.getRequiredProperty("jdbc.removeAbandonedTimeout")));
		dataSource.setTimeBetweenEvictionRunsMillis(
				Integer.parseInt(environment.getRequiredProperty("jdbc.timeBetweenEvictionRunsMillis")));
		dataSource.setMinEvictableIdleTimeMillis(
				Integer.parseInt(environment.getRequiredProperty("jdbc.minEvictableIdleTimeMillis")));
		dataSource.setTestOnBorrow(Boolean.parseBoolean(environment.getRequiredProperty("jdbc.testOnBorrow")));
		dataSource.setValidationQuery(environment.getRequiredProperty("jdbc.validationQuery"));
		return dataSource;
	}

	@Bean
	public DataSource dataSourceTdx() {
		DataSource dataSource = new DataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
		dataSource.setUrl(environment.getRequiredProperty("jdbc.tdx.url"));
		dataSource.setUsername(environment.getRequiredProperty("jdbc.tdx.username"));
		dataSource.setPassword(environment.getRequiredProperty("jdbc.tdx.password"));
		dataSource.setMaxIdle(Integer.parseInt(environment.getRequiredProperty("jdbc.pool.maxIdle")));
		dataSource.setMaxActive(Integer.parseInt(environment.getRequiredProperty("jdbc.pool.maxActive")));
		dataSource.setMaxWait(Integer.parseInt(environment.getRequiredProperty("jdbc.maxWait")));
		dataSource.setRemoveAbandoned(Boolean.parseBoolean(environment.getRequiredProperty("jdbc.removeAbandoned")));
		dataSource.setRemoveAbandonedTimeout(
				Integer.parseInt(environment.getRequiredProperty("jdbc.removeAbandonedTimeout")));
		dataSource.setTimeBetweenEvictionRunsMillis(
				Integer.parseInt(environment.getRequiredProperty("jdbc.timeBetweenEvictionRunsMillis")));
		dataSource.setMinEvictableIdleTimeMillis(
				Integer.parseInt(environment.getRequiredProperty("jdbc.minEvictableIdleTimeMillis")));
		dataSource.setTestOnBorrow(Boolean.parseBoolean(environment.getRequiredProperty("jdbc.testOnBorrow")));
		dataSource.setValidationQuery(environment.getRequiredProperty("jdbc.validationQuery"));
		return dataSource;
	}

	/**
	 * @Primary 该注解表示在同一个接口有多个实现类可以注入的时候，默认选择哪一个，而不是让@autowire注解报错
	 * @Qualifier 根据名称进行注入，通常是在具有相同的多个类型的实例的一个注入（例如有多个DataSource类型的实例）
	 */
	@Bean
	@Primary
	public DynamicDataSource dataSource(@Qualifier("dataSourceCrawler") DataSource dataSourceCrawler,
			@Qualifier("dataSourceOnline") DataSource dataSourceOnline,
			@Qualifier("dataSourceTdx") DataSource dataSourceTdx) {
		Map<Object, Object> targetDataSources = new HashMap<>();
		targetDataSources.put(DateSourceType.CRAWLER, dataSourceCrawler);
		targetDataSources.put(DateSourceType.ONLINE, dataSourceOnline);
		targetDataSources.put(DateSourceType.TDX, dataSourceTdx);
		DynamicDataSource dataSource = new DynamicDataSource();
		dataSource.setTargetDataSources(targetDataSources);
		dataSource.setDefaultTargetDataSource(dataSourceOnline);
		return dataSource;
	}

	@Bean
	public SqlSessionFactory sessionFactory(DynamicDataSource dataSource) throws Exception {
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource);
		sessionFactoryBean.setTypeAliasesPackage("com.kf.data.mybatis.entity.*.*");
		return sessionFactoryBean.getObject();
	}

	@Bean
	@Autowired
	DataSourceTransactionManager dataSourceTransactionManager(DynamicDataSource dataSource) {
		DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
		dataSourceTransactionManager.setDataSource(dataSource);
		return dataSourceTransactionManager;
	}

	@Bean
	public ScheduledThreadPoolExecutor scheduledThreadPoolExecutor() {
		ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(128);
		return scheduledThreadPoolExecutor;
	}
	
	@Bean
	public ServerConfig serverConfig() {

		ServerConfig serverConfig = new ServerConfig();	
		serverConfig.setEsUrl(environment.getRequiredProperty("es.url"));
		serverConfig.setPort(Integer.parseInt(environment.getRequiredProperty("es.port")));
		serverConfig.setClusterName(environment.getRequiredProperty("es.clusterName"));
		/****
		 * 新闻
		 */
		serverConfig.setNewsindexName(environment.getRequiredProperty("es.news.indexName"));
		serverConfig.setNewsdataType(environment.getRequiredProperty("es.news.dataType"));
		serverConfig.setNewsFilmindexName(environment.getRequiredProperty("es.newsFilm.indexName"));
		serverConfig.setNewsFilmdataType(environment.getRequiredProperty("es.newsFilm.dataType"));
		// 法律法规
		serverConfig.setLaws_indexName(environment.getRequiredProperty("es.laws.indexName"));
		serverConfig.setLaws_dataType(environment.getRequiredProperty("es.laws.dataType"));

		// 研报
		serverConfig.setReportIndexName(environment.getRequiredProperty("es.report.indexName"));
		serverConfig.setReportDataType(environment.getRequiredProperty("es.report.dataType"));
		// 公司公告
		serverConfig.setNoticeIndexName(environment.getRequiredProperty("es.notice.indexName"));
		serverConfig.setNoticeDataType(environment.getRequiredProperty("es.notice.dataType"));

		return serverConfig;

	}
	

}
