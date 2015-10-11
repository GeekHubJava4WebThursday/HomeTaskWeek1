package ua.jet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 11.10.2015.
 */
public class MainClass {

    public static String screenReader(String message){
        try {
            System.out.println(message);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            return bufferedReader.readLine();
        }catch (Exception e){
            return "Wrong value!!!";
        }
    }

    public static void factorial(Integer numeral){

            BigInteger factorial=BigInteger.valueOf(1);
            if (numeral>=0){
                for (int i=1 ; i < numeral+1 ; i++) {
                    factorial=factorial.multiply(BigInteger.valueOf(i));
                }
            System.out.println("Factorial for number - "+numeral+" is equal to - "+factorial.toString());
            } else if (numeral<0){
                System.out.println("For this number can not be counted factorial");
            }

    }

    public static void sequenceFibonachi(Integer numeral){
        if (numeral>0) {
            List<BigInteger> listFibonachi = new ArrayList<BigInteger>();
            for (int i = 0; i < numeral; i++) {
                if (i == 0||i==1) {
                    listFibonachi.add (BigInteger.valueOf(1));
                }else {
                    listFibonachi.add(listFibonachi.get(i-2).add(listFibonachi.get(i - 1)));
                }
            }
            for (BigInteger elementFibonachi:listFibonachi){
                System.out.print(elementFibonachi.toString() + " ");
            }
        }else {
            System.out.println("Wrong value!!!");
        }
    }

    public static void numberWordConverter(Integer numeral){
        List<String> wordsList = new ArrayList<String>(10);
        wordsList.add("Zero");
        wordsList.add("One");
        wordsList.add("Two");
        wordsList.add("Three");
        wordsList.add("Four");
        wordsList.add("Five");
        wordsList.add("Six");
        wordsList.add("Seven");
        wordsList.add("Eight");
        wordsList.add("Nine");

        try{
            System.out.println(wordsList.get(numeral));
        }catch (Exception e){
            System.out.println("This is not numeral. . . . ");
        }

    }

    public static void main(String[] args) {

        try {
            Integer numeralFromScreen = Integer.parseInt(screenReader("Choose :\n1.Factorial\n2.Sequence of Fibonachi\n3.Write a word for your numeral"));
            switch (numeralFromScreen){
                case 1: factorial(Integer.parseInt(screenReader("Enter number :")));
                        break;
                case 2: sequenceFibonachi(Integer.parseInt(screenReader("How many numbers from sequence you want to see?")));
                        break;
                case 3: numberWordConverter(Integer.parseInt(screenReader("Enter your numeral:")));
                        break;

            }

        }catch (Exception e){
            System.out.println("Wrong value     \n"+ e.toString());
        }

    }
}
