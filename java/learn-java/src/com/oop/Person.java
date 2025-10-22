package com.oop;

class Person {
	private String name;
	int age;
	String addres;
	public Person(String name) {
		this.name = name;
	}
	public void sayHello() {
		System.out.println("Hello bro, " + name + " ok guys");
	} 
}
class PersonTwo {
	int age;
	String country;
}
