package com.hsbc.tr.spring.computer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CompService {
	@Autowired
	private Ram ram;
	@Autowired
	private CPU cpu;
	@Autowired
	private Storage storage;

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}
    
	public String getPc() {

		return ram.getRamSize() + " " + 
		cpu.getCpuType() + " " + 
	    storage.getStorageSize();

	}
}
