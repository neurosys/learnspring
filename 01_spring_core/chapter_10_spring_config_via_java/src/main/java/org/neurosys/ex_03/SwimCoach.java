package org.neurosys.ex_03;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements ICoach {
    private IFortuneService fortuneService;

    @Value("${foo.team}")
    private String team;

    @Value("${foo.email}")
    private String email;


    public String getTeam() {
        return team;
    }

    public String getEmail() {
        return email;
    }

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
