package org.neurosys.ex_02;

public class SadFortuneService implements IFortuneService {
    @Override
    public String getFortune() {
        return "Today is a sad day!";
    }
}
