package com.company;

public class Animal {

    public String nume;
    public String tip;
    public String rasa;
    public Short greutate;
    public Byte varsta;
    public Boolean esteVaccinat;


    public void mananca(String nume){
        System.out.println("Mananca:" + nume + "!");
    }

    public void alearga(String nume){
        System.out.println("Alearga:" + nume + "!");
    }

    public void dormi(String nume){
        System.out.println("Dormi:" + nume + "!");
    }
}
