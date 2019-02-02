package com.patterns.factory_pattern.ex1;

public class TestComputerFactory {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("PC", "4GB", "1TB", "2.4GHz");
		Computer server = ComputerFactory.getComputer("Server", "12GB", "100TB", "2.GHz");
		System.out.println(pc);
		System.out.println(server);
	}
}
