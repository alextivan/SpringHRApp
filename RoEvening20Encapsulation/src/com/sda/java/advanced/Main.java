package com.sda.java.advanced;

public class Main {

    public static void main(String[] args) {

        // varianta 1
        Dog dog = new Dog("Rex",
                3,
                "male",
                "Labrador",
                15.5f);

        // varianta 2
        Dog dogNew = new Dog();
        dogNew.setName("Lessie");
        dogNew.setAge(2);
        dogNew.setGender("female");
        dogNew.setRace("Coly");
        dogNew.setWeight(7.3f);

        System.out.println("Caine in stare initiala: " + dog);

        dog.setWeight(-19.3f);
        dog.setName("");
        dog.setGender("");
        dog.setRace("");
        dog.setAge(100);

        System.out.println("Caine in stare schimbata: " + dog);

        Zebra zebra = new Zebra(12);

        // varianta 1
        System.out.println(new Canine().getAverageWeight());

        // varianta 2
        Canine canine = new Canine();
        double averageWeight = canine.getAverageWeight();
        System.out.println(averageWeight);

        System.out.println(new Wolf().getAverageWeight());
    }
}
