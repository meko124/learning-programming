package com.oop;

class Rectangle extends Shape {
	int getCorner() {
		return 5;
	}
	int getParentCorner() {
		return super.getCorner(); //get in class Shape(parent)
	}
}