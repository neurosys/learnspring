package org.neurosys.ex_05;

public class CricketCoach extends AbstractCoach implements ICoach {
    private IFortuneService fortuneService;

    public String getDailyWorkout() {
        return "Kick the bull (mr cricket)";
    }

    public String getDailyFortune() {
        return "From cricket  with love: " + fortuneService.getFortune();
    }

    public void setFortuneService(IFortuneService ifs) {
        fortuneService = ifs;
    }
}
