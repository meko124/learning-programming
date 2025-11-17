package com.oop;

public record LoginRequest(String username, String password) {
	public LoginRequest {
		System.out.println("create an object Login Request");
	}
}