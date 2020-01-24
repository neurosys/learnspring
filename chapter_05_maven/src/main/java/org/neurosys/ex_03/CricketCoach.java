package org.neurosys.ex_03;

public class CricketCoach implements ICoach {
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
