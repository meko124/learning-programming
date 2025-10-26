package com.oop;

class Person {
	String name;
	int age;
	String address;
	
	Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	Person(String paramName){
		this(paramName,null);
	}
	Person() {
		this(null);
	}
	void sayHello(String param) {
		System.out.println("Hello bro, " + name + " ok guys " + param);
	} 
}
class PersonTwo {
	int age;
	String country;
}
