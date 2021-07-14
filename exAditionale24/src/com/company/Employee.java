package com.company;

public class Employee {

    public String firstName;
    public String lastName;
    public byte age;

    public Employee(String firstName, String lastName, byte age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Employee() {
    }

    public byte getAge() {
            return age;
    }

    @Override
    public String toString() {
        return "com.company.Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
