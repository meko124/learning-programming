package com.oop;

public class PersonApp {
	public static void main(String[] args) {
		
		var person1 = new Person();
		person1.name = "Eko";
		person1.sayHello("Siti");
		
		Person person2 = new Person();
		person2.name = "Joko";
		person2.sayHello("Zahra");
		
		Person person3;
		person3 = new Person();
	
		
		
		var personTwo = new PersonTwo();
		personTwo.age = 10;
		personTwo.country = "Indonesian";
		System.out.println(personTwo.age);
		System.out.println(personTwo.country);
		
	}
}