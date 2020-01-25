package org.neurosys.ex_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext_ex_01.xml");
		
		// Retrieve bean from spring container
		// myCoach has the default scope so the're going to be identical
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		ICoach alphaCoach = context.getBean("myCoach", ICoach.class);

		puttheCoachesToWork(theCoach, alphaCoach);
		System.out.println("============================");
		areTheCoachesIdentical(theCoach, alphaCoach);

		// Retrieve the other beans from spring container
		// myOtherCoach has the scope prototype the're going to be different
		ICoach coach1 = context.getBean("myOtherCoach", ICoach.class);
		ICoach coach2 = context.getBean("myOtherCoach", ICoach.class);

		puttheCoachesToWork(coach1, coach2);
		System.out.println("============================");
		areTheCoachesIdentical(coach1, coach2);

		// close the context
		context.close();

	}

	private static void areTheCoachesIdentical(ICoach theCoach, ICoach alphaCoach) {
		System.out.println("Is the same? = " + (theCoach == alphaCoach));
		System.out.println("theCoach = " + theCoach);
		System.out.println("alphaCoach = " + alphaCoach);
	}

	private static void puttheCoachesToWork(ICoach theCoach, ICoach alphaCoach) {
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("============================");
		System.out.println(alphaCoach.getDailyWorkout());
		System.out.println(alphaCoach.getDailyFortune());
	}

}
