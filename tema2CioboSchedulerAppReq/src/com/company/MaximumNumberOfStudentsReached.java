package com.company;


import java.util.Set;

public class MaximumNumberOfStudentsReached extends Exception{
    public MaximumNumberOfStudentsReached(Set<Student> ss){
        super("Number of students exceeded 5");
    }
}
