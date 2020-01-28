package org.neurosys.ex_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		// Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_ex_01.xml");
		
		// Retrieve bean from spring container
		ICoach theCoach = context.getBean("thatSillyCoach", ICoach.class);

		System.out.println(theCoach.getDailyWorkout());

		// close the context
		context.close();

	}
}
