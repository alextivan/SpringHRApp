package com.company.servicii;

import com.company.entitati.Persoana;

public class FonduriEuropene {

    public static void acceseazaFonduriEuropene(Persoana p) {
        switch(p.cetatenie) {
            case "ROMANA":
            case "GERMANA":
            case "FRANCEZA":
                System.out.println("Dosarul a fost acceptat. Persoana " + p.prenume + " " + p.nume + " poate accesa fonduri in valoare de: " + p.lichiditati * 2);
                break;
            case "BRITANICA":
                System.out.println("Doar dosarele depuse pana la 31 Decembrie 2020 mai pot fi acceptate");
                break;
            default:
                System.out.println("Ne pare rau, nu sunteti eligibil pentru fonduri europene");
        }
    }
}
