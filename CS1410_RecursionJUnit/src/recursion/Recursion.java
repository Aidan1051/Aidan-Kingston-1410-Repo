package recursion;

public class Recursion {

    public static int sumOfDigits(int n) {
        n = Math.abs(n);
        if (n < 10) {
            return n;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static String toUpper(String str) {
        // TODO: Implement conversion to uppercase with spaces between characters
        return "";
    }

    public static double harmonic (int n) {
        if (n == 0)
            throw new IllegalArgumentException("The argument n can't be zero.");

        if (n == 1)
            return 1;
        else if (n < 0)
            return -1 * harmonic(-n);
        else // n > 1
            return 1.0 / n + harmonic(n - 1);
    }
}
