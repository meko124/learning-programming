package com.oop;

public class PersonApp {
	public static void main(String[] args) {
		
		var person1 = new Person("Eko","parenggean");
		person1.sayHello("Siti");
		System.out.println(person1.name + " from " + person1.address);
	
		
		Person person2 = new Person("Upik","parenggean");
		System.out.println(person2.name + " from " + person2.address);
		person2.sayHello("Zahra");
		
		Person person3;
		person3 = new Person("edi","sampit");
		System.out.println(person3.name + " from " + person3.address);
		
		var personTwo = new PersonTwo();
		personTwo.age = 10;
		personTwo.country = "Indonesian";
		System.out.println(personTwo.age);
		System.out.println(personTwo.country);
		
	}
}