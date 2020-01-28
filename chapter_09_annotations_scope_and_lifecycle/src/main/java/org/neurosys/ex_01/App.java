package org.neurosys.ex_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		// Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_ex_01.xml");
		
		// Retrieve bean from spring container
		ICoach theCoach = context.getBean("thatSillyCoach", ICoach.class);
		ICoach alphaCoach = context.getBean("thatSillyCoach", ICoach.class);

		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("==================================");
		System.out.println(alphaCoach.getDailyWorkout());
		System.out.println(alphaCoach.getDailyFortune());

		System.out.println("==================================");
		System.out.println(alphaCoach);
		System.out.println(theCoach);
		System.out.println("==================================");
		if (theCoach == alphaCoach) {
			System.out.println("The coach and alpha coach are the same");
		} else {
			System.out.println("The coach and alpha coach are different objects");
		}
		// close the context
		context.close();

	}
}
