package com.patterns.abstract_factory_ex2;

public abstract class Shape {
	public abstract int getWidth();
	
	@Override
	public String toString() {
		return " Width: " +getWidth();
	}
}
