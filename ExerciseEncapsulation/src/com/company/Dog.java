package com.company;

public class Dog {

    private String name;
    private int age;
    private String gender;
    private String race;
    private float weight;

    public Dog(String name, int age, String gender, String race, float weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public Dog(String gender, String race) {
    //   this.gender = gender;
    //   this.race = race;
    //   this.name = "Name";
    //   this.age = 1;
    //   this.weight = 2;
        this("Name", 1, gender, race, 2);
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && name != " ")
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public float getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age>0 && age<20)
        this.age = age;
    }

    public void setGender(String gender) {
        if(gender != null && !gender.isEmpty())
        this.gender = gender;
    }

    public void setRace(String race) {
        if(race != null && !race.equals(""))
        this.race = race;
    }

    public void setWeight(float weight) {
        if(weight>0) this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }
}
