package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
     //exercitiul 23

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Alex", "Ivan", (byte)36);
        employees[1] = new Employee("Alex", "Ivan", (byte)36);
        employees[2] = new Employee("Alex", "Ivan", (byte)36);
        employees[3] = new Employee("Alex", "Ivan", (byte)36);
        employees[4] = new Employee("Alex", "Ivan", (byte)36);
      //  employees[0].firstName = "Alex";
        // employees[0].lastName = "Ivan";
      //  employees[0].age = 36;
     //   employees[1].firstName = "Andrei";
     //   employees[1].lastName = "Ivan";
     //   employees[1].age = 15;
     //   employees[2].firstName = "Ion";
     //   employees[2].lastName = "Ivan";
     //   employees[2].age = 25;
     //   employees[3].firstName = "Gigi";
     //   employees[3].lastName = "Ivan";
     //   employees[3].age = 62;
     //   employees[4].firstName = "George";
     //   employees[4].lastName = "Ivan";
     //   employees[4].age = 69;

        Company company = new Company("Firma1", employees);

        System.out.println(company.getAverageAge());


    }
}
