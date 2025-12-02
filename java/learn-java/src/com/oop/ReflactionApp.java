package com.oop;

public class ReflactionApp {
	public static void main(String[] args) {
		
		CreateUserRequest request = new CreateUserRequest();
		
		CheckValidation.validationReflection(request);
	}
}