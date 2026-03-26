package labCollection;

import java.util.ArrayList;
import java.util.List;

public class Warmup {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= 50; i += 2) {
            numbers.add(i);
        }

        printNumbers(numbers, "Numbers: ");
        System.out.println("Removing multiples of three . . .");
        numbers.removeIf(x -> x % 3 == 0);
        printNumbers(numbers, "Numbers: ");
    }

    public static void printNumbers(List<Integer> list, String label) {
        System.out.print(label);
        list.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}