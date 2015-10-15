package com.geekhub.home.task1;

/**
 * Created by kvart on 15.10.15.
 */
public class NumberToWordConverter {
    public String numberToWordConverter(int n){
        switch(n) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 0:
                return "Zero";
            default:
                return "Incorrect value N";
        }
    }
}
