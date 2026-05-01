package week17examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2Text {
    public static final String[] ones = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",  "seventeen", "eighteen", "nineteen"};
    public static final String[] tens = new String[] {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    public static final String[] others = new String[] {"-", " hundred ", " thousand ", " million ", " billion ", " trillion ", " quadrillion ",  " quintillion "};
    public static final long[] otherInts = new long[] {10, 100, 1000, 1000000, 1000000000, 1000000000000L, 1000000000000000L, 1000000000000000000L};
    private static String numRecurse(long value) {
        if (value < 20) {
            return ones[(int) value];
        }
        for (int i = 1; i < others.length; i++) {
            if (value < otherInts[i]) {
                return numHelper(value, i - 1);
            }
        }
        return numHelper(value, others.length - 1);
    }
    private static String numHelper(long value, int index) {
        long topHalf = value / otherInts[index];
        long bottomHalf = value % otherInts[index];
        if (bottomHalf == 0) {
            return index == 0 ? tens[(int) topHalf] : (numRecurse(topHalf) + others[index]);
        }
        return (index == 0 ? tens[(int) topHalf] : numRecurse(topHalf)) + others[index] + numRecurse(bottomHalf);

    }

    public static String getTextFromNumber(String input) {
        try {
            long inputLong = Long.parseLong(input);
            String sign = inputLong < 0 ? "negative " : "";
            return sign + numRecurse(Math.abs(inputLong)).replaceAll(" ", " ").trim();
        } catch (NumberFormatException e) {
            return "The given user input '" + input + "' is NOT an long!";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give me a number : ");
        for (String input = keyboard.readLine(); !input.isEmpty(); input = keyboard.readLine()) {
            System.out.println(getTextFromNumber(input));
            System.out.println("Give me a number: ");
        }
    }
}
