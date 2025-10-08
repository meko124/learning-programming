package com.basic;

public class NonPrimitiveTypeData {
	public static void main(String[] args) {
		
		Byte myByte = 25;
		int myChange = 100;
		Integer thisIsObject = myChange;
		long myLong = thisIsObject.longValue();
		System.out.println(myByte);
		System.out.println(myLong);
	}
}