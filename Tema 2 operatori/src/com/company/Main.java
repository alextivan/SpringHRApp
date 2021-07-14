package com.company;

public class Main {

    public static void main(String[] args) {

        Aritmetica aritmetica = new Aritmetica();
        System.out.println(aritmetica.adunare(2,3));
        System.out.println(aritmetica.scadere(4,3));
        System.out.println(aritmetica.inmultire(4,3));
        System.out.println(aritmetica.modulo(4,3));
        System.out.println(aritmetica.impartire(4,3));

        Logica logica = new Logica();
        System.out.println(logica.si(true,true));
        System.out.println(logica.sau(true,false));

    }

}
