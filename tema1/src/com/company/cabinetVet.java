package com.company;

import jdk.nashorn.internal.ir.IfNode;

public class cabinetVet {
    public String nume;
    public int numarAnimaleTratate;
    public short numarAngajati;
    public String adresa;

    public void trateazaAnimal(Animal a) {
        numarAnimaleTratate = numarAnimaleTratate + 1;
        System.out.println("In total s-au tratat:" + numarAnimaleTratate + " animale.");
    }

    public void cumparaMedicament(String numeMedicament) {
        System.out.println("S-a cumparat medicamentul:" + numeMedicament);
    }

}
