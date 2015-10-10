package com.company;

import java.util.Scanner;

public class Main {



    //get factorial of the number
    public static void factorial(){
        Scanner sc = new Scanner(System.in);
        int f = 0, a;

        System.out.println("Type number");

        f = a = sc.nextInt();

        for(int i = a-1; i>=1; i--){
            f = f * i;
        }
        System.out.println("Factorial = " + f);
    }

    //sequence of fibonacci
    public  static void fibonacci(){
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int c, number;
        System.out.println("Type number");
        number = sc.nextInt();
        System.out.print(a + " "+b+" ");
        for(int i = 0; i < number; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
    //echo verbal value of the number
    public static void echoNumber(){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Type number");
        number = sc.nextInt();
        String[] numbers = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        System.out.println("You type the number "+ numbers[number]);
    }

    public static   void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a;

        System.out.println("Choose the program:");
        System.out.println("1-Factorial\n2-Fibonacci\n3-Word value of the number");
        a = sc.nextInt();
        switch (a){
            case 1:factorial();
                break;
            case 2:fibonacci();
                break;
            case 3:echoNumber();
                break;
            default:System.out.println("Select from 1 to 3");

        }

    }
}
