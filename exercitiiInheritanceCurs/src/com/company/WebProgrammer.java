package com.company;

public class WebProgrammer extends Programmer{

    public WebProgrammer(String name, Gender gender, int age, int numbersOfHoursWorked, float salaryPerHour, Seniority senior, Language language) {
        super(name, gender, age, numbersOfHoursWorked, salaryPerHour, senior, language);
    }

    public static float calculateBonus(){
        return 600;
    }

    @Override
    public void printNameAndSalaryInfo() {
        System.out.println("Name " + getName() + " salary: " + calculateSalary());
    }

}
