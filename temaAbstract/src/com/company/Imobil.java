package com.company;

public abstract class Imobil {

    protected String numeProprietar;
    protected float metriPatrati;
    protected int pretM2;
    protected boolean cuSauFaraGaraj;
    protected Stare stare;
    protected float impozitM2;

    public Imobil(String numeProprietar, float metriPatrati, int pretM2, boolean cuSauFaraGaraj, Stare stare, float impozitM2) {
        this.numeProprietar = numeProprietar;
        this.metriPatrati = metriPatrati;
        this.pretM2 = pretM2;
        this.cuSauFaraGaraj = cuSauFaraGaraj;
        this.stare = stare;
        this.impozitM2 = impozitM2;
    }

    public Imobil() {

    }

    public abstract float pretImobil();

    public abstract float impozitImobil();

    public void setNumeProprietar(String numeProprietar) {
        this.numeProprietar = numeProprietar;
    }

    public void setMetriPatrati(float metriPatrati) {
        this.metriPatrati = metriPatrati;
    }

    public void setPretM2(int pretM2) {
        this.pretM2 = pretM2;
    }

    public void setCuSauFaraGaraj(boolean cuSauFaraGaraj) {
        this.cuSauFaraGaraj = cuSauFaraGaraj;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public void setImpozitM2(float impozitM2) {
        this.impozitM2 = impozitM2;
    }

    @Override
    public String toString() {
        return "Imobil{" +
                "numeProprietar='" + numeProprietar + '\'' +
                ", metriPatrati=" + metriPatrati +
                ", pretM2=" + pretM2 +
                ", cuSauFaraGaraj=" + cuSauFaraGaraj +
                ", stare=" + stare +
                ", impozitM2=" + impozitM2 +
                '}';
    }
}

