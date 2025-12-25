package com.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.service.ExcelExportService;


public class TestApp {

	public static void main(String[] args) throws InterruptedException {
		//1. Start the container
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		//ask container to get the bean
		ExcelExportService service = container.getBean("service",ExcelExportService.class);
		Thread.sleep(3000);
		//use the bean
		System.out.println(service);
		
		//close the container
		Thread.sleep(3000);
		((AbstractApplicationContext) container).close();
		
	}

}