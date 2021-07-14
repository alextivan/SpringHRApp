package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//task2	isBmiOptimal(78.3f, 180);
// task3    solveEquation(1, -13, 40);
        fizzBuzz(30);
    }

    public static void fizzBuzz(int max){

     //   Scanner input = new Scanner(System.in);
     //   System.out.print("a=");
     //   max = input.nextInt();
    //task4 alex  for(int i = 1; i<=max; i++)
    //task4 alex  {
    //task4 alex      if(i%3!=0 || i%7!=0){
    //task4 alex          System.out.println(i);
    //task4 alex      }else if(i%3!=0 && i%7!=0){
    //task4 alex          System.out.println("FizzBuzz");
    //task4 alex      }else if(i%3==0){
    //task4 alex          System.out.println("Fizz");
    //task4 alex      }else if(i%7==0){
    //task4 alex          System.out.println("Buzz");
    //task4 alex      }
           int i = 1;
        while (i <= max){
            if(i%3==0){
                if(i%7==0){
                    System.out.println("Fizz Buzz");
                }
                }


            }
            i++;
        }

            }


    //task3 public static void solveEquation(int a, int b, int c){

    //task3    double D = b * b -(4 * a * c);

    //task3    if (D<0){
    //task3         System.out.println("Delta negative");
    //task3     }else{
    //task3         double x = (-b - Math.sqrt(D))/(2.0f*a);
    //task3         double y = ((Math.sqrt(D)-b))/(2.0f*a);
    //task3         System.out.println("x= " + x + " y= " + y);
    //task3     }

//task2 public static void isBmiOptimal(float weightInKg, int heightInCm){
//task2     float heightInMeters = heightInCm / 100f;
//task2     float bmi = weightInKg / (heightInMeters * heightInMeters);
//task2    //double bmi2 = weightInKg / Math.pow(heightInMeters,2);
//task2     System.out.println(bmi);
//task2     if(bmi >= 18.5 && bmi <= 24.9){
//task2         System.out.println("BMI optimal!");
//task2     }else{
//task2         System.out.println("BMI not optimal!");
//task2     }

