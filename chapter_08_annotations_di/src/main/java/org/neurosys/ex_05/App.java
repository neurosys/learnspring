package org.neurosys.ex_05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		// Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_ex_05/applicationContext.xml");
		
		// Retrieve bean from spring container
		ICoach theCoach = context.getBean("thatSillyCoach", ICoach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getEmail());

		// close the context
		context.close();

	}
}
