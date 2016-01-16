package org.learn.sys.controller;

public class Greeting {
	private final String message;
	private final int counter;
	
	public Greeting(String message, int counter) {
		super();
		this.message = message;
		this.counter = counter;
	}
	
	public String getMessage() {
		return message;
	}
	
	public int getCounter() {
		return counter;
	}
	
}
