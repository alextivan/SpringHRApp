package com.company;


//1. Create an employee base class with the following fields: name, gender, age,
//number of hours worked, salary per hour, seniority, language. (Hint: use
//enums for gender, seniority and language fields)
//2. Generate getters and setters for these fields.
//3. Avoid to introduce null and empty name, and avoid to introduce a name which
//contains numbers.
//4. Avoid to introduce negative values for age, number of hours worked, salary
//per hour.
//5. Create the methods calculateSalary, calculateNumberOfHolidays methods
//and calculate salary and define the number of holidays.
//7. Create two constructors: the first one should include all the fields, the second
//one only name and age.
//8. Create some childs classes from employee class: programmer, driver.
//9. Create the following child classes for programmer: java developer, android
//developer, web developer.
//10. Create an instance of each programmer class, and print the order of the
//calling of the constructors.
//11. Override the calculate salary method in programmer and driver classes.
//12. Modify android developer to be final
//13. Add a static method in programmer class which calculates and return the
//value of the bonus.
//14. Override the bonus static method in web developer class.


public class Employee {
    private String name;
    private Gender gender;
    private int age;
    private int numbersOfHoursWorked;
    private int salaryPerHour;
    private Seniority seniority;
    private Language language;


public float calculateSalary(){
        return numbersOfHoursWorked * salaryPerHour;

    }



    public int calculateNumberOfHolidays(){
        return 21;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, Gender gender, int age, int numbersOfHoursWorked, int salaryPerHour, Seniority seniority, Language language) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.numbersOfHoursWorked = numbersOfHoursWorked;
        this.salaryPerHour = salaryPerHour;
        this.seniority = seniority;
        this.language = language;
        System.out.println("Employee");

    }



    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty() && onlyLetters(name)  )
        this.name = name;
    }

    public boolean containsLetters(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public boolean onlyLetters(String name){
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Seniority getSeniority() {
        return seniority;
    }

    public void setSeniority(Seniority seniority) {
        this.seniority = seniority;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0)
        this.age = age;
    }

    public int getNumbresOfHoursWorked() {
        return numbersOfHoursWorked;
    }

    public void setNumbresOfHoursWorked(int numbresOfHoursWorked) {
        if(numbresOfHoursWorked > 0)
        this.numbersOfHoursWorked = numbresOfHoursWorked;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        if (salaryPerHour > 0)
        this.salaryPerHour = salaryPerHour;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", numbersOfHoursWorked=" + numbersOfHoursWorked +
                ", salaryPerHour=" + salaryPerHour +
                ", seniority='" + seniority + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}

