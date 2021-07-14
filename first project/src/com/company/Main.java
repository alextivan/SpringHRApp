package com.company;

public class Main {

    public static void main(String[] args) {
	    // Aici creez comapnia 1
        Companie c1= new Companie();
        c1.nume="eMag";
        c1.nrDeAngajati= 3000;
        c1.adresa="Bld.Revolutiei nr.21";
        c1.insolventa= Boolean.FALSE;
        c1.platitorTVA=Boolean.TRUE;
        c1.cifraDeAfaceri= 100.21f;

        //Aici creez persoana 1
        Persoana p1= new Persoana();
        p1.nume="Marius";
        p1.cnp="17801014563224";
        p1.CV="Cel mai bun angajat";
        p1.varsta=25;
        p1.esteVaccinat= true;

        //Declaram angajatul a care primese valorile a1 returnate de Angajeaza
        Angajat a = c1.angajeaza(p1,  1, 1000.0);
        //Angajam persoana pt angajarea fara returnRE
        //c1.angajeaza(p1,  1, 1000.0);

        //Afisam IDul persoanei
        System.out.println("Persoana angajata are ID: " + a.employeeID);

        //Afisam numele persoanei asignate in main
        System.out.println("Persoana angajata se numeste: " + p1.nume);
        //Afisam numele persoanei asignate in Angajat si returnate in main prin Angajat a = c1.angajeaza(p1,  1, 1000.0);
        System.out.println("Persoana angajata are ID: " + a.nume);

        //Concediem persoana
       c1.concediaza(p1.cnp);

       c1.returneazaVenitLunar();
       System.out.println("Persoana angajata are venit lunar: " + c1.returneazaVenitLunar());

        //Afisam numarul de angajati
        System.out.println("Compania are: " + c1.nrDeAngajati + " angajati.");

    }
}
