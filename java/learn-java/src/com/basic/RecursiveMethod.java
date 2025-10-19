package com.basic;

public class RecursiveMethod {
	public static void main(String[] args) {
		
		System.out.println(factorialLoop(5));
		System.out.println(recursiveFactorial(5));
		
	}
	static int factorialLoop(int values) {
		int result = 1;
		for(int i = 1; i <= values; i++) {
			result = result * i;//result *= i;
		}
		return result;
	}
	static int recursiveFactorial(int values) {
		if(values == 1) {
			return 1;
		} else {
			return values * recursiveFactorial(values - 1);
		}
	}
}