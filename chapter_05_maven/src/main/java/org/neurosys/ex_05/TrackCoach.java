package org.neurosys.ex_05;

public class TrackCoach extends AbstractCoach implements ICoach {
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
