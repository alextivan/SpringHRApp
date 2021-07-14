package com.company;

public class Main {

    public static void main(String[] args) {
        int l = 4;
        int c = 3;
        int[][] Matrice = new int[l][c];
        int contor = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                Matrice[i][j] = contor;
                contor++;
                System.out.print(Matrice[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < Matrice.length; i++) {
            for (int j = 0; j < Matrice[i].length; j++) {
                System.out.print("tab[" + i + "][" + j + "]=" + Matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}

