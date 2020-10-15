package com.hsbc.tr.spring.computer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.hsbc.tr.spring.computer")
public class AppConfig {
	@Bean
	public Ram ram() {
		Ram ram = new Ram();
		ram.setRamSize(16);
		return ram;
	}

	@Bean
	public Storage storage() {
		Storage storage = new Storage();
		storage.setStorageSize(500);
		return storage;
	}

	@Bean
	public CPU cpu() {
		CPU cpu = new CPU();
		cpu.setCpuType("Assembled");
		return cpu;
	}

}
