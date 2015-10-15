package com.geekhub.home.task1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kvart on 15.10.15.
 */
public class Main {
    public static void main(String[] args) {

        Factorial calculateFactorial=new Factorial();
        Scanner input = new Scanner(System.in);
        System.out.println("Input N for calculate Factorial");
        if (input.hasNextInt()) {

            int n=input.nextInt();
            System.out.println("Factorial "+n +" = "+calculateFactorial.factorial(n));

        } else {
            System.out.println("Incorrect value N");
        }
        System.out.println("Input N for sequence Fibonacci");
        if (input.hasNextInt()) {
            int n = input.nextInt();
            Fibonacci calculateFibonacci = new Fibonacci();
            System.out.println("Fibonacci " +n +" = " +Arrays.toString(calculateFibonacci.fibonacci(n)));

        } else {
            System.out.println("Incorrect value N");
        }

        System.out.println("Input N for convert to word");
        if (input.hasNextInt()) {
            int n = input.nextInt();
            NumberToWordConverter numbertoworkconverter = new NumberToWordConverter();
            System.out.println(numbertoworkconverter.numberToWordConverter(n));
        }
    }
}
