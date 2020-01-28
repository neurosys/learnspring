package org.neurosys.ex_03;

public class BaseballCoach implements ICoach {
	private IFortuneService fortuneService;

	public BaseballCoach(IFortuneService ifs) {
		this.fortuneService = ifs;
	}

	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
