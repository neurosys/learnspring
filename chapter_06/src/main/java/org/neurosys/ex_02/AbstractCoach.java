package org.neurosys.ex_02;

public abstract class AbstractCoach {
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("INFO: AbstractCoach: setEmailAddress()");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("INFO: AbstractCoach: setTeam()");
        this.team = team;
    }
}
