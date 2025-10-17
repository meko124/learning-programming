package com.basic;

public class Method {
	public static void main(String[] args) {
		
		sayHelloWorld();
		sayName("Muhammad Eko","Kuswanto");
		int showTheIncrease = calculateTheIncrease(20,30);
		System.out.println(showTheIncrease);
		int[] values = {60,60,40};
		calculateSubjectGrades("Eko",values);
		calculateSubjectGrades("Siti",86,75,90);
	}
	static void sayHelloWorld() {
		System.out.println("Hello 1");
		System.out.println("Hello 2");
		System.out.println("Hello 3");
	}
	static void sayName(String firstName, String lastName) {
		System.out.println("hello " + firstName + " " + lastName);
	}
	static int calculateTheIncrease(int value1, int value2) {
		int sum = value1 + value2;
		return sum;
	}
	static void calculateSubjectGrades(String name, int... values) {
		int sum = 0;
		for(int value : values) {
			sum += value;
		}
		int finalValue = sum / values.length;
		if(finalValue >= 65 ) {
			System.out.println("your pased");
		} else {
			System.out.println("your failed");
		}
	}
}