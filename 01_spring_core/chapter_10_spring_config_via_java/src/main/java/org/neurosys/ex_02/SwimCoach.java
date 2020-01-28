package org.neurosys.ex_02;

public class SwimCoach implements ICoach {
    private IFortuneService fortuneService;

    public SwimCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 10 pools";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
