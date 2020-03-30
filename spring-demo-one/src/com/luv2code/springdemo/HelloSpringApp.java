package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//1.load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.retrieve bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//3.call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//let's call the new method for fortune
		System.out.println(theCoach.getDailyFortune());
		
		//4.close the context
		context.close();
	}
}
