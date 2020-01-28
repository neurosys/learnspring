package org.neurosys.ex_03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		// Load the spring config file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Retrieve bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("Email = " + theCoach.getEmail());
		System.out.println("Team = " + theCoach.getTeam());

		// close the context
		context.close();

	}
}
