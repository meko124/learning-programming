package com.oop;
import  com.oop.HelloWorld;

public class AnonyApp {
	public static void main(String[] args) {
		
		HelloWorld english = new HelloWorld(){
			public void sayHello() {
			System.out.println("hello");
		}
			
			public void sayHello(String name) {
				System.out.println("hello " + name);
			}
		};
		
			HelloWorld indonesian = new HelloWorld(){
			public void sayHello() {
			System.out.println("halo");
		}
			
			public void sayHello(String name) {
				System.out.println("halo " + name);
			}
		};
		
		english.sayHello();
		english.sayHello("English");

		indonesian.sayHello();
		indonesian.sayHello("Indonesia");
	}
}