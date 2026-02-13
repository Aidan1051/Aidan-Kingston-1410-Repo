package recursion;

/**
 * This class will give you practice implementing recursive functions and their equivalent looping functions.
 *
 * Be sure the recursive/loop function pairs have the exact same results for a given input.  For the recursive functions,
 * you may find that you need additional parameters to store data between recursive calls.  Feel free to add any parameters needed
 * for recursive functions and remove extra parameters for looping functions.
 *
 * @author <Put your name here>
 *
 */
public class RecursivePractice {

    /**
     * Counts by 2's from the 'currentNumber' up to the limit.
     */
    public static int countUpByTwosRecurse(int limit, int currentNumber) {
        if (limit % 2 != 0) {
            limit--;
        }
        if (limit <= currentNumber) {
            return limit;
        }
//		System.out.print(currentNumber + " ");
        return countUpByTwosRecurse(limit, currentNumber + 2);
    }

    /**
     * Does exactly what 'countUpByTwosRecurse()' does but using loops.  Notice we don't need the extra 'currentNumber'
     * parameter to count up by 2's.
     */
    public static int countUpByTwosLoop(int limit) {

        // Implement this solution using a loop...

        if  (limit % 2 != 0) {
            limit--;
        }
        for (int i = 0; i <= limit; i+= 2) {
//			System.out.print(i + " ");
        }

        return limit;
    }

    /**
     * Computes the factorial of a given number.
     */
    public static long factorialRecurse(long number) {
        if (number <= 1) {
            return 1;
        }
        return number * factorialRecurse(number - 1);
    }

    /**
     * Does exactly what 'factorialRecurse()' does but using loops.
     */
    public static long factorialLoop(long number) {

        // Implement this solution using a loop...
        long result = 1;
        for (; number > 1; number--) {
            result *= number;
        }
        return result;
    }

    /**
     * Given a non-negative integer number, return the sum of its digits using loops.
     *
     * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
     * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     */
    public static int sumOfDigitsLoop(int number) {
        int sum = number % 10;
        while (number > 0) {
            number /= 10;
            sum += number % 10;
        }
        return sum;
    }

    /**
     * Does what 'sumOfDigitsLoop()' does but using recursion.  Note: You may need an extra method parameter to store the
     * current state of each recursive call.  See the function 'countUpByTwosRecurse()' for an example.
     */
    public static int sumOfDigitsRecursion(int number) {

        // Implement this solution using recursion...
        return (number < 10) ? (number) : (number % 10) + sumOfDigitsRecursion(number/10);

    }

    /**
     * Counts down by 3's from the 'start' integer with a '!' following each number.
     * Stops counting before 0 and returns 0;
     */
    public static int countDownByThreeLoop(int start) {
        for (int i = start; i > 0; i -= 3) {
//			System.out.print(i + "! ");
        }
        return 0;
    }

    /**
     * Does exactly what 'countDownByThreeLoop()' does but using recursion.
     */
    public static int countDownByThreeRecursion(int start) {

        // Implement this solution using recursion...
        if (start <= 0) {
            return 0;
        }
//		System.out.print(start + "! ");
        return countDownByThreeRecursion(start - 3);
    }

    public static void main(String[] args) {
//		System.out.print("Counting up by 2's recursively: ");
//		System.out.println(countUpByTwosRecurse(16, 0));
//		System.out.print("Counting up by 2's using a loop: ");
//		System.out.println(countUpByTwosLoop(16) + "\r\n");
//		System.out.println("Factorial recurse: " + factorialRecurse(5));
//		System.out.println("Factorial looping: " + factorialLoop(5) + "\r\n");
//		System.out.println("Some of digits using a loop: " + sumOfDigitsLoop(123));
//		System.out.println("Some of digits using a recursively: " + sumOfDigitsRecursion(123) + "\r\n");
//		System.out.print("Counting down by 3 using a loop: ");
//		System.out.println(countDownByThreeLoop(10));
//		System.out.print("Counting down by 3 recursively: ");
//		System.out.println(countDownByThreeRecursion(10));
        System.out.println("\nCOUNT UP BY TWOS");
        System.out.println("Input,Loop(ns),Recursive(ns)");

        System.out.println("\nFACTORIAL");
        System.out.println("Input,Loop(ns),Recursive(ns)");

        for (int input = 5; input <= 40; input += 5) {

            long start = System.nanoTime();
            long iterations = 0;

            while (System.nanoTime() - start < 1_000_000_000) {
                factorialLoop(input);
                iterations++;
            }

            long loopTime = (System.nanoTime() - start) / iterations;

            start = System.nanoTime();
            iterations = 0;

            while (System.nanoTime() - start < 1_000_000_000) {
                factorialRecurse(input);
                iterations++;
            }

            long recursiveTime = (System.nanoTime() - start) / iterations;

            System.out.println(input + "," + loopTime + "," + recursiveTime);
        }

        System.out.println("\nSUM OF DIGITS");
        System.out.println("Input,Loop(ns),Recursive(ns)");

        for (int input = 100000; input <= 800000; input += 100000) {

            long start = System.nanoTime();
            long iterations = 0;

            while (System.nanoTime() - start < 1_000_000_000) {
                sumOfDigitsLoop(input);
                iterations++;
            }

            long loopTime = (System.nanoTime() - start) / iterations;

            start = System.nanoTime();
            iterations = 0;

            while (System.nanoTime() - start < 1_000_000_000) {
                sumOfDigitsRecursion(input);
                iterations++;
            }

            long recursiveTime = (System.nanoTime() - start) / iterations;

            System.out.println(input + "," + loopTime + "," + recursiveTime);
        }

        System.out.println("\nCOUNT DOWN BY THREE");
        System.out.println("Input,Loop(ns),Recursive(ns)");

        for (int input = 3000; input <= 24000; input += 3000) {

            long start = System.nanoTime();
            long iterations = 0;

            while (System.nanoTime() - start < 1_000_000_000) {
                countDownByThreeLoop(input);
                iterations++;
            }

            long loopTime = (System.nanoTime() - start) / iterations;

            start = System.nanoTime();
            iterations = 0;

            while (System.nanoTime() - start < 1_000_000_000) {
                countDownByThreeRecursion(input);
                iterations++;
            }

            long recursiveTime = (System.nanoTime() - start) / iterations;

            System.out.println(input + "," + loopTime + "," + recursiveTime);
        }


    }
}
