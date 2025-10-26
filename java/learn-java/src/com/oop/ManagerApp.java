package com.oop;

public class ManagerApp {
	public static void main(String[] args) {
		var manager = new Manager();
		manager.name = "Siti";
		manager.sayHello("Eko");
		
		var vp = new VicePresident();
		vp.name = "Zahra";
		vp.sayHello("Budi");
	}
}