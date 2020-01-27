package org.neurosys.ex_05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// "thatSillyCoach" is the id of the bean if no name was provided, the name would have been obtained
// by lowering the first letter of the class so TenisCoach would give an id of tenishCoach
@Component("thatSillyCoach")
public class TenisCoach implements ICoach {
    @Value("${foo.coach.email}")
    private String email;

    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getEmail() {
        return email;
    }
}
