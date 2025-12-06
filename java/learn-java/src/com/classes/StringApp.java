package com.classes;

public class StringApp {
	public static void main(String[] args) {
		
		String fullName = "Muhammad Eko Kuswanto";
		String fullNameLowerCase = fullName.toLowerCase();
		String fullNameUpperCase = fullName.toUpperCase();
		String passwordBad = "		secret124	";
		String passwordClean = passwordBad.trim();
		boolean isEko = fullName.contains("Eko");
		
		System.out.println(fullName);
		System.out.println(fullNameLowerCase);
		System.out.println(fullNameUpperCase);
		System.out.println(passwordClean);
		System.out.println(isEko);
		
		
		String[] names = fullName.split(" ");
		for(var value : names) {
			System.out.println(value);
		}
	}
}