package week18examples;

public class sumOfASCII {

    public int getSumOfASCII(String text) {
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            sum += text.charAt(i);
        }

        return sum;
    }

    public static void main(String[] args) {
        sumOfASCII s = new sumOfASCII();
        String text = "HI";
        int sum = s.getSumOfASCII(text);
        System.out.println(sum);
    }
}