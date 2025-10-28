package com.oop;

public class ManagerApp {
	public static void main(String[] args) {
		var manager = new Manager("Siti");
	
		manager.sayHello("Eko");
		
		var vp = new VicePresident("Zahra");

		vp.sayHello("Budi");
	}
}