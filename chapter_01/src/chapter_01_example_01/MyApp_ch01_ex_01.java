package chapter_01_example_01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp_ch01_ex_01 {

	public static void main(String[] args) {
		
		// Create object
//		ICoach theCoach = new BaseballCoach();
		// or
//		ICoach theCoach = new TrackCoach();
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		
		// Use object
		System.out.println(theCoach.getDailyWorkout());
	}

}
