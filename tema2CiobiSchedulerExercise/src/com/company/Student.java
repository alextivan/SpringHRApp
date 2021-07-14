package com.company;

import java.time.LocalDate;

public class Student extends Person{

    private Boolean hasPreviousJavaKnowledge;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, Boolean hasJavaKnowledge) {
        super(firstName, lastName, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "hasPreviousJavaKnowledge=" + hasPreviousJavaKnowledge +
                '}';
    }

    public Boolean getHasPreviousJavaKnowledge() {
        return hasPreviousJavaKnowledge;
    }

    public void setHasPreviousJavaKnowledge(Boolean hasPreviousJavaKnowledge) {
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }
}
