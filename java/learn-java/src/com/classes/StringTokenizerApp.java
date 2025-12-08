package com.classes;
import java.util.StringTokenizer;

public class StringTokenizerApp {
	public static void main(String[] args) {
		
		String fullName = "Muhammad Eko Kuswanto";
		StringTokenizer tokenizer = new StringTokenizer(fullName, " ");
		
		while(tokenizer.hasMoreTokens()) {
			String result = tokenizer.nextToken();
			System.out.println(result);
		}
	}
}