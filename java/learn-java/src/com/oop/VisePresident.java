package com.oop;

class VicePresident extends Manager{
	void sayHello(String name) {
		System.out.println("Hi (param)= " + name + " , My name is vp: " + this.name);
	}
}