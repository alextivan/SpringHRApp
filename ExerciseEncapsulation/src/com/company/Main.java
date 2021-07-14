package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// var 1
    Dog dog = new Dog ("Rex", 3, "male", "Labrador", 15.5f);

    //var 2
        Dog dogNew = new Dog();
        dogNew.setName("Lessie");
        dogNew.setAge(2);
        dogNew.setGender("female");
        dogNew.setRace("Coly");
        dogNew.setWeight(7.3f);

        System.out.println("Caine in stare initiala: " + dog);

        dog.setWeight(-9.3f);

        //verificam daca merge verificarea de info eronate
        dog.setName("");
        dog.setRace("");
        dog.setGender("");
        dog.setAge(10);

        System.out.println("Caine in stare schimbata: " + dog);
    }
}
