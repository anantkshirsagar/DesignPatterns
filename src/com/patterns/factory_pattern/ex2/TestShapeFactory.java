package com.patterns.factory_pattern.ex2;

public class TestShapeFactory {
	public static void main(String[] args) {
		Shape rectangle = ShapeFactory.getInstance("Rectangle");
		Shape square = ShapeFactory.getInstance("Square");
		rectangle.draw();
		square.draw();
	}
}