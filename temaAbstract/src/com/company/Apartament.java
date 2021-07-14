package com.company;

public class Apartament extends Imobil{
    public Apartament(String numeProprietar, float metriPatrati, int pretM2, boolean cuSauFaraGaraj, Stare stare, float impozitM2) {
        super(numeProprietar, metriPatrati, pretM2, cuSauFaraGaraj, stare, impozitM2);
    }


    @Override
    public float pretImobil() {
        return metriPatrati*pretM2;
    }

    @Override
    public float impozitImobil() {
        return metriPatrati*impozitM2;
    }
}
