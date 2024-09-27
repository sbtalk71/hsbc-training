package com.demo.threads;

public class Worker implements Runnable {

	private MessagePrinter printer;
	private String msg;
	public Worker(MessagePrinter printer,String msg)
	{
		this.msg=msg;
		this.printer=printer;
	}
	@Override
	public void run() {
		//synchronize object (sometimes bad approach)
		synchronized (printer) {
			printer.print(msg);

		}
	}

}
