package com.learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class SpringApplicationExample {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		printer.getMessage();

		System.out.println("Hello World!" + printer.getMessage());
		System.out.println("Application Context : " +context.getId());

	}
}
