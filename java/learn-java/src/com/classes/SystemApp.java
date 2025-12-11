package com.classes;

public class SystemApp {
	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
		
		System.gc();
		System.exit(1);//eliminate program java
		
		System.out.println("Helo");
	}
}