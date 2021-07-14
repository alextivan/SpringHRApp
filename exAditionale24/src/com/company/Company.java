package com.company;

import java.util.Arrays;

public class Company {
    public String name;
    public Employee[] employees = new Employee[5];



    public int getAverageAge(){
        int suma = 0;

        for(int i=0; i<employees.length; i++){
            suma = suma + employees[i].age;
        }
        return suma/employees.length;
    }



    public Company(String name) {
        this.name = name;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Company(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "com.company.Company{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
