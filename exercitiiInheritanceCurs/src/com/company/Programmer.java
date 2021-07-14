package com.company;

public class Programmer extends Employee{

    public Programmer(String name, Gender gender, int age, int numbersOfHoursWorked, float salaryPerHour, Seniority senior, Language language) {
        super(name, gender, age, numbersOfHoursWorked, salaryPerHour, senior, language);
        System.out.println("Programmer");
    }

    public static float calculateBonus(){
        return 500;
    }

    @Override
    public void printNameAndSalaryInfo() {
        System.out.println("Name " + getName() + " salary: " + calculateSalary());
    }
}
