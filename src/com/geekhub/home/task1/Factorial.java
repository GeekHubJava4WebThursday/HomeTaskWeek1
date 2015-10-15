package com.geekhub.home.task1;

/**
 * Created by kvart on 15.10.15.
 */
public class Factorial {
    public int factorial(int n){

        if (n==0){
            return 1;
        }
        if (n<0){
            System.out.println("Incorrect value N");
            return 0;
        }

        int x=1;

        for (int i=1; i<=n; i++){
             x=x*i;
        }

        return x;
    }
}

