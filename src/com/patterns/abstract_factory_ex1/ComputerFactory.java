package com.patterns.abstract_factory_ex1;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory) {
		return computerAbstractFactory.createComputer();
	}
}
