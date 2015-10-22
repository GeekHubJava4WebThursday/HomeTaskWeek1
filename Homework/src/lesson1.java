import java.util.Scanner;

/**
 * Created by Вадимка on 10.10.2015.
 */
public class lesson1 {
    public static void main(String[] args){
        int number;
        int numberForFactorial;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите цифру для вывода её словесной интерпретации: ");
        number=sc.nextInt();
        numberOfwords(number);
        System.out.print("Введите число для вычесления факториала:");
        numberForFactorial=sc.nextInt();
        factorial(numberForFactorial);
        fibonachi();


    }

    public static void numberOfwords(int num){
        String[] massiveOfNumbers = {"Ноль","Один","Два","Три","Четыре","Пять","Шесть","Семь","Восемь","Девять"};
        System.out.println("Вы ввели число:" + massiveOfNumbers[num]);
    }

    public static void factorial(int fact){
        int summOfFactorial=1;
        for(int i=1;i<=fact;i++){
            summOfFactorial=summOfFactorial*i;
        }
        System.out.println("Факториал введеной цифри:" + summOfFactorial);
    }

    public static void fibonachi(){
        int first,second,third;
        first=0;
        second=1;
        third=1;
        System.out.print("Последовательность Фибоначчи:");
        while(third<=10946){
            third=first+second;
            first=second;
            second=third;
            System.out.print(first + " ");
        }
    }
}
