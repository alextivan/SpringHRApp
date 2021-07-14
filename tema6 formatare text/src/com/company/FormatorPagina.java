package com.company;

public class FormatorPagina {


    public static StringBuilder formateazaText(String[] cuvinte){

        StringBuilder x = new StringBuilder("");

        for(int i=0; i < cuvinte.length; i++){

           if(i!=0 && i%10==0) {
               x.append("\n");
           }
            x.append(cuvinte[i]).append(" ");
            }
        return x;
    }
}
