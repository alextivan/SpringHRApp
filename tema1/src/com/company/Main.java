package com.company;

public class Main {

    public static void main(String[] args) {

        // Aici creez cabinetul
        cabinetVet c1 = new cabinetVet();
        c1.nume = "AcumVet";
        c1.numarAnimaleTratate = 0;
        c1.numarAngajati = 3;
        c1.adresa = "Bucuresti";

        // Aici creez animalul 1
        Animal a1 = new Animal();
        a1.nume = "Grivei";
        a1.tip = "catel";
        a1.rasa = "comunitar";
        a1.greutate = 10;
        a1.varsta = 2;
        a1.esteVaccinat = true;

        c1.trateazaAnimal(a1);
        c1.trateazaAnimal(a1);
        c1.cumparaMedicament("ivomec");
    }

}
