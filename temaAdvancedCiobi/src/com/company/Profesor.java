package com.company;

import java.util.ArrayList;
import java.util.List;

//10. Creati clasa de Profesor care extinda clasa de Persoane
public class Profesor extends Person implements DisplayPersonInfo{
    public Profesor(String nume, Gender gender, String bio, byte age, String clasa) {
        super(nume, gender, bio, age, clasa);
    }

    @Override
    public String displayInfo() {
        return (getNume() + " " + getBio());
    }


}
