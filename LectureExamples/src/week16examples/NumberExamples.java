package week16examples;

import java.math.BigInteger;

public class NumberExamples {

    public static void main(String[] args) {
        System.out.println("Max Integer: " + Integer.MAX_VALUE);
        System.out.println("Max Integer digits: " + (Integer.MAX_VALUE+"").length());
        System.out.println("Max Long: " + Long.MAX_VALUE);
        System.out.println("Max Long digits: " + (Long.MAX_VALUE+"").length());

        BigInteger b1 = new BigInteger("10101010101101012981204730298790870987098712340987123498765986743098723409872135498762349872340987109872340987234");
        BigInteger b2 = BigInteger.valueOf(Long.MAX_VALUE);

        System.out.println(b1.add(b2).toString());
    }
}
