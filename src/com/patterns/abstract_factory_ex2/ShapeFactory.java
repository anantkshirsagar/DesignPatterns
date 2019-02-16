package com.patterns.abstract_factory_ex2;

public class ShapeFactory{
	public static Shape getShape(ShapeAbstractFactory shapeAbstractFactory) {
		return shapeAbstractFactory.createShape();
	}
}
