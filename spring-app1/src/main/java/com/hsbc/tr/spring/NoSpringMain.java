package com.hsbc.tr.spring;

public class NoSpringMain {

	public static void main(String[] args) {
		Message message = new Message();
		message.setHeader("Lunch Break");
		message.setBody("No Lunch Today ...");

		Mail mail = new Mail();
		mail.setFromAddress("trainer@gmail.com");
		mail.setToAddress("you@somwhere.com");
		mail.setMessage(message);
		
		
		System.out.println(mail.getMessage().getBody());

	}

}
