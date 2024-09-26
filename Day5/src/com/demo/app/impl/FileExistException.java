package com.demo.app.impl;

public class FileExistException extends Exception{
	String message;
	public String toString() {
		message="Emp data already exists";
		return message;
	}

}
