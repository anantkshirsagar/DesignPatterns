package com.patterns.abstract_factory_ex2;

public class SquareFactory implements ShapeAbstractFactory {
	private int width;

	public SquareFactory(int width) {
		this.width = width;
	}

	@Override
	public Shape createShape() {
		return new Square(this.width);
	}
}
