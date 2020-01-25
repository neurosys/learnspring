package org.neurosys.ex_05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext_05/applicationContext.xml");
		
		// Retrieve bean from spring container
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		ICoach cricketCoach = context.getBean("myCricketCoach", ICoach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		System.out.println("=========== Cricket Coach ==========");
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(((CricketCoach)cricketCoach).getEmailAddress());
		System.out.println(((CricketCoach)cricketCoach).getTeam());

		// close the context
		context.close();

	}

}
