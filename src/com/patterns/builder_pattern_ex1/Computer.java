package com.patterns.builder_pattern_ex1;

public class Computer {
	//Required Parameters
	private String hdd;
	private String ram;
	
	//Optional Parameters
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;
	
	public String getHdd() {
		return this.hdd;
	}
	
	public String getRam() {
		return this.ram;
	}
	
	public boolean isGraphicsEnabled() {
		return this.isGraphicsEnabled;
	}
	
	public boolean isBluetoothEnabled() {
		return this.isBluetoothEnabled;
	}
	
	private Computer(ComputerBuilder computerBuilder) {
		this.hdd = computerBuilder.hdd;
		this.ram = computerBuilder.ram;
	}
	
	public static class ComputerBuilder {
		//Required Parameters
		private String hdd;
		private String ram;
		
		//Optional Parameters
		private boolean isGraphicsEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String hdd, String ram) {
			this.hdd = hdd;
			this.ram = ram;
		}
		
		public ComputerBuilder setGraphicsEnabled(boolean isGraphicsEnabled) {
			this.isGraphicsEnabled = isGraphicsEnabled;
			return this;
		}
		
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnalbed) {
			this.isBluetoothEnabled = isBluetoothEnalbed;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
}
