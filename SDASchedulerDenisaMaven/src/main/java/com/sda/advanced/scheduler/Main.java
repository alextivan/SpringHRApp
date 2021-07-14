package com.sda.advanced.scheduler;

import com.sda.advanced.scheduler.exceptions.MaxNumberOfStudentsReachedException;
import com.sda.advanced.scheduler.model.Group;
import com.sda.advanced.scheduler.model.Student;
import com.sda.advanced.scheduler.model.Trainer;
import com.sda.advanced.scheduler.model.enums.Gender;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) throws MaxNumberOfStudentsReachedException {

        Scanner in = new Scanner(System.in);
        System.out.println("Introdu numarul de studenti: ");
        int numberOfStudents = in.nextInt();

        Set<Student> studentSet = new HashSet<>();
        studentSet.addAll(initStudentSet(numberOfStudents));
        System.out.println(studentSet);


        Trainer trainer1 = new Trainer("Paul x", Gender.MALE, "Sotul Reginei X ", createRandomDate(1970, 2000), "JavaSuperAdvanced1", true);
        Trainer trainer2 = new Trainer("Paul y", Gender.MALE, "Sotul Reginei Y ", createRandomDate(1970, 2000), "JavaSuperAdvanced2", true);
        Trainer trainer3 = new Trainer("Paul z", Gender.MALE, "Sotul Reginei z ", createRandomDate(1970, 2000), "JavaSuperAdvanced3", true);

        Group group1 = new Group("JavaRemote21", trainer1, studentSet);
        Group group2 = new Group("JavaRemote22", trainer2, studentSet);
        Group group3 = new Group("JavaRemote23", trainer2, studentSet);

        System.out.println("Grupul " + group1);

        List<Group> groupList = new ArrayList<>();
        groupList.add(group1);
        groupList.add(group2);
        groupList.add(group3);


        ClassManagement.displayStudentsYoungetThen25(groupList);
        ClassManagement.groupWithMaximumNumberOfStudents(groupList);
        ClassManagement.removeAllStudentsUnder20(groupList);
        ClassManagement.displayGroupStudentsByTrainer(groupList);

    }

    public static Set<Student> initStudentSet(int numberOfStudents) {
        Set<Student> studentSet = new HashSet<>();
        for (int i = 0; i < numberOfStudents; i++) {

            studentSet.add(new Student("Henry " + i, Gender.MALE, "Sotul Reginei Victoria " + i, createRandomDate(1990, 2010), "JavaSuperAdvanced", true));
        }
        return studentSet;
    }

    private static LocalDate createRandomDate(int startYear, int endYear){
        int day = createRandomIntBerween(1, 28);
        int month = createRandomIntBerween(1, 12);
        int year = createRandomIntBerween(startYear, endYear);

        return LocalDate.of(year, month, day);

    }
    private static Integer createRandomIntBerween(int start, int end){
        Random r = new Random();
        int result = r.nextInt(end-start) + start;
        return result;
    }


}