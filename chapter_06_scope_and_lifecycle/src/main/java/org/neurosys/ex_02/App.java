package org.neurosys.ex_02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext_ex_02.xml");
		
		// Retrieve bean from spring container
		// myCoach has the default scope so the're going to be identical
		ICoach theCoach = context.getBean("myCoach", ICoach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}
}
