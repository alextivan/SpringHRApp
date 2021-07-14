package com.company;

public class JavaProgrammer extends Programmer{
    public JavaProgrammer(String name, Gender gender, int age, int numbersOfHoursWorked, float salaryPerHour, Seniority senior, Language language) {
        super(name, gender, age, numbersOfHoursWorked, salaryPerHour, senior, language);
        System.out.println("JavaProgrammer");
    }

    @Override
    public float calculateSalary() {
         return super.calculateSalary() * 2;
    }

    @Override
    public void printNameAndSalaryInfo() {
        System.out.println("Name " + getName() + " salary: " + calculateSalary());
    }

}
