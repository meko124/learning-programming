package com.oop;

public class ShapeApp {
	public static void main(String[] args) {
		var shape = new Shape();
		System.out.println("this is a Class Parent: " + shape.getCorner());
		
		var rectangle = new Rectangle();
		System.out.println("this is a Class Child: " + rectangle.getCorner());
		System.out.println("this is a Class Parent: " + rectangle.getParentCorner());
	}
}