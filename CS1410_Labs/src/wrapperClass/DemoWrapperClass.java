package wrapperClass;

import java.util.Random;
import java.util.Arrays;

public class DemoWrapperClass {

    private static final Random rand = new Random();

    public static String minMax() {
        return "Byte   : [" + Byte.MIN_VALUE + " , " + Byte.MAX_VALUE + "]\n" +
                "Short  : [" + Short.MIN_VALUE + " , " + Short.MAX_VALUE + "]\n" +
                "Integer: [" + Integer.MIN_VALUE + " , " + Integer.MAX_VALUE + "]\n" +
                "Long   : [" + Long.MIN_VALUE + " , " + Long.MAX_VALUE + "]\n" +
                "Float  : [" + Float.MIN_VALUE + " , " + Float.MAX_VALUE + "]\n" +
                "Double : [" + Double.MIN_VALUE + " , " + Double.MAX_VALUE + "]";
    }

    public static String numberRepresentations(int number) {
        String base10 = String.valueOf(number);
        String base16 = Integer.toHexString(number);
        String base8  = Integer.toOctalString(number);
        String base2  = Integer.toBinaryString(number);

        return String.format("%-7s  %-7s  %-7s  %s", base10, base16, base8, base2);
    }

    public static String charProperties(char c) {
        if (Character.isLowerCase(c)) {
            return c + " lowercase letter";
        } else if (Character.isUpperCase(c)) {
            return c + " uppercase letter";
        } else if (Character.isDigit(c)) {
            return c + " number";
        } else if (Character.isWhitespace(c)) {
            return c + " white space";
        } else {
            return String.valueOf(c);
        }
    }

    public static double parseSum(String[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        double sum = 0;

        for (String s : array) {
            sum += Double.parseDouble(s);
        }

        return sum;
    }

    public static int getRandomThreeDigitNumber() {
        return rand.nextInt(900) + 100;
    }

    public static char getRandomLetter() {
        int choice = rand.nextInt(52);

        if (choice < 26) {
            return (char) ('a' + choice);
        } else {
            return (char) ('A' + (choice - 26));
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println(minMax());
        System.out.println();

        int[] numbers = { 9, 17, getRandomThreeDigitNumber(), 9876, 12345};

        System.out.printf("%-7s %-7s %-6s %s%n", "Base 10", "Base 16", "Base 8", "Base 2");
        System.out.printf("%-7s %-7s %-6s %s%n", "-------", "-------", "------", "------");
        for(int n : numbers) {
            System.out.println(numberRepresentations(n));
        }
        System.out.println();

        char[] characters = {'8', ' ', '#', 'a', 'M', getRandomLetter()};

        for(char c : characters) {
            System.out.println(charProperties(c));
        }
        System.out.println();

        String[] numberArray = {"1.1", "2.5", "3.14","40.04", "5.325", "63.5"};

        String[] wholeNumbers = new String[10];
        for(int i = 0; i < wholeNumbers.length; i++) {
            wholeNumbers[i] = "" + (rand.nextInt(90) + 10);
        }

        System.out.println(Arrays.deepToString(numberArray)
                + " .. sum = " + parseSum(numberArray));
    }
}