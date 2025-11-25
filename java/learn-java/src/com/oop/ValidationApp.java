package com.oop;

public class ValidationApp {
	public static void main(String[] args) {
		
		LoginRequest loginRequest = new LoginRequest(null, "iki");
		try {
			CheckValidation.validate(loginRequest);
			System.out.println("Data is Valid");
		} catch (ValidationException | NullPointerException exception) {  //short
			System.out.println("Data is not Valid: " + exception.getMessage());
		 } 
		 /*long
		 catch (NullPointerException exception) { 
			System.out.println("Data is null: " + exception.getMessage());
		}*/
		finally {
			System.out.println("Always On");
		}
		//this code is below have an error
		LoginRequest loginRequestTwo = new LoginRequest(null, null);
		CheckValidation.validateRuntime(loginRequestTwo);
		System.out.println("Succes");
	}
}