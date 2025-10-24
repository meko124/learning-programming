package com.oop;

class Person {
	String name;
	int age;
	String address;
	
	Person(String paramName, String paramAddress) {
		name = paramName;
		address = paramAddress;
	}
	
	void sayHello(String param) {
		System.out.println("Hello bro, " + name + " ok guys " + param);
	} 
}
class PersonTwo {
	int age;
	String country;
}
