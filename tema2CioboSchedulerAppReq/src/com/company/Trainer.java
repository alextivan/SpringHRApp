package com.company;

import java.text.SimpleDateFormat;

public class Trainer extends Person {

    private boolean isAuthorized;

    public Trainer(String firstname, String lastname, SimpleDateFormat dateOfBirth) {
        super(firstname, lastname, dateOfBirth);
    }


    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "isAuthorized=" + isAuthorized +
                '}';
    }
}
