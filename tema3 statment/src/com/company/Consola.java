package com.company;

public class Consola {

    public void esteNumarPrim(int x) {

    if (x<21 || x>0) {
            switch (x){
                case 0:
                    System.out.println( x + "nu este numar prim");
                    break;
                case 1:
                    System.out.println( x + "nu este numar prim");
                    break;
                case 2:
                    System.out.println( x + " este numar prim");
                    break;
                case 3:
                    System.out.println( x + " este numar prim");
                    break;
                case 4:
                    System.out.println( x + "nu este numar prim");
                    break;
                case 5:
                    System.out.println( x + " este numar prim");
                    break;
                case 6:
                    System.out.println( x + "nu este numar prim");
                    break;
                case 7:
                    System.out.println( x + " este numar prim");
                    break;
                case 8:
                    System.out.println( x + "nu este numar prim");
                    break;
                case 9:
                    System.out.println( x + "nu este numar prim");
                    break;
                case 10:
                    System.out.println( x + " nu este numar prim");
                    break;
                case 11:
                    System.out.println( x + " este numar prim");
                    break;
                case 12:
                    System.out.println( x + " nu este numar prim");
                    break;
                case 13:
                    System.out.println( x + " este numar prim");
                    break;
                case 14:
                    System.out.println( x + " nu este numar prim");
                    break;
                case 15:
                    System.out.println( x + " nu este numar prim");
                    break;
                case 16:
                    System.out.println( x + " nu este numar prim");
                    break;
                case 17:
                    System.out.println( x + " este numar prim");
                    break;
                case 18:
                    System.out.println( x + " nu este numar prim");
                    break;
                case 19:
                    System.out.println( x + " este numar prim");
                    break;
                case 20:
                    System.out.println( x + " nu este numar prim");
                    break;
            }
        }else{
        System.out.println( x + " Helooo! este mai mare de 20");
        }
    }

   public void tiparestePeEcranCelPutinOData(String text, int numarDeTipariri){
       int i=0;

       do {
           System.out.println( text );
           i++;
       }
       while (i<numarDeTipariri);
   }


   public void tiparestePeEcran(String text, int numarDeTipariri){
       int i;
       for(i=0; i<numarDeTipariri; i++){
           System.out.println( text + "de" + numarDeTipariri + "ori");
       }
   }

    public void tiparestePeEcranDeZeceOri(String text){
        int i;
        for(i=0; i<10; i++){
            System.out.println( text + " fix de 10 ori!" );
        }
    }
}
