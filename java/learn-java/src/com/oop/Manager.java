package com.oop;

class Manager extends Employee {

	
	Manager(String name) {
		super(name);
	}
	void sayHello(String name) {
		System.out.println("Hi (param)= " + name + " , My name is manager: " + this.name);
	}
}