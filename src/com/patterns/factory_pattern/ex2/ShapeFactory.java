package com.patterns.factory_pattern.ex2;

public class ShapeFactory {
	public static Shape getInstance(String type) {
		if("Rectangle".equalsIgnoreCase(type)) {
			return new Rectangle();
		} else if("Square".equalsIgnoreCase(type)) {
			return new Square();
		}
		return null;
	}
}