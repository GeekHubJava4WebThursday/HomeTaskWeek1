package com.geekhub.java.lessons;

import com.geekhub.java.lessons.exceptions.FactorialOfNegativeNumberException;

public class CalculatorFactorial {

    public int getFactorial(int n) throws FactorialOfNegativeNumberException{

        if (n < 0) throw new FactorialOfNegativeNumberException();

        if (n == 0) return 1;

        return n * getFactorial(n - 1);
    }
}
