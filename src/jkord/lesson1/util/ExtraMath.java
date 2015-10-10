package jkord.lesson1.util;

import java.math.BigInteger;

public class ExtraMath
{
    private static long factorial(int n, long acc)
    {
        return (n == 0)? acc : factorial(n - 1, acc * n);
    }

    public static long factorial(int n)
    {
        return (n < 1)? 1 : factorial(n, 1);
    }

    public static long[] sequenceFibonacci(int n)
    {
        if (n < 3)
            return new long[] {1};

        long sequence[] = new long[n];
        sequence[0] = 1;
        sequence[1] = 1;

        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        return sequence;
    }
}