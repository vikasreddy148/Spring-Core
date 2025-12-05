package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.Student;
import com.app.config.AppConfig;

public class TestApp {

	public static void main(String[] args) {
				
		AnnotationConfigApplicationContext container =  new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Student std = container.getBean("student",Student.class);
		
		System.out.println(std);
		
		container.close();
	}

}
