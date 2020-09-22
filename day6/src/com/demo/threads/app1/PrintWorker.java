package com.demo.threads.app1;

public class PrintWorker implements Runnable {

	private MessagePrinter printer;
	private String message;

	public PrintWorker(MessagePrinter printer, String message) {
		this.printer = printer;
		this.message = message;
	}

	@Override
	public void run() {

		printer.print(message);
	}
}
