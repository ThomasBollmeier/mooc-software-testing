package tudelft.roman;

public class RomanNumeralConverter {

    public static void main(String[] args) {

        RomanNumeralConverter converter = new RomanNumeralConverter();

        converter.check(1, "I");
        converter.check(104, "CIV");
        converter.check(8, "VIII");
        converter.check(1914, "MCMXIV");
        converter.check(44, "XLIV");

    }

    public int convert(String roman) {

        int ret = 0;
        int previous = 0;
        int current = 0;

        for (char ch: roman.toCharArray()) {
            current = convert(ch);
            ret += previous >= current ? previous : -previous;
            previous = current;
        }

        ret += current;

        return ret;
    }

    private int convert(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    private void check(int expected, String roman) {
        int actual = convert(roman);
        if (actual == expected) {
            System.out.printf("'%s' is correctly converted to %d\n", roman, actual);
        } else {
            System.err.printf("Expected %d but got %d from conversion of '%s'\n", expected, actual, roman);
        }
    }

}
