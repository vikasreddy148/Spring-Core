package com.app.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {
	static {
		System.out.println("Student.class file is loading...");
	}
	@Value("1")
	private Integer sid;
	
	@Value("Vikas")
	private String sname;
	
	@Value("22")
	private Integer sage;
	
	public Student() {
		System.out.println("STUDENT OBJECT CREATED BY SpringF/w....");
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + "]";
	}
}
