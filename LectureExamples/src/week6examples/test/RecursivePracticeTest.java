package week6examples.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week6examples.RecursivePractice;

public class RecursivePracticeTest {

    @Test
    public void testCountUpByTwosRecursive() {
        Assertions.assertEquals(10, RecursivePractice.countUpByTwosRecurse(10, 0));
        Assertions.assertEquals(8, RecursivePractice.countUpByTwosRecurse(9, 0));
        Assertions.assertEquals(0, RecursivePractice.countUpByTwosRecurse(0, 0));
        Assertions.assertEquals(2, RecursivePractice.countUpByTwosRecurse(3, 0));
        Assertions.assertEquals(14, RecursivePractice.countUpByTwosRecurse(14, 0));
        Assertions.assertEquals(6, RecursivePractice.countUpByTwosRecurse(7, 0));
        Assertions.assertEquals(
                RecursivePractice.countUpByTwosRecurse(10, 0),
                RecursivePractice.countUpByTwosLoop(10)
        );

        Assertions.assertEquals(
                RecursivePractice.countUpByTwosRecurse(19, 0),
                RecursivePractice.countUpByTwosLoop(19)
        );

    }
    @Test
    public void testCountUpByTwosLoop() {
        Assertions.assertEquals(10, RecursivePractice.countUpByTwosLoop(10));
        Assertions.assertEquals(8, RecursivePractice.countUpByTwosLoop(9));
        Assertions.assertEquals(0, RecursivePractice.countUpByTwosLoop(0));
        Assertions.assertEquals(2, RecursivePractice.countUpByTwosLoop(3));
        Assertions.assertEquals(14, RecursivePractice.countUpByTwosLoop(14));
        Assertions.assertEquals(6, RecursivePractice.countUpByTwosLoop(7));
        Assertions.assertEquals(
                RecursivePractice.countUpByTwosLoop(8),
                RecursivePractice.countUpByTwosRecurse(8, 0)
        );

        Assertions.assertEquals(
                RecursivePractice.countUpByTwosLoop(15),
                RecursivePractice.countUpByTwosRecurse(15, 0)
        );

    }

    @Test
    public void testFactorialRecurse() {
        Assertions.assertEquals(1, RecursivePractice.factorialRecurse(0));
        Assertions.assertEquals(1, RecursivePractice.factorialRecurse(1));
        Assertions.assertEquals(2, RecursivePractice.factorialRecurse(2));
        Assertions.assertEquals(6, RecursivePractice.factorialRecurse(3));
        Assertions.assertEquals(24, RecursivePractice.factorialRecurse(4));
        Assertions.assertEquals(120, RecursivePractice.factorialRecurse(5));
        Assertions.assertEquals(720, RecursivePractice.factorialRecurse(6));
        Assertions.assertEquals(5040, RecursivePractice.factorialRecurse(7));
    }

    @Test public void testFactorialLoop() {
        Assertions.assertEquals(1, RecursivePractice.factorialLoop(0));
        Assertions.assertEquals(1, RecursivePractice.factorialLoop(1));
        Assertions.assertEquals(2, RecursivePractice.factorialLoop(2));
        Assertions.assertEquals(6, RecursivePractice.factorialLoop(3));
        Assertions.assertEquals(24, RecursivePractice.factorialLoop(4));
        Assertions.assertEquals(120, RecursivePractice.factorialLoop(5));
        Assertions.assertEquals(
                RecursivePractice.factorialLoop(8),
                RecursivePractice.factorialRecurse(8)
        );

        Assertions.assertEquals(
                RecursivePractice.factorialLoop(9),
                RecursivePractice.factorialRecurse(9)
        );



    }

    @Test
    public void testFactorialRecursive() {
        Assertions.assertEquals(6, RecursivePractice.sumOfDigitsRecursion(123));
        Assertions.assertEquals(15, RecursivePractice.sumOfDigitsRecursion(456));
        Assertions.assertEquals(0, RecursivePractice.sumOfDigitsRecursion(0));
        Assertions.assertEquals(9, RecursivePractice.sumOfDigitsRecursion(9));
        Assertions.assertEquals(10, RecursivePractice.sumOfDigitsRecursion(55));
        Assertions.assertEquals(27, RecursivePractice.sumOfDigitsRecursion(999));
        Assertions.assertEquals(
                RecursivePractice.factorialRecurse(6),
                RecursivePractice.factorialLoop(6)
        );

        Assertions.assertEquals(
                RecursivePractice.factorialRecurse(7),
                RecursivePractice.factorialLoop(7)
        );

    }

    @Test
    public void testSumOfDigitsLoop() {
        Assertions.assertEquals(6, RecursivePractice.sumOfDigitsLoop(123));
        Assertions.assertEquals(15, RecursivePractice.sumOfDigitsLoop(456));
        Assertions.assertEquals(0, RecursivePractice.sumOfDigitsLoop(0));
        Assertions.assertEquals(9, RecursivePractice.sumOfDigitsLoop(9));
        Assertions.assertEquals(10, RecursivePractice.sumOfDigitsLoop(55));
        Assertions.assertEquals(27, RecursivePractice.sumOfDigitsLoop(999));
        Assertions.assertEquals(
                RecursivePractice.sumOfDigitsLoop(4567),
                RecursivePractice.sumOfDigitsRecursion(4567)
        );

        Assertions.assertEquals(
                RecursivePractice.sumOfDigitsLoop(1000),
                RecursivePractice.sumOfDigitsRecursion(1000)
        );



    }

    @Test
    public void testCountDownByThreeRecursion() {
        Assertions.assertEquals(0, RecursivePractice.countDownByThreeRecursion(9));
        Assertions.assertEquals(0, RecursivePractice.countDownByThreeRecursion(6));
        Assertions.assertEquals(0, RecursivePractice.countDownByThreeRecursion(3));
        Assertions.assertEquals(0, RecursivePractice.countDownByThreeRecursion(1));
        Assertions.assertEquals(0, RecursivePractice.countDownByThreeRecursion(0));
        Assertions.assertEquals(0, RecursivePractice.countDownByThreeRecursion(-3));
        Assertions.assertEquals(
                RecursivePractice.countDownByThreeRecursion(12),
                RecursivePractice.countDownByThreeLoop(12)
        );

        Assertions.assertEquals(
                RecursivePractice.countDownByThreeRecursion(9),
                RecursivePractice.countDownByThreeLoop(9)
        );

    }

    @Test
    public void testCountDownByThreeLoop() {
        Assertions.assertEquals(0, RecursivePractice.countDownByThreeLoop(9));
        Assertions.assertEquals(0, RecursivePractice.countDownByThreeLoop(6));
        Assertions.assertEquals(0, RecursivePractice.countDownByThreeLoop(3));
        Assertions.assertEquals(0, RecursivePractice.countDownByThreeLoop(1));
        Assertions.assertEquals(0, RecursivePractice.countDownByThreeLoop(0));
        Assertions.assertEquals(0, RecursivePractice.countDownByThreeLoop(-3));
        Assertions.assertEquals(
                RecursivePractice.countDownByThreeLoop(15),
                RecursivePractice.countDownByThreeRecursion(15)
        );

        Assertions.assertEquals(
                RecursivePractice.countDownByThreeLoop(6),
                RecursivePractice.countDownByThreeRecursion(6)
        );

    }
}
