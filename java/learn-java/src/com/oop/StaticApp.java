package com.oop;

public class StaticApp {
	
	public static void main(String[] args) {
		
		System.out.println(Constant.APPLICATION);
		System.out.println(Constant.VERSION);
		System.out.println(MathUtil.sum(1,2,3,4,5,6,7));
		
		Country.City city = new Country.City();
		city.setName("Parenggean");
		System.out.println(city.getName());
		
		System.out.println(Application.PROCESSORS);
	}
}