package com.patterns.factory_pattern.ex2;

public class ShapeFactory {
	public static Shape getInstance(ShapeType shapeType) {
		Shape shape = null;
		switch (shapeType) {
		case RECTANGLE:
			shape = new Rectangle();
			break;
		case SQUARE:
			shape = new Square();
			break;
		case CIRCLE:
			shape = new Circle();
		}
		return shape;
	}
}