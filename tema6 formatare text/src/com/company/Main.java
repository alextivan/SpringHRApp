package com.company;

public class Main {

    public static void main(String[] args) {

        FormatorPagina fp = new FormatorPagina();

        String[] cuvinte = {"Ioana", "merge", "la", "piata", "sa", "cumpere", "mere", "pentru", "bunica", "si",
                "Ioana", "merge", "la", "piata", "sa", "cumpere", "mere", "pentru", "bunica", "si",
                "Ioana", "merge", "la", "piata", "sa", "cumpere", "mere", "pentru", "bunica", "si"};

        StringBuilder textFormatat = fp.formateazaText(cuvinte);

        System.out.println(textFormatat.toString());

    }
}
