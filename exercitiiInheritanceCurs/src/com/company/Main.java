package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee androidProgrammer = new AndroidProgrammer(
                "George",
                Gender.MALE,
                32,
                160,
                50.5f,
                Seniority.SENIOR,
                Language.ENGLISH
                );

        System.out.println("Employee: " + androidProgrammer);

        androidProgrammer.setName("Ion");
        androidProgrammer.setAge(20);
        androidProgrammer.setSalaryPerHour(50);
        androidProgrammer.setNumbersOfHoursWorked(150);

        System.out.println("Employee: " + androidProgrammer);
        System.out.println("Salary: " + androidProgrammer.calculateSalary());
        System.out.println("Holiday: " + androidProgrammer.calculateNumberOfHolidays());


        Employee javaProgrammer = new JavaProgrammer(
                "Mary",
                Gender.FEMALE,
                18,
                169,
                48.5f,
                Seniority.BEGGINER,
                Language.FRENCH
        );
        Employee webProgrammer = new WebProgrammer(
                "Katty",
                Gender.FEMALE,
                18,
                169,
                48.5f,
                Seniority.BEGGINER,
                Language.FRENCH
        );

        Programmer programmer = new Programmer(
                "Gica",
                Gender.MALE,
                19,
                100,
                100f,
                Seniority.SENIOR,
                Language.FRENCH
        );

        System.out.println("Salary: " + programmer.calculateSalary());

        System.out.println("Bonus: " + Programmer.calculateBonus());

        System.out.println("Bonus Web: " + WebProgrammer.calculateBonus());

        Employee[] employees = new Employee[3];
        employees[0] = androidProgrammer;
        employees[1] = javaProgrammer;
        employees[2] = webProgrammer;

        for(int i=0; i < employees.length; i++){
            employees[i].printNameAndSalaryInfo();
        }
    }

    }

