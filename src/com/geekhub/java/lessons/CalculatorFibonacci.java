package com.geekhub.java.lessons;

public class CalculatorFibonacci {

    public int[] getFibonacci(int n) {

        if (n <= 0) return new int[0];

        int [] fib = new int[n];

        fib[0] = 1;
        if (n>1) {
            fib[1] = 1;
        }

        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i-2]+fib[i-1];
        }

        return fib;
    }
}
