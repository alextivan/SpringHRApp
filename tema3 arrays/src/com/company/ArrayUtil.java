package com.company;

public class ArrayUtil {

    public void gasesteNumerePareSiImpare(int[] myArray) {
        int i = 0;
        int pare = 0;
        int impare = 0;

        for (i = 0; i < (myArray.length); i++) {
            if (myArray[i] % 2 == 0) {
                pare++;
            } else {
                impare++;
            }
        }
        System.out.println(pare + " pare" + " si " + impare + " impare");
    }

    public int[] inverseazaArray(int[] myArray) {
        int[] inversat = new int[myArray.length];
        int i = 0;
        for (i = 0; i < myArray.length; i++) {
            //de revazut!
                inversat[myArray.length-i-1] = myArray[i];
        }
        return inversat;
    }

}
