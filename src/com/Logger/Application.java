package com.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Logger logger=applicationContext.getBean("filelogger",FileLogger.class);
		System.out.println(logger.hashCode());
		Logger logger1=applicationContext.getBean("filelogger",FileLogger.class);
		System.out.println(logger.hashCode());
	}

}
