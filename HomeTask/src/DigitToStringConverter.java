
public class DigitToStringConverter {
    private byte digit = 0;
    private String[] words = {"zero", "one", "two", "three", "four",
                                "five", "six", "seven", "eight", "nine"};

    public DigitToStringConverter(byte digit) {
        this.digit = digit;
    }

    public void convert() {
        try{
            System.out.println(words[digit]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Digit must be between 0 and 9");
        }
    }
}
