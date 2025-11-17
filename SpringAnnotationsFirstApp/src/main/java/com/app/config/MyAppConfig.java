package com.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.app","com.app.one","comp.app.two"})
public class MyAppConfig {
	static {
		System.out.println("MyAppConfig.class file is loading...");
	}
	
	public MyAppConfig() {
		System.out.println("MyAppConfig Object is created by Spring F/w....");
	}

}
