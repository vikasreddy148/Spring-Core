package com.app.bean;

public class Student {
	
	static {
		System.out.println("Student.class file is loaing by Spring FW");
	}
	public Student() {
		System.out.println("Student object is created by Spring FW");
	}
	private Integer sid;
	private String sname;
	private Integer sage;
	
//	public void setSid(Integer sid) {
//		System.out.println("SID is injected by spring F/w using setter");
//		this.sid = sid;
//	}
//	public void setSname(String sname) {
//		System.out.println("SNAME is injected by spring F/w using setter");
//		this.sname = sname;
//	}
//	
//	public void setSage(Integer sage) {
//		System.out.println("SAGE is injected by spring F/w using setter");
//		this.sage = sage;
//	}
	
	public Student(Integer sid, String sname, Integer sage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + "]";
	}


	
	
}
