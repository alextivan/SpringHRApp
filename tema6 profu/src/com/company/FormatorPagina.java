package com.company;

public class FormatorPagina {

    public static void formateazaText(String[] cuvinte) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < cuvinte.length; i++) {
            sb.append(cuvinte[i]).append(" ");
            if((i+1) % 10 == 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
