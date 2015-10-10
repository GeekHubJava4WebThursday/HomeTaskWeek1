package com.company;

import java.util.Scanner;

public class Main {

    public static void factorial(int a){
        int f = 0;

        f = a;

        for(int i = a-1; i>=1; i--){
            f = f * i;
        }
        System.out.println("Factorial = " + f);
    }
    public static void fibonacci(int number){

    }

    public static void echoNumber(int number){
        String[] numbers = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        System.out.println("You type the number "+ numbers[number]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a;

        System.out.println("Type number");

        a = sc.nextInt();//Считываем  число

        echoNumber(a);
    }
}
