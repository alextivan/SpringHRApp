package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] num = {1, 7, 3, 10, 9};


        ArrayUtil sir = new ArrayUtil();
        sir.gasesteNumerePareSiImpare(num);

        int[] inversat = sir.inverseazaArray(num);

//printez sirul inversat
        int i = 0;
        for (i = 0; i < inversat.length; i++) {
            System.out.println(inversat[i]);
        }

    }
}
