package com.company.servicii;

import com.company.entitati.Persoana;

public class GhiseuPermise {

    public void depuneDosar(Persoana p) {
        if(p.varsta >= 18) {
            System.out.println("S-a depus cu succes dosarul pentru " + p.prenume + " " + p.nume);
        } else {
            System.out.println("Nu se poate depune dosar sub varsta de 18 ani");
        }
    }
}
