package com.classes;
import  java.util.StringJoiner;

public class StringJoinerApp {
	public static void main(String[] args) {
		
		StringJoiner joiner = new StringJoiner(" + ","[","]");
		
		joiner.add("Muhammad");
		joiner.add("Eko");
		joiner.add("Kuswanto");
		
		String printJoiner = joiner.toString();
		System.out.println(printJoiner);
	}
}