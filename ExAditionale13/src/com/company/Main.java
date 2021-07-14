package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
   //    int sum = 5;
   //    for(int i=0; i<460; i++){
   //        sum=sum+2;
   //    }
   //    System. out .println( "Sum = " + sum);
        int sum = 0 ;
        for ( int i = 5 ; i <= 460 * 2 + 1 ; i = i + 2 ) {
            sum = sum + i;
        }
        System. out .println( "Sum = " + sum);
    }

}
