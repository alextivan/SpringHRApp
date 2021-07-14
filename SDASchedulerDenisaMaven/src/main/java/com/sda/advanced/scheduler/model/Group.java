package com.sda.advanced.scheduler.model;

import com.sda.advanced.scheduler.exceptions.MaxNumberOfStudentsReachedException;

import java.util.Set;

public class Group {
    private String name;
    private Trainer trainer;
    private Set<Student> students;

    public Group(String name, Trainer trainer,Set<Student> students) throws MaxNumberOfStudentsReachedException {

        if(students.size()>16){
            throw new MaxNumberOfStudentsReachedException();
        }

        this.name = name;
        this.trainer = trainer;
        this.students = students;

    }

    public Set<Student> getStudents() {
        return students;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", trainer=" + trainer +
                ", students=" + students +
                '}';
    }
}
