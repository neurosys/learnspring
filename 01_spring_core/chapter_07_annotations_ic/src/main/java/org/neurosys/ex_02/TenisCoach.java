package org.neurosys.ex_02;

import org.springframework.stereotype.Component;

// This will have the bean id of tenisCoach because Spring generates the id
// by lowering the first name in the name of the class
@Component
public class TenisCoach implements ICoach {

    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
