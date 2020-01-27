package org.neurosys.ex_04;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component("randomFortune")
public class RandomFortuneService implements IFortuneService {

    private String[] data = {
            "4, this was obtained by fair dice rolling",
            "No idea man, I'm just typing things",
            "999999999999 with random numbers you can never know if is really random or not 999999"
    };
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        return data[index];
    }
}
