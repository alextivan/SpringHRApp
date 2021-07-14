package com.company.servicii;

import com.company.entitati.Persoana;

public class GhiseuPermise {

    public static void depuneDosar(Persoana p1) {
        if (p1.varsta >= 18) {
            System.out.println("S-a depus cu succes dosarul pentru: " + p1.nume + " " + p1.prenume);
        } else {
            System.out.println("Nu se poate depune dosar sub varsta de 18 ani");
        }
    }
}