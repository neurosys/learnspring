package org.neurosys.ex_01;

import org.springframework.stereotype.Component;

// "thatSillyCoach" is the id of the bean if no name was provided, the name would have been obtained
// by lowering the first letter of the class so TenisCoach would give an id of tenishCoach
@Component("thatSillyCoach")
public class TenisCoach implements ICoach {

    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
