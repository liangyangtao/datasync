package com.kf.data.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MultipleDataSourceAspectAdvice {

	@Before("execution(* com.kf.data.service.crawler.**.*(..))")
	public void setCrawlerDataSourceKey(JoinPoint point) {
		System.out.println("爬虫");
		DatabaseContextHolder.clearCustomerType();
		DatabaseContextHolder.setDateSourceType(DateSourceType.CRAWLER);
	}

	@Before("execution(* com.kf.data.service.online.**.*(..))")
	public void setOnlineDataSourceKey(JoinPoint point) {
		
		System.out.println("线上");
		DatabaseContextHolder.clearCustomerType();
		DatabaseContextHolder.setDateSourceType(DateSourceType.ONLINE);
	}

	@Before("execution(* com.kf.data.service.tdx.**.*(..))")
	public void setMidDataSourceKey(JoinPoint point) {
		System.out.println("tdx");
		DatabaseContextHolder.clearCustomerType();
		DatabaseContextHolder.setDateSourceType(DateSourceType.TDX);
	}

}