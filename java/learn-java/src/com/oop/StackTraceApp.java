package com.oop;

public class StackTraceApp {
	public static void main(String[] args) {
		
		try {
			String[] names = {
				"muhammad","eko","kuswanto"
			};
			System.out.println(names[50]);
		} catch (Throwable throwable) {
			StackTraceElement[] stackTraceElements = throwable.getStackTrace();
			
			throwable.printStackTrace();//short
		}
	}
}