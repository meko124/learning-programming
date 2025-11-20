package com.oop;

public enum Level {
	STANDARD("Standart level"),
	PREMIUM("Premium level"),
	VIP("Vip level");
	
	private String description;
	Level(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
}