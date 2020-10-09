package com.demo.spring.items;

public class CPU {
	private String cpuType;
	private String cpuFrequency;

	public CPU() {
		// TODO Auto-generated constructor stub
	}

	public String getCpuType() {
		return cpuType;
	}

	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}

	public String getCpuFrequency() {
		return cpuFrequency;
	}

	public void setCpuFrequency(String cpuFrequency) {
		this.cpuFrequency = cpuFrequency;
	}
	
	public String getSpecs() {
		return cpuType+" "+cpuFrequency;
	}
}
