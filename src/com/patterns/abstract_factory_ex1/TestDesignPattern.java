package com.patterns.abstract_factory_ex1;

public class TestDesignPattern {
	public static void main(String[] args) {
		testAbstractFactory();
	}
	
	public static void testAbstractFactory() {
		PCFactory pcFactory = new PCFactory("RAM-1", "HDD-1", "CPU-1");
		ServerFactory serverFactory = new ServerFactory("RAM-2", "HDD-2", "CPU-2");
		Computer pc = ComputerFactory.getComputer(pcFactory);
		Computer server = ComputerFactory.getComputer(serverFactory);
		System.out.println(" PC: => " +pc);
		System.out.println(" SERVER: => " +server);
	}
}
