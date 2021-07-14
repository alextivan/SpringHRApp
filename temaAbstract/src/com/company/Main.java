//1. Creati o clasa de baza abstracta de Imobil cu urmatoarele proprietati: nume proprietar, metri patrati, pret pe metri patrat, impozit pe metru patrat, cu sau fara garaj, stare(de vanzare, de inchiriat, nomal) (sa fie un enum).
//2. Creati doua metode abstracte pentru a calcula pretul imobilului si impozitul de platit pentru imobil.
//3. Creati doua clase de copil Aparmtament si Casa.
//4. Implementati metodele de calculare a pretului si al impozitului.
//5. Instatiati 3 obiecte de Apartament, respectiv 3 de casa. Pentru Apartament sa creati un constructor cu toate campurile, iar pentru Casa folositi constructorul implicit si metoda prin setter.
//6. Creati un array de Imobil si afisati lista preturilor si a impozitelor pentru fiecare imobil.

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Imobil[] imobils = new Imobil[5];

        imobils[0] = new Apartament("Ion", 35.5f, 1200, true, Stare.deVanzare, 20f);
        imobils[1] = new Apartament("Mircea", 120f, 1200, true, Stare.deInchiriat, 20f);
        imobils[2] = new Apartament("Mary", 70f, 1200, true, Stare.locuintaPersonalaNORMAL, 20f);

        System.out.println("Imobil1: " + imobils[0]);
        System.out.println("Imobi2: " + imobils[1]);
        System.out.println("Imobil3: " + imobils[2]);

        imobils[3] = new Casa();
        imobils[4] = new Casa("Casa2", 70f, 1200, true, Stare.locuintaPersonalaNORMAL, 20f);

        System.out.println("Imobil4: " + imobils[3]);
        System.out.println("Imobil5: " + imobils[4]);

        for(int i=0; i<imobils.length; i++){
            System.out.println("Imobilul: " + (i+1) + " costa " + imobils[i].pretImobil() + " si are impozitul " + imobils[i].impozitImobil());
        }
    }
}
