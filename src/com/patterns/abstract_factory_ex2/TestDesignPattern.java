package com.patterns.abstract_factory_ex2;

public class TestDesignPattern {
	public static void main(String[] args) {
		testAbstractPattern();
	}
	
	public static void testAbstractPattern() {
		Shape rectangle = ShapeFactory.getShape(new RectangleFactory(10));
		Shape square = ShapeFactory.getShape(new SquareFactory(20));
		System.out.println(" RECT: " +rectangle);
		System.out.println(" SQUARE: " +square);
	}
}
