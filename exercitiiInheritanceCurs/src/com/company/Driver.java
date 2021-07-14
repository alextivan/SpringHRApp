package com.company;

public class Driver extends Employee {

    public Driver(String name, Gender gender, int age, int numbersOfHoursWorked, float salaryPerHour, Seniority senior, Language language) {
        super(name, gender, age, numbersOfHoursWorked, salaryPerHour, senior, language);
    }

    @Override
    public float calculateSalary() {
        return super.calculateSalary() + 100;
    }

    @Override
    public void printNameAndSalaryInfo() {
        System.out.println("Name " + getName() + " salary: " + calculateSalary());
    }


}
