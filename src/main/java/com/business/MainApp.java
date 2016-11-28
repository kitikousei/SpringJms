package com.business;

import javax.jms.JMSException;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class MainApp {

	
	public static void main(String[] args) throws JMSException {
		ApplicationContext applicationContext=new
				ClassPathXmlApplicationContext("Spring.xml");
		JmsTemplate jmsTemplate =(JmsTemplate)applicationContext.getBean("jmsTemplate");
		ActiveMQTextMessage activeMQTextMessage=(ActiveMQTextMessage)jmsTemplate.receive();
		String message=activeMQTextMessage.getText();
		System.out.println(message);
		
		
	}
}
