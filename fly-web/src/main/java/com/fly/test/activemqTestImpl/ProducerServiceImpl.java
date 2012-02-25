package com.fly.test.activemqTestImpl;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.fly.test.activemqTest.ProducerService;

public class ProducerServiceImpl implements ProducerService{
	JmsTemplate jmsTemplate;
	 
	Destination destination;
 
	
	public void send(){
		MessageCreator messageCreator = new MessageCreator(){
				public Message createMessage(Session session){
					TextMessage message = null;
					try {
						message = session.createTextMessage("ÄãºÃ Hello");
					} catch (JMSException e) {
						e.printStackTrace();
					}
					return message;
				}};
 
		jmsTemplate.send(this.destination, messageCreator);
	}
 
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
 
	public void setDestination(javax.jms.Destination destination) {
		this.destination = destination;
	}
}
