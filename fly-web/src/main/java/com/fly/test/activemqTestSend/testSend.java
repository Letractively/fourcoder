package com.fly.test.activemqTestSend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fly.test.activemqTest.ConsumerService;
import com.fly.test.activemqTest.ProducerService;

public class testSend {
	private static ApplicationContext appContext = new ClassPathXmlApplicationContext("jms.xml");
	 
	private static void send(){
		ProducerService producerService = (ProducerService)appContext.getBean("producerService");
		producerService.send();
	}
 
	private static void receive(){
		ConsumerService consumerService = (ConsumerService)appContext.getBean("consumerService");
		consumerService.receive();
	}
}
