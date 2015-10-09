package main;

/**
 * @author Sergiy Govorukhin
 */
public class Numeral {
    /**
     *   Transform Numeral to Verbal Form
     */
    public static String toVerbal(byte numeral) {
        if ((numeral > 9) || (numeral < 0)) {
            System.out.println("Numeral must be between 0 and 9!");
        } else {
            switch (numeral) {
                case 0: return "zero";
                case 1: return "one";
                case 2: return "two";
                case 3: return "three";
                case 4: return "four";
                case 5: return "five";
                case 6: return "six";
                case 7: return "seven";
                case 8: return "eight";
                case 9: return "nine";
                default:
                    return "unknown numeral!";
            }
        }
        return "0";
    }
}
