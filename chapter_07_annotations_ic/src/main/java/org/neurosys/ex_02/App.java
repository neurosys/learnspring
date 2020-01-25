package org.neurosys.ex_02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		// Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_ex_02.xml");
		
		// Retrieve bean from spring container
		ICoach theCoach = context.getBean("tenisCoach", ICoach.class);

		System.out.println(theCoach.getDailyWorkout());

		// close the context
		context.close();

	}
}
