package org.neurosys.ex_01;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService {

    public String getFortune() {
        return "Don't worry be happy!";
    }
}
