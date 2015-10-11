package jkord.lesson1.util;


public class VerbalNumber
{
    final String[] str1 = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    final String[] str11 = {"", "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
    final String[] str10 = {"", "ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    final String[] unit = {"thousands", "million", "billion", "trillion"};
    final String pref = "negative";

    protected String getS1(int n) {
        return str1[n];
    }
    protected String getS11(int n) {
        return str11[n];
    }
    protected String getS10(int n) {
        return str10[n];
    }
    protected String getS100(int n) {
        return str1[n] + " hundred";
    }

    protected String getUnit(long cnt) {
        int cn = String.valueOf(cnt).length();
        if (cn < 4)
            return "";

        switch (cn) {
            case 4: return unit[0];
            case 5: return unit[1];
            case 6: return unit[2];
            case 7: return unit[3];
            default: return "infinity";
        }
    }

    protected String triadToString(int n) {
        StringBuilder sb = new StringBuilder();

        if (n % 1000 > 99) {
            sb.append(getS100(n % 1000 / 100));
            sb.append(" ");
        }
        if (n % 100 > 10 && n % 100 < 20) {
            sb.append(getS11(n % 10));
            sb.append(" ");

            return sb.toString();
        }
        if (n % 100 > 9) {
            sb.append(getS10(n % 100 / 10));
            sb.append(" ");
        }
        if (n % 10 > 0) {
            sb.append(getS1(n % 10));
            sb.append(" ");
        }

        return sb.toString();
    }

    public String toString(Number num) {
        String str = "";
        if (num.longValue() == 0)
            str = getS1(0);

        if (num.longValue() < 0) {
            num = - num.longValue();
            str = pref;
        }

        while (num.longValue() > 0) {
            String triad = triadToString((int)(num.longValue() % 1000));
            str = triad + getUnit(num.longValue()) + " " + str;
            num = num.longValue() / 1000;
        }

        return str;
    }
}
