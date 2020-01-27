package org.neurosys.ex_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// This will have the bean id of tenisCoach because Spring generates the id
// by lowering the first name in the name of the class
@Component
public class TenisCoach implements ICoach {
    private IFortuneService fortuneService;

    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Autowired
    public void setFortuneService(IFortuneService fortune) {
        System.out.println("INFO: setFortuneService()");
        this.fortuneService = fortune;
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
