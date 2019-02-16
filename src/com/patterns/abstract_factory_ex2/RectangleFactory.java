package com.patterns.abstract_factory_ex2;

public class RectangleFactory implements ShapeAbstractFactory {
	private int width;
	
	public RectangleFactory(int width) {
		this.width = width;
	}
	
	@Override
	public Shape createShape() {
		return new Rectangle(this.width);
	}
}
