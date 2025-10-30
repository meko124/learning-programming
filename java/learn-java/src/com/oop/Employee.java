package com.oop;

class Employee {
	String name;
	
	Employee(String name) {
		this.name = name;
	}
	void sayHello(String name) {
		System.out.println("Hi (param)= " + name + " , My name is employee: " + this.name);
	}
}