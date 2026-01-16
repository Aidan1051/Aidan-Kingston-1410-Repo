package week2examples;

public class FunctionExamples {

    public static void ComputeFibonacci(int n) {
        int n1 = 0, n2 = 1;

        for (int i = 0; i < n; ++i) {
            System.out.print(n1 + " ");
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }

    public int fibRecursive(int n, int counter) {
        System.out.println("Recursive function called: " + ++counter);
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibRecursive(n - 1, ++counter) + fibRecursive(n - 2, ++counter);
    }

    public static void main(String[] args) {
        int value = 10;
        System.out.print("Function 1: ");
        ComputeFibonacci(5);
        FunctionExamples f = new FunctionExamples();
        System.out.println();
        System.out.print("Function 2: ");
        for (int i = 0; i < value; i++) {
            System.out.print(f.fibRecursive(i, 0) + " ");
        }
    }
}
