package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.Student;
import com.app.config.MyAppConfig;

public class TestApp {

	public static void main(String[] args) {
		
		// 1. Start the container
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(MyAppConfig.class);
		
		
//		 container.scan("com.app"); 
//		 container.refresh();
		 
		
		// 2. Ask container to give the Object
		
		Student student = container.getBean(Student.class);
		
		// 3. Use the object
		System.out.println(student);
		
		// 4. close the container
		container.close();
	}

}
