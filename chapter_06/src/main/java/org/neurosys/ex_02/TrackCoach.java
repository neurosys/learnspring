package org.neurosys.ex_02;

public class TrackCoach extends AbstractCoach implements ICoach {
	private IFortuneService fortuneService;

	public TrackCoach(IFortuneService ifs) {
		System.out.println("INFO: This is the constructor of TrackCoach");
		this.fortuneService = ifs;
	}

	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public String getDailyFortune() {
		return "Just do it! " + fortuneService.getFortune();
	}

	public void doStartupStuff() {
		System.out.println("INFO: This is executed via a hook in Spring's initialization part");
	}

	public void doCleanupStuff() {
		System.out.println("INFO: This is executed via a hook in Spring's finalization part");
	}
}
