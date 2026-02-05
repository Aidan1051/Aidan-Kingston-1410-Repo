package week5examples;

public class RecursionExamples {

    public static long fibRecurse(long n) {
        if (n <= 1) {
            return n;
        }
        return fibRecurse(n - 1) + fibRecurse(n - 2);
    }

    public static void fibLoop(long n) {
        long n1 = 0L, n2 = 1L;

        for (n = 0; true; n++) {
            System.out.print(n1 + " ");

            long n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

    }

    public static void main(String[] args) {
        int n = 93;
//        long start = System.nanoTime();
//        for (long i = 0; i < n; i++) {
//            System.out.print(fibRecurse(i) + " ");
//        }
//        double end = (System.nanoTime() - start) / 1_000_000.0;
//        System.out.println();
//        System.out.println("recursive Fibonacci took this much time to execute: " + end + " msec");
//        System.out.println();
//        fibLoop(n);

        long start = System.nanoTime();
        for (int(repeat = 0; repeat < 15000; repeat++) {
            fibLoop(n);
        }
        double end = (System.nanoTime() - start) / 1_000_000.0;
        System.out.println();
        System.out.print("Loop Fibonacci took this much time to execute: " + end + "msec");
    }
}
