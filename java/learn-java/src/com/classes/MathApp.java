package com.classes;
import java.math.BigInteger;

public class MathApp {
	public static void main(String[] args) {
		var numberMax = Math.max(1000,2000);
		var numberMin = Math.min(1000,2000);
		
		BigInteger numberMoreThanIntOne = new BigInteger("100000000000000000000000");
		BigInteger numberMoreThanIntTwo = new BigInteger("100000000000000000000000");
		BigInteger resultAddNumber = numberMoreThanIntOne.add(numberMoreThanIntTwo);
		
		System.out.println(numberMax);
		System.out.println(numberMin);
		System.out.println(resultAddNumber);
		
	}
}