package com.basic;
import java.util.Arrays;

public class ArrayTypeData {
	public static void main(String[] args) {
		
		String[] stringArray;
		stringArray = new String[3];
		
		stringArray[0] = "Muhammad";
		stringArray[1] = "Eko";
		stringArray[2] = "Kuswanto";
		
	int[] arrayInt = new int[]{
		1,2,4,5
	};
	
	long[] arrayLong = {
		10L,20L
	};
	String[][] members = {
		{"Eko","Alex"},
		{"Ana","Siti","Maria"},
			{"Joko"}
	};
	
		System.out.println("stringArray [0]: " + stringArray[0]);
		System.out.println("stringArray [1]: " + stringArray[1]);
		System.out.println("stringArray [2]: " + stringArray[2]);

		System.out.println("array int: " + Arrays.toString(arrayInt));
		System.out.println("array long: " + Arrays.toString(arrayLong));

		System.out.println("members [0][1]: " + members[0][1]);
		System.out.println("members [2]: " + Arrays.deepToString(members[2]));
		
		stringArray[1] = "Ana";
		System.out.println("change stringArray [1]: " + stringArray[1]);
		
		System.out.println("===i use loop array without ForEarch===");
		
		for(int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		
		System.out.println("===i use loop array ForEarch===");
		
		for(String value : stringArray) {
			System.out.println(value);
		}
	}
}