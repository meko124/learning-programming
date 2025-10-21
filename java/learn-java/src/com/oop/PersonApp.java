package com.oop;

public class PersonApp {
	public static void main(String[] args) {
		var person1 = new Person("Eko");
		Person person2 = new Person("Siti");
		Person person3;
		person3 = new Person("Budi");
		Person person4 = new Person("Zahra");
		person1.sayHello();
		person2.sayHello();
		person3.sayHello();
		person4.sayHello();
	}
}