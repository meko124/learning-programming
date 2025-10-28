package com.oop;

class Manager {
	String name;
	
	Manager(String name) {
		this.name = name;
	}
	void sayHello(String name) {
		System.out.println("Hi (param)= " + name + " , My name is manager: " + this.name);
	}
}