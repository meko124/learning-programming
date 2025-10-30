package com.oop;

public class PolymorphismApp {
	public static void main(String[] args) {
		
		Employee employee = new Employee("Eko");
		employee.sayHello("Cool");
		
		employee = new Manager("Eko");
		employee.sayHello("Cool");
		
		employee = new VicePresident("Eko");
		employee.sayHello("Cool");
		
		sayHello(new Manager("Zahra"));
		sayHello(new Employee("Siti"));
		sayHello(new VicePresident("Zaid"));
	}
	static void sayHello(Employee employee) {
		System.out.println("Hello " + employee.name);
	}
}