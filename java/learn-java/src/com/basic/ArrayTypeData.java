package com.basic;

public class ArrayTypeData {
	public static void main(String[] args) {
		
		String[] stringArray;
		stringArray = new String[3];
		
		stringArray[0] = "Muhammad";
		stringArray[1] = "Eko";
		stringArray[2] = "Kuswanto";
		
		System.out.println(stringArray[0]);
		System.out.println(stringArray[1]);
		System.out.println(stringArray[2]);
		
		stringArray[1] = "Ana";
		System.out.println(stringArray[1]);
	}
}