package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Companie {
    public String nume;
    public short nrDeAngajati;
    public String adresa;
    public String telefon;
    public Boolean insolventa;
    public Boolean platitorTVA;
    public Float cifraDeAfaceri;

    public Angajat angajeaza(Persoana p, int employeeID, double salariu){
        Angajat a1= new Angajat();
        a1.cnp = p.cnp;
        a1.varsta=p.varsta;
        a1.nume=p.nume;
        a1.CV=p.CV;
        a1.esteVaccinat=p.esteVaccinat;
        a1.employeeID=employeeID;
        a1.salariu=salariu;
        System.out.println("S-a angajat persoana cu CNP:" + p.cnp);
        return a1;

    }

    public void concediaza(String cnp){
        System.out.println("A fost concediata persoana cu CNP:" + cnp);
    }

    public double returneazaVenitLunar(){
        return 18.5;
    }
}
