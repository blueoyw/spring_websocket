package com.example;

//STOMP message body {json type}
//for reponse
//{ "content" : "Hello ywoh!" }

public class Greeting {
	private String content;
	public Greeting() {
		
	}
	
	public Greeting(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
}
