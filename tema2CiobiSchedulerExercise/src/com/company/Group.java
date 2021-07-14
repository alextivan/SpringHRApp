package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Group {

    private String name;
    private Trainer trainer;
    private Set<Student> students = new HashSet<>();

    public Group(String name, Trainer trainer) {
        this.name = name;
        this.trainer = trainer;
    }

    public void addStudents(List<Student> newStudentsToAdd) throws MaximumNunberOfStudentsReachedException{
        int numberOfStudentsToAdd = newStudentsToAdd.size();
        int numberOfExistingStudents = this.students.size();

        if(numberOfExistingStudents + numberOfStudentsToAdd > 5)
            throw new MaximumNunberOfStudentsReachedException();
        else
            this.students.addAll(newStudentsToAdd);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", trainer=" + trainer +
                ", students=" + students +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }



}
