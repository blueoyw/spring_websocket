package com.example;

//STOMP Message Body ( json type )
//for client's subscribe
public class HelloMessage {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HelloMessage () {		
	}
	
	public HelloMessage ( String name ) {
		this.name = name;
	}
	
	
}
