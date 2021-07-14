package com.company;

import java.time.LocalDate;

public class Trainer extends Person{

    private boolean isAuthorized;


    public Trainer(String firstName, String lastName, LocalDate dateOfBirth, Boolean isAuthorized) {
        super(firstName, lastName, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Trainer{" + super.toString() +
                "isAuthorized=" + isAuthorized +
                "} ";
    }


}



