package com.classes;

public class StringBuilderApp {
	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder();
		builder.append("Muhammad");
		builder.append(" ");
		builder.append("Eko");
		builder.append(" ");
		builder.append("Kuswanto");
		
		String fullName = builder.toString();
		System.out.println(fullName);
	}
}