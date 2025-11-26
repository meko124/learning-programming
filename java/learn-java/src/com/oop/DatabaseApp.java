package com.oop;

public class DatabaseApp {
	public static void main(String[] args) {
		
		connectDatabse("eko",null);
		System.out.println("Succes");
	}
	public static void connectDatabse(String username, String password) {
		if(username == null || password == null) {
			throw new DatabaseError("connecting is not  to database ");
		}
	}
}