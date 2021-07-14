package com.company;

public class Main {


  public static void main(String[] args) {
 //test5     printPrimeNumbersSmallerThen (20);

    //test6
    double suma;
    suma =  calculHarmonicSum(2);
      System.out.println(suma);
      }

public static double calculHarmonicSum(int n){
    double sum = 1;
for(int i = 2; i <= n; i++){
    sum += 1 / (double)i;
}
return sum;
}



 //test5   public static void printPrimeNumbersSmallerThen (int max){

 //test5       for (int i = 2; i < max; i++){
 //test5           if (isPrime(i)){
 //test5               System.out.println(i);
 //test5           }
 //test5       }
 //test5   }


 //test5 public static boolean isPrime(int x){
 //test5         if( x <= 1 ){
 //test5             return false;
 //test5         }
 //test5         for(int i = 2; i < x; i++){
 //test5             if(x % i == 0){
 //test5                 return false;
 //test5             }
 //test5         }
 //test5     return true;
 //test5     }



}
