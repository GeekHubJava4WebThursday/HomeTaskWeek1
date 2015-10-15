package com.geekhub.home.task1;

/**
 * Created by kvart on 15.10.15.
 */
public class Fibonacci {

    public int[] fibonacci(int n){



        int [] fibonacci=new int[n];
        if (n==1){
            System.out.println("Incorrect value N");
            fibonacci[0]=1;
            return fibonacci;
        }
        if (n==2){
            System.out.println("Incorrect value N");
            fibonacci[0]=1;
            fibonacci[1]=1;
            return fibonacci;
        }

        fibonacci[0]=1;
        fibonacci[1]=1;

        for (int i=2; i<n; i++){
            fibonacci[i]= fibonacci[i-2] + fibonacci[i-1];

        }
        return fibonacci;
    }
}