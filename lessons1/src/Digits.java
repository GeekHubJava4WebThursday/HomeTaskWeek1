
public class Digits {
    private static final String[] word = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    public static void toWord(int digit){
        try {
            System.out.println(digit + " - " + word[digit]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Number is not a digit");
        }
    }
}
