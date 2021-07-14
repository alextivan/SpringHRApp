package com.company;

import com.company.entitati.Persoana;
import com.company.servicii.FonduriEuropene;
import com.company.servicii.GhiseuPermise;

public class Main {

    public static void main(String[] args) {

        Persoana p1 = new Persoana("Ioan", "Gabriel", 17, 200.0, "ROMANA");
        Persoana p2 = new Persoana("Marcu", "Andrada", 29, 573.4, "FRANCEZA");
        Persoana p3 = new Persoana("John", "Doe", 18, 420.7, "BRITANICA");
        Persoana p4 = new Persoana("Kern", "Wilhelm", 62, 2725.1, "GERMANA");
        Persoana p5 = new Persoana("Andres", "Natalia", 33, 1533.9, "COLUMBIANA");
        Persoana[] persoane = { p1, p2, p3, p4, p5 };

        GhiseuPermise gp = new GhiseuPermise();
        FonduriEuropene fe = new FonduriEuropene();

        for(int i = 0; i < persoane.length; i++) {
            gp.depuneDosar(persoane[i]);
            fe.acceseazaFonduriEuropene(persoane[i]);
        }
    }
}
