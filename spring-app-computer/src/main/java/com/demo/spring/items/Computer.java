package com.demo.spring.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

	@Autowired
	private Ram ram;
	
	@Autowired
	private Storage storage;
	
	@Autowired
	private Display display;
	
	@Autowired
	private CPU cpu;

	public Computer() {

	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public String getSpecs() {
		return cpu.getSpecs() + " " + ram.getSpecs() 
		+ " " + storage.getSpecs() + " " + display.getSpecs();
	}
}
