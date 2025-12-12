package com.classes;
import java.util.Base64;

public class Base64App {
	public static void main(String[] args) {
		
		String originalFullName = "Muhammad Eko Kuswanto";
		String encoded = Base64.getEncoder().encodeToString(originalFullName.getBytes());
		System.out.println(encoded);
		
		byte[] bytes = Base64.getDecoder().decode(encoded);
		String result = new String(bytes);
		System.out.println(result);
	}
}