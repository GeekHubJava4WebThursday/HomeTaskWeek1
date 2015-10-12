/**
 * Numerals
 */
public class Numerals {

    private enum numerals {Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine};

    /**
     * @param num
     * @return
     */
    public static String  getWord(int num) {
        switch (num){
            case 0:
                return numerals.Zero.toString();
            case 1:
                return numerals.One.toString();
            case 2:
                return numerals.Two.toString();
            case 3:
                return numerals.Three.toString();
            case 4:
                return numerals.Four.toString();
            case 5:
                return numerals.Five.toString();
            case 6:
                return numerals.Six.toString();
            case 7:
                return numerals.Seven.toString();
            case 8:
                return numerals.Eight.toString();
            case 9:
                return numerals.Nine.toString();
            default:
                return "Not a numeral";
        }
    }
}
