package com.patterns.builder_pattern_ex1;

public class ComputerBuilderDirector {
	public Computer getBasicComputer() {
		return new Computer.ComputerBuilder("HDD-1", "RAM-1").build();
	}

	public Computer getGraphicsEnabledComputer() {
		return new Computer.ComputerBuilder("HDD-2", "RAM-2").setGraphicsEnabled(true).build();
	}

	public Computer getBluetoothEnabledComputer() {
		return new Computer.ComputerBuilder("HDD-3", "RAM-3").setBluetoothEnabled(true).build();
	}
}
