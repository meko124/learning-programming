package com.basic;

public class MethodOverloading {
	public static void main(String[] args) {
		
		callMe();
		callMe("Eko");
		callMe("Windows",10);
		
	}
	static void callMe() {
		System.out.println("Hello");
	}static void callMe(String name) {
		System.out.println("Hello " + name);
	}static void callMe(String os,int version) {
		System.out.println("i used "+ version + " " + os);
	}
	
}