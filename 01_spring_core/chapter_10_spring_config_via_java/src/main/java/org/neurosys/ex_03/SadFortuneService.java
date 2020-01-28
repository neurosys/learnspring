package org.neurosys.ex_03;

public class SadFortuneService implements IFortuneService {
    @Override
    public String getFortune() {
        return "Today is a sad day!";
    }
}
