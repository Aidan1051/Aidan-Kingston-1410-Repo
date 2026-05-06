package week18examples;

public class sumOfDigits {

    public int getSumOfDigits(int num) {
        int sum = 0;
        num = Math.abs(num);

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        sumOfDigits sum = new sumOfDigits();

        int result = sum.getSumOfDigits(432);

        System.out.println(result);
    }
}