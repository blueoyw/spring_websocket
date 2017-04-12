package com.example;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
	
	@MessageMapping("/hello")	//client가 전송하는 url. /app/hello가 됨. setApplicationDestinationPrefixes에 의해.
	@SendTo("/topic/greetings") //client가 subscribe할 채널을 지정함.
	public Greeting greeting(HelloMessage message) throws Exception {
		Thread.sleep(1000);
		return new Greeting("Hello, " + message.getName() + "!");				
	}
	
}
