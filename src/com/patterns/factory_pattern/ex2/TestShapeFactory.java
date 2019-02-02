package com.patterns.factory_pattern.ex2;

public class TestShapeFactory {
	public static void main(String[] args) {
		Shape rectangle = ShapeFactory.getInstance(ShapeType.RECTANGLE);
		Shape square = ShapeFactory.getInstance(ShapeType.SQUARE);
		Shape circle = ShapeFactory.getInstance(ShapeType.CIRCLE);
		rectangle.draw();
		square.draw();
		circle.draw();
	}
}