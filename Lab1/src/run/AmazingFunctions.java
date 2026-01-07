package run;

import java.util.Random;

public class AmazingFunctions {

    public static void main(String[] args) {

        // Function 1: Reverse a string
        String text = "Hello World";
        String reversed = reverseString(text);
        System.out.println("Original text: " + text);
        System.out.println("Reversed text: " + reversed);

        // Function 2: Roll a dice
        int sides = 6;
        int roll = rollDice(sides);
        System.out.println("Rolling a " + sides + "-sided dice...");
        System.out.println("Result: " + roll);

        // Function 3: Calculate factorial
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    // Function 1: Reverses a string
    public static String reverseString(String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }

    // Function 2: Simulates rolling a dice
    public static int rollDice(int sides) {
        Random random = new Random();
        return random.nextInt(sides) + 1;
    }

    // Function 3: Calculates the factorial of a number
    public static int factorial(int num) {
        int total = 1;
        for (int i = 1; i <= num; i++) {
            total *= i;
        }
        return total;
    }
}
