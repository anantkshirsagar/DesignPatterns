package com.patterns.builder_pattern_ex1;

public class TestBuilder {
	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder("HDD-1", "RAM-1").setGraphicsEnabled(true)
				.setBluetoothEnabled(false).build();
		
		System.out.println(computer.getHdd());
		System.out.println(computer.getRam());
		
		Computer basicComputer = new ComputerBuilderDirector().getBasicComputer();
		System.out.println(basicComputer.getHdd() + " " + basicComputer.getRam());
		
		Computer graphicsEnabledComputer = new ComputerBuilderDirector().getGraphicsEnabledComputer();
		System.out.println(graphicsEnabledComputer.getHdd() + " " +graphicsEnabledComputer.getRam());
		
		Computer bluetoothEnabledComputer = new ComputerBuilderDirector().getBluetoothEnabledComputer();
		System.out.println(bluetoothEnabledComputer.getHdd() + " " + bluetoothEnabledComputer.getRam());
	}
}
