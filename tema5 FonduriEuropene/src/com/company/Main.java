package com.company;

import com.company.entitati.Persoana;
import com.company.servicii.FonduriEuropene;
import com.company.servicii.GhiseuPermise;

public class Main {

    public static void main(String[] args) {


Persoana p1= new Persoana( "Ioan", "I", 17, 152.24, "ROMANA" );
Persoana p2= new Persoana("Ioan", "II", 32, 152.24, "ROMANA");
Persoana p3= new Persoana("Ioan", "III", 32, 152.24, "BRITANICA");
Persoana p4= new Persoana("Ioan", "IV", 32, 152.24, "FRANCEZA");
Persoana p5= new Persoana("Ioan", "V", 32, 152.24, "ROMANA");

Persoana[] persoane = {p1, p2, p3, p4, p5};

GhiseuPermise gp = new GhiseuPermise();
FonduriEuropene fe = new FonduriEuropene();

for(int i = 0; i < persoane.length ; i++){
    gp.depuneDosar(persoane[i]);
    fe.acceseazaFonduriEuropene(persoane[i]);

}

}
}
