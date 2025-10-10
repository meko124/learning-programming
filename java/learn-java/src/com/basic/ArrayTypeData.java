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
	};;
		System.out.println(stringArray[0]);
		System.out.println(stringArray[1]);
		System.out.println(stringArray[2]);
		System.out.println(Arrays.toString(arrayInt));
		System.out.println(Arrays.toString(arrayLong));
		
		
		
		stringArray[1] = "Ana";
		System.out.println(stringArray[1]);
	}
}