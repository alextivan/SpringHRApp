package com.company;

import java.text.SimpleDateFormat;


public class Student extends Person{

    private boolean hasPreviousJavaKnowledge;

    public Student(String firstname, String lastname, SimpleDateFormat dateOfBirth) {
        super(firstname, lastname, dateOfBirth);
    }


    public boolean isHasPreviousJavaKnowledge() {
        return hasPreviousJavaKnowledge;
    }

    public void setHasPreviousJavaKnowledge(boolean hasPreviousJavaKnowledge) {
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "hasPreviousJavaKnowledge=" + hasPreviousJavaKnowledge +
                '}';
    }
}
