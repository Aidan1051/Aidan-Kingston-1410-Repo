package week2examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VariableExamples {


    public static void main(String[] args) /*throws IOException*/ {

        int a = 5;
        Integer b = 6;

        char c = '0';

        System.out.println(a + b);
        System.out.println((int) c);
        System.out.println(a + c);

        for (char thisChar = 0; thisChar < 255; thisChar++) {
            System.out.println(thisChar);
        }


        try (BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))) {
        System.out.println("Welcome to CSIS1410. Type something here: ");
        for (String input = keyboard.readLine(); !input.isEmpty(); input = keyboard.readLine()) {
            System.out.println("You typed this: " + input);

            System.out.println("Give me something else: ");
        }

        System.out.println("Same thing with a while loop. Type something here: ");
        String input = keyboard.readLine();
        while (!input.isEmpty()) {
            System.out.println("You typed this: " + input);
            System.out.println("Give me something else: ");
            input = keyboard.readLine();
        }
    } catch (IOException e) {
        System.out.println("This code should never be seen..");
    }

        // keyboard.close();
    }
}
