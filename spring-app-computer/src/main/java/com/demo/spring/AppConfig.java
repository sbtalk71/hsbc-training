package com.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.spring.items.CPU;
import com.demo.spring.items.Display;
import com.demo.spring.items.Ram;
import com.demo.spring.items.Storage;

@Configuration
@ComponentScan(basePackages = "com.demo.spring")
public class AppConfig {

	@Bean
	public Ram ram() {
		Ram ram = new Ram();
		ram.setRamSize(16);
		ram.setRamType("DDR4");
		return ram;
	}

	@Bean
	public CPU cpu() {
		CPU cpu = new CPU();
		cpu.setCpuType("intel i5");
		cpu.setCpuFrequency("3.00 GHZ");
		return cpu;

	}

	@Bean
	public Storage storage() {
		Storage storage = new Storage();
		storage.setStorageSize(512);
		storage.setStorageType("SSD");
		return storage;
	}

	@Bean
	public Display display() {
		Display display = new Display();
		display.setResolution("1900x1600");
		display.setDisplayMemory("4GB");
		display.setDisplayType("NVidia G Force");
		return display;
	}
}
