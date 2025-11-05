package com.oop;

public class HiluxApp {
	public static void main(String[] args) {
		
		Car car = new Hilux();
		car.drive();
		System.out.println(car.getWheel());
	}
}