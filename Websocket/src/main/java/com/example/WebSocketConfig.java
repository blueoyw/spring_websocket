package com.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker	//websocket message handling 
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer{

	@Override	
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		registry.enableSimpleBroker("/topic");	//simple memory-based broker for prefix /topic.
		registry.setApplicationDestinationPrefixes("/app"); //for MessageMapping annotation. prefix /app.
	}
	
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		//websocket이 available 하지 않을 때를 대비한 endpoint.
		//sockjs는 /gs-guide-websocket으로 접속한다. best transport available이 사용된다. (websocket,xhr-streaming)
		registry.addEndpoint("/gs-guide-websocket").withSockJS();	
		
	}	
	
}
