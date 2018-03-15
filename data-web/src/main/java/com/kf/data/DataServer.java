package com.kf.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Title: DataServer.java
 * @Package com.kf.data
 * @Description: 入口
 * @author: liangyt
 * @date: 2018年3月14日 下午4:18:58
 * @version V1.0
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class DataServer {

	public static void main(String[] args) {
		SpringApplication.run(DataServer.class, args);
	}
}
