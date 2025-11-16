package com.oop;

public class Application {
	
	public static final int PROCESSORS;
	static {
		System.out.println("access class processors");
		PROCESSORS = Runtime.getRuntime().availableProcessors();
	}
}