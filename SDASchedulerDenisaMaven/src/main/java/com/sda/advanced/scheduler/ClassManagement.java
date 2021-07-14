package com.sda.advanced.scheduler;

import com.sda.advanced.scheduler.model.Group;
import com.sda.advanced.scheduler.model.Student;
import com.sda.advanced.scheduler.model.Trainer;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class ClassManagement {
    public void displayAllStudentsWithPreviousJavaKnowledge(Set<Student> studentSet) {
        for (Student student : studentSet) {
            if (student.isHasPreviousJavaKnoledge()) {
                System.out.println(student);
            }
        }
    }
//Display the group with the maximum number of students
    public static void groupWithMaximumNumberOfStudents(List<Group> groupList){
        int max = groupList.get(0).getStudents().size();
        Group maxNrOfStudentsGroup = groupList.get(0);

        for (Group group: groupList ) {
            if(group.getStudents().size() > max){
                max = group.getStudents().size();
                maxNrOfStudentsGroup = group;
            }
        }
        System.out.println("Grupul cu nr max de studenti" + maxNrOfStudentsGroup.getName());
    }
//Display the group younger then 25
    public static void displayStudentsYoungetThen25(List<Group> groupList) {
        System.out.println("students younger then 25 years old");

        for (Group grup : groupList) {
            Set<Student> students = grup.getStudents();

            for (Student student : students){
                int age = Period.between(LocalDate.now(),student.getDateOfBirth()).getYears();
                if(age < 25){
                    System.out.println(student + " Varsta: " + age);
                }
            }

        }

    }
//Remove all the students younger than 20 from all groups
    public static void removeAllStudentsUnder20(List<Group> groupList) {
        System.out.println("students under 20 years old");
        for (Group grup : groupList) {

            Iterator<Student> studentIterator = grup.getStudents().iterator();

            while(studentIterator.hasNext()){
                Student nextS = studentIterator.next();
                int age = Period.between(nextS.getDateOfBirth(), LocalDate.now()).getYears();
                if(age < 20){
                    System.out.println("student sters: " + nextS);
                    studentIterator.remove();
                }
            }
        }
    }
//Display all students grouped by trainer that teaches them
    public static void displayGroupStudentsByTrainer(List<Group> groupList){
        Map<Trainer, Set<Student>> studentMap = new HashMap<Trainer, Set<Student>>();
        for(Group group : groupList){
            studentMap.put(group.getTrainer(), group.getStudents());
        }
        for(Map.Entry<Trainer, Set<Student>> entry: studentMap.entrySet()){
            System.out.println("Trainer " + entry.getKey() + " has " + entry.getValue().size() +" students " );
        }

    }
}

