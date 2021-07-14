package com.sda.advanced.scheduler.model;

import com.sda.advanced.scheduler.model.enums.Gender;

import java.time.LocalDate;

public class Trainer extends Person{
    private boolean isAuthorized;

    public Trainer(String name, Gender gender, String bio, LocalDate dateOfBirth, String clasa, boolean isAuthorized) {
        super(name, gender, bio, dateOfBirth, clasa);
        this.isAuthorized = isAuthorized;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "isAuthorized=" + isAuthorized +
                "} " + super.toString();
    }
}
