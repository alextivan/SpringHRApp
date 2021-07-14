package com.company.InheritanceClasses;

import com.company.Employee;
import com.company.Gender;
import com.company.Language;
import com.company.Seniority;

public class Driver extends Employee {
    public Driver(String name, Gender gender, int age, int numbersOfHoursWorked, int salaryPerHour, Seniority seniority, Language language) {
        super(name, gender, age, numbersOfHoursWorked, salaryPerHour, seniority, language);
        System.out.println("Driver");
    }

    @Override
    public float calculateSalary() {
        return super.calculateSalary() + 50;
    }
}
