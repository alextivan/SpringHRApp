package com.sda.advanced.scheduler.model;

import com.sda.advanced.scheduler.model.enums.Gender;

import java.time.LocalDate;

public class Student extends Person{
    private boolean hasPreviousJavaKnoledge;

    public Student(String name, Gender gender, String bio, LocalDate dateOfBirth, String clasa, boolean hasPreviousJavaKnoledge) {
        super(name, gender, bio, dateOfBirth, clasa);
        this.hasPreviousJavaKnoledge = hasPreviousJavaKnoledge;
    }

    public boolean isHasPreviousJavaKnoledge() {
        return hasPreviousJavaKnoledge;
    }



    @Override
    public String toString() {
        return "Student{" +
                "hasPreviousJavaKnoledge=" + hasPreviousJavaKnoledge +
                "} " + super.toString();
    }
}
