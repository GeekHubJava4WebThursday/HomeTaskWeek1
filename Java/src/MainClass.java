import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by COMRADE on 13.10.2015.
 */
public class MainClass {



    public static void main(String[] args){
        MainClass mainClass = new MainClass();
        mainClass.initInter();
    }

    public void initText(){
        System.out.println("1. Calculate the factorial of a number\n" +
                "2. Print the Fibonacci sequence\n" +
                "3. Print the specified number in words\n"+
                "4. Exit");
    }

    public void initInter(){
        initText();
        Scanner s = new Scanner(System.in);
        int choos = s.nextInt();
        switch (choos){
            case 1 : task1();
            case 2 : task2();
            case 3 : task3();
            case 4 : System.exit(0);
            default:  System.out.println("No!");
        }
    }

    public void task1(){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int factDigit = 0;
        int res = 1;
        System.out.println("Enter the number: ");
        try {
            factDigit = Integer.parseInt(bf.readLine());
            for(int i = 1; i <= factDigit; i++){
                res *= i;
            }
            System.out.println(res);
        } catch (IOException e) {
            e.printStackTrace();
        }
        initInter();
    }

    public void task2(){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int countIter = 0;
        int number1 = 0;
        int number2 = 1;
        int digit = 0;
        System.out.println("Fibonachi: \n" + "Number of iterations: ");
        try {
            countIter = Integer.parseInt(bf.readLine());
            //System.out.print(" ," + number1);
            for(int i = 0; i <= countIter; i++) {
                System.out.print(number1 + ", ");
                digit = number1;
                number1 += number2;
                number2 = digit;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        initInter();
    }

    public void task3(){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int digit = 0;
        String name = "";
        System.out.println("Enter the number:  ");
        try {
            digit = Integer.parseInt(bf.readLine());
            switch(digit){
                case 0 : name = "Zero"; break;
                case 1 : name = "One"; break;
                case 2 : name = "Two"; break;
                case 3 : name = "Three"; break;
                case 4 : name = "Four"; break;
                case 5 : name = "Five"; break;
                case 6 : name = "Six"; break;
                case 7 : name = "Seven"; break;
                case 8 : name = "Eight"; break;
                case 9 : name = "Nine"; break;
                default : name = "It is not an integer!";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Result: " + name);
        initInter();
    }

}
