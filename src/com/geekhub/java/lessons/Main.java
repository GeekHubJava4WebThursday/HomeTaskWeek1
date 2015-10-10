package com.geekhub.java.lessons;

import com.geekhub.java.lessons.exceptions.FactorialOfNegativeNumberException;
import com.geekhub.java.lessons.exceptions.NotNumberException;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int menuItem;
        boolean run = true;
        while (run) {
            printMenu();
            menuItem = in.nextInt();

            switch (menuItem) {
                case 1:
                    CalculatorFactorial calculatorFactorial = new CalculatorFactorial();
                    try {
                        System.out.println("input n:");
                        n = in.nextInt();
                        System.out.println(n + "! = " + calculatorFactorial.getFactorial(n));
                    } catch (FactorialOfNegativeNumberException e) {
                        System.out.println("error: factorial of negative number");
                    }
                    break;
                case 2:
                    System.out.println("input n:");
                    n = in.nextInt();
                    CalculatorFibonacci calculatorFibonacci = new CalculatorFibonacci();
                    int [] sequenceFib = calculatorFibonacci.getFibonacci(n);
                    System.out.println("sequence "+ n +" number(s) fibonacci:");
                    System.out.println(Arrays.toString(sequenceFib));
                    break;
                case 3:
                    System.out.println("input number:");
                    n = in.nextInt();
                    NumberToWord memberToWord = new NumberToWord();
                    try {
                        System.out.println(n + " converted to " +memberToWord.toWord(n));
                    } catch (NotNumberException e) {
                        System.out.println("value is not number");
                    }
                    break;
                default:
                    run = false;
            }
        }
    }

    private static void printMenu() {
        System.out.println("==== Menu: ====");
        System.out.println("1 - calculate factorial");
        System.out.println("2 - calculate fibonacci");
        System.out.println("3 - number to word convert");
        System.out.println("any other number - exit");
        System.out.println("===============");
        System.out.println("select menu item:");
    }
}
