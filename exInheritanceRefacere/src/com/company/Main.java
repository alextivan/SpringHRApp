package com.company;

import com.company.InheritanceClasses.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Employee employee = new Employee();
        employee.setName("George");
        employee.setGender(Gender.MALE);
        employee.setAge(32);
        employee.setNumbresOfHoursWorked(160);
        employee.setSalaryPerHour(50);
        employee.setSeniority(Seniority.MIDDLE);
        employee.setLanguage(Language.ENGLISH);

        Employee employee1 = new Employee(
                "Ion",
                Gender.MALE,
                33,
                150,
                50,
                Seniority.MIDDLE,
                Language.ENGLISH
        );
        System.out.println(employee1);

        employee1.setName("Ionica");

        System.out.println(employee1);
        System.out.println(employee1.calculateSalary());
        System.out.println(employee1.calculateNumberOfHolidays());

        JavaProgrammer javaProgrammer = new JavaProgrammer("Ion",
                Gender.MALE,
                33,
                150,
                50,
                Seniority.MIDDLE,
                Language.ENGLISH);


        AndroidProgrammer androidProgrammer = new AndroidProgrammer("Ion",
                Gender.MALE,
                33,
                150,
                50,
                Seniority.MIDDLE,
                Language.ENGLISH);

        Driver driver = new Driver("Ion",
                Gender.MALE,
                33,
                150,
                50,
                Seniority.MIDDLE,
                Language.ENGLISH);

        WebProgrammer webProgrammer = new WebProgrammer("Ion",
                Gender.MALE,
                33,
                150,
                50,
                Seniority.MIDDLE,
                Language.ENGLISH);

        Programmer programmer = new Programmer("Ion",
                Gender.MALE,
                33,
                150,
                50,
                Seniority.MIDDLE,
                Language.ENGLISH);


        
        System.out.println("Salariu programator: " + programmer.calculateSalary());
        System.out.println("Salariu driver: " + driver.calculateSalary());

    }




}


