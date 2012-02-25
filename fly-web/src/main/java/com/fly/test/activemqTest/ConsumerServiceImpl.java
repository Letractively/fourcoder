package com.fly.test.activemqTest;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.jms.core.JmsTemplate;

public class ConsumerServiceImpl implements ConsumerService{
	JmsTemplate jmsTemplate;
	 
	Destination destination; 
	
	public void receive() {
		TextMessage message = (TextMessage)jmsTemplate.receive();
		try {
			System.out.println("&gt;&gt;接收到的消息&gt;&gt;"+message.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
 
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
 
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
}
