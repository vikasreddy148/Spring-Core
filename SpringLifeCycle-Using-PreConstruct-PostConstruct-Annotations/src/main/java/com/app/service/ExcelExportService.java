package com.app.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
public class ExcelExportService {
	private String fileName;
	private String mode;
	
	
	static {
		System.out.println("***************BEAN LOADING ***********");

	}
	public void setFileName(String fileName) {
		System.out.println("***************BEAN INITIALIZATION ***********");
		this.fileName=fileName;
	}
	
	public void setMode(String mode) {
		this.mode = mode;
	}

	public ExcelExportService() {
		System.out.println("***************BEAN INSTANTIATION ***********");

	}
	
	@PostConstruct
	public void doSetup() {
		System.out.println("***************Bean Life Cycle Method inti() ***********");

	}
	
	@PreDestroy
	public void doCleanUp() {
		System.out.println("***************Bean Life Cycle Method destroy() ***********");

	}

	@Override
	public String toString() {
		return "ExcelExportService [fileName=" + fileName + ", mode=" + mode + "]";
	}
	
	
	
	
	
}
