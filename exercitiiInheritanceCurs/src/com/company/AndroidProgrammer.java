package com.company;

public final class AndroidProgrammer extends Programmer{

    public AndroidProgrammer(String name, Gender gender, int age, int numbersOfHoursWorked, float salaryPerHour, Seniority senior, Language language) {
        super(name, gender, age, numbersOfHoursWorked, salaryPerHour, senior, language);
    }

    @Override
    public void printNameAndSalaryInfo() {
        System.out.println("Name " + getName() + " salary: " + calculateSalary());
    }
}
