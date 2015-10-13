package com.geekhub.java.lessons;

import com.geekhub.java.lessons.exceptions.NotNumberException;

public class NumberToWord {

    public String toWord(int n) throws NotNumberException {

        switch (n) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                throw new NotNumberException();
        }
    }
}
