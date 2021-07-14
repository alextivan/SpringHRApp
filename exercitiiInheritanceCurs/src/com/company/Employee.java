package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Employee {

    private String name;
    private Gender gender;
    private int age;
    private int numbersOfHoursWorked;
    private float salaryPerHour;
    private Seniority seniority;
    private Language language;

    public Employee(String name, Gender gender, int age, int numbersOfHoursWorked, float salaryPerHour, Seniority senior, Language language) {
        System.out.println("Employee");
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.numbersOfHoursWorked = numbersOfHoursWorked;
        this.salaryPerHour = salaryPerHour;
        this.language = language;
    }

    public abstract void printNameAndSalaryInfo();

    public float calculateSalary() {
        return numbersOfHoursWorked * salaryPerHour;
    }

    public float calculateNumberOfHolidays() {
        return 15f;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !noContainsDigit(name))
            this.name = name;
    }

    private boolean noContainsDigit(String text) {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(text);
        return m.find();
    }



    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public int getNumbersOfHoursWorked() {
        return numbersOfHoursWorked;
    }

    public void setNumbersOfHoursWorked(int numbersOfHoursWorked) {
        if (numbersOfHoursWorked > 0)
            this.numbersOfHoursWorked = numbersOfHoursWorked;
    }

    public float getSalaryPerHour() {

        return salaryPerHour;
    }

    public void setSalaryPerHour(float salaryPerHour) {
        if (salaryPerHour > 0)
            this.salaryPerHour = salaryPerHour;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", numbersOfHoursWorked=" + numbersOfHoursWorked +
                ", salaryPerHour=" + salaryPerHour +
                ", language=" + language +
                '}';
    }
}
