package com.company.InheritanceClasses;


import com.company.Gender;
import com.company.Language;
import com.company.Seniority;

public class JavaProgrammer extends Programmer{


    public JavaProgrammer(String name, Gender gender, int age, int numbersOfHoursWorked, int salaryPerHour, Seniority seniority, Language language) {
        super(name, gender, age, numbersOfHoursWorked, salaryPerHour, seniority, language);
        System.out.println("JavaProgrammer");
    }
}
