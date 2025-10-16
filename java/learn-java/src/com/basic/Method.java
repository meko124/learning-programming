package com.basic;

public class Method {
	public static void main(String[] args) {
		
		sayHelloWorld();
		sayName("Muhammad Eko","Kuswanto");
		int showTheIncrease = calculateTheIncrease(20,30);
		System.out.println(showTheIncrease);
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
		var total = value1 + value2;
		return total;
	}
}