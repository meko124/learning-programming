package com.oop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
	public static void main(String[] args) {
		
		try(BufferedReader reader =  new BufferedReader(new FileReader("README.md"))) {
			// while(true) {  //long
				// String line = reader.readLine();
				// if(line == null) {
					// break;
				// }
				// System.out.println(line);
			// }
			String line;//short
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch(Throwable throwable) {
			System.out.println("Error read file " + throwable.getMessage());
		}
	}
}