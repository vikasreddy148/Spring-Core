package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.*;
public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. start the container
				System.out.println("Starting the container");
				ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

				// 2. use the object present inside the container
				Student std1 = container.getBean(Student.class);
				System.out.println("****************************************");
				System.out.println(std1);
				
				

				// 3. close the container
				((AbstractApplicationContext) container).close();

				System.out.println("Closing the container....");
	}

}
