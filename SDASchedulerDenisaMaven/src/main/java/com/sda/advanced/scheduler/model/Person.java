package com.sda.advanced.scheduler.model;

import com.sda.advanced.scheduler.model.enums.Gender;

import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String name;
    private Gender gender;
    private String bio;
    private LocalDate dateOfBirth;
    private String clasa;

    public Person(String name, Gender gender, String bio, LocalDate dateOfBirth, String clasa) {
        this.name = name;
        this.gender = gender;
        this.bio = bio;
        this.dateOfBirth = dateOfBirth;
        this.clasa = clasa;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", bio='" + bio + '\'' +
                ", dateofbirth=" + dateOfBirth +
                ", clasa='" + clasa + '\'' +
                '}' + '\n';
    }


}


