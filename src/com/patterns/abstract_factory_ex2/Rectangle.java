package com.patterns.abstract_factory_ex2;

public class Rectangle extends Shape{
	private int width;
	
	public Rectangle(int width) {
		this.width = width;
	}
	
	@Override
	public int getWidth() {
		return this.width;
	}
}
