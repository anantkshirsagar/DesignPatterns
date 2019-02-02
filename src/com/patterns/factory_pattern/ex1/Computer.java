package com.patterns.factory_pattern.ex1;

public abstract class Computer {
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	public String toString() {
		return "RAM: "+getRAM()+ " HDD: " +getHDD()+ " CPU: " +getCPU();
	}
}