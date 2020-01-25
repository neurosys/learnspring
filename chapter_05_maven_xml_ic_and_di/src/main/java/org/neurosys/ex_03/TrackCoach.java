package org.neurosys.ex_03;

public class TrackCoach implements ICoach {
	private IFortuneService fortuneService;

	public TrackCoach(IFortuneService ifs) {
		this.fortuneService = ifs;
	}

	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public String getDailyFortune() {
		return "Just do it! " + fortuneService.getFortune();
	}

}
