package numbersWriter;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for generating {code String} from number
 * @version 1.0
 * @author Morhun N.
 */
public class NumbersWriterInWords {

    private static final int MAXIMAL_NUMBER_OF_GROUPS = 7; // long can not contain more
    private static final String GROUP_NAMES[] = {
            "",
            "thousand",
            "million",
            "milliard",
            "billion",
            "billiard",
            "trillion"
    };
    private static final String DIGITS[] = {
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine"
    };
    private static final String DOZENS[] = {
            "",
            "ten",
            "twenty",
            "thirty",
            "forty",
            "fifty",
            "sixty",
            "seventy",
            "eighty",
            "ninety"
    };
    private static final String NUMBERS_FROM_10_TO_19[] = {
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen"
    };
    private static final String MINUS_WORD = "minus";
    private static final String HUNDRED_WORD = "hundred";
    private static final String AND_WORD = "and";

    /**
     * Writes specified number in words
     * @param number number for writing in words
     * @return specified number in words
     */
    public String getNumberInWords(long number) {
        if (number == 0l) {
            return DIGITS[0];
        }

        List<String> result = new ArrayList<>();
        if (number < 0) {
            result.add(MINUS_WORD);
            number = - number;
        }

        int groups[] = divideNumberOnGroups(number);
        for (int i = MAXIMAL_NUMBER_OF_GROUPS - 1; i >= 0; i--) {
            if (groups[i] != 0) {
                result.addAll(getGroupInWords(groups[i], i));
            }
        }

        return joinList(result);
    }

    /**
     * Prints into console specified number in words
     * @param number number for printing
     */
    public void printNumberInWords(long number) {
        System.out.print(getNumberInWords(number));
    }

    /**
     * Divides number on groups of three digits
     * @param number number for dividing on groups
     * @return array of groups of specified number
     */
    private int[] divideNumberOnGroups(long number) {
        int groups[] = new int[MAXIMAL_NUMBER_OF_GROUPS];
        for (int i = 0; i < MAXIMAL_NUMBER_OF_GROUPS && number != 0l; i++) {
            groups[i] = (int) (number % 1000);
            number /= 1000;
        }
        return groups;
    }

    /**
     * Forming a group of three digits and adds corresponding to this group suffix
     * If group is empty (all numbers are zeros) then returns empty list
     * @param group group of three digits
     * @param groupNumber sequence number of group
     * @return formed group with corresponding suffix
     */
    private List<String> getGroupInWords(int group, int groupNumber) {
        List<String> result = new ArrayList<>(5);

        int hundreds = group / 100;
        int tensAndUnits = group % 100;

        if (hundreds != 0) {
            result.add(DIGITS[hundreds]);
            result.add(HUNDRED_WORD);
        }
        if (tensAndUnits != 0) {
            if (hundreds != 0) {
                result.add(AND_WORD);
            }

            if (tensAndUnits < 10) {
                result.add(DIGITS[tensAndUnits]);
            } else if (tensAndUnits < 20) {
                result.add(NUMBERS_FROM_10_TO_19[tensAndUnits - 10]);
            } else {
                int dozens = tensAndUnits / 10;
                int units = tensAndUnits % 10;
                result.add(DOZENS[dozens]);
                if (units != 0) {
                    result.add(DIGITS[units]);
                }
            }
        }

        if (! result.isEmpty()) {
            result.add(GROUP_NAMES[groupNumber]);
        }

        return result;
    }

    /**
     * Joins string list into one string with whitespace as separator
     * @param list string list for joining into one string
     * @return joined into string list
     */
    private String joinList(List<String> list) {
        return String.join(" ", list);
    }

}
