package org.neurosys.ex_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// "thatSillyCoach" is the id of the bean if no name was provided, the name would have been obtained
// by lowering the first letter of the class so TenisCoach would give an id of tenishCoach
@Component("thatSillyCoach")
public class TenisCoach implements ICoach {
    private IFortuneService fortuneService;

    @Autowired
    public TenisCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
