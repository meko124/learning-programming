package com.classes;

public class NumberApp {
	public static void main(String[] args) {
		Integer intValue = 10;
		
		Long longValue = intValue.longValue();
		System.out.println(longValue);
		
		String stringNumber = "1000";
		String stringFloat = "100.10";
		
		Integer nonPrimitifInt = Integer.valueOf(stringNumber);
		int primitifInt = Integer.parseInt(stringNumber);
		System.out.println(nonPrimitifInt);
		System.out.println(primitifInt);	
		
		Double nonPrimitifDouble = Double.valueOf(stringFloat);
		double primitifDouble = Double.parseDouble(stringFloat);
		System.out.println(nonPrimitifDouble);
		System.out.println(primitifDouble);
	}
}