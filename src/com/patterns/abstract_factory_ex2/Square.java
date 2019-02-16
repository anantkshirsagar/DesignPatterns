package com.patterns.abstract_factory_ex2;

public class Square extends Shape{
	private int width;
	
	public Square(int width) {
		this.width = width;
	}
	
	@Override
	public int getWidth() {
		return this.width;
	}

}
