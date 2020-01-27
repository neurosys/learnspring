package org.neurosys.ex_04;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService {

    public String getFortune() {
        return "Don't worry be happy!";
    }
}
