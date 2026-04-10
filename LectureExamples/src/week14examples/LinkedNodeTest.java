package week14examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class LinkedNodeTest {

    private LinkedNode<Integer> numbers;
    private LinkedNode<String> strings;

    @BeforeEach
    void setUp() throws Exception {
        numbers = new LinkedNode<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(3);

        strings = new LinkedNode<>();
        strings.push("five");
        strings.push("nine");
        strings.push("six");
        strings.push("two");
        strings.push("seven");
        strings.push("one");
    }

    @Test
    void test1() {
        Assertions.assertEquals(numbers.size(), 4);
        Assertions.assertEquals(strings.size(), 6);
    }

    @Test
    void test2() {
        Assertions.assertEquals(numbers.peek(), Integer.valueOf(1));
        Assertions.assertEquals(strings.peek(), "five");
        Assertions.assertEquals(numbers.peekLast(), Integer.valueOf(3));
        Assertions.assertEquals(strings.peekLast(), "one");
    }

    @Test
    void test3() {
        Assertions.assertEquals(numbers.toList(), List.of(3,3,2,1));
        Assertions.assertEquals(strings.toList(), List.of("one","seven","two","six","nine","five"));
        Assertions.assertEquals("[3, 3, 2, 1]", numbers.toString());
        Assertions.assertEquals("[one, seven, two, six, nine, five]", strings.toString());
    }

    @Test
    void test4(){
        Assertions.assertFalse(numbers.contains(4));
        Assertions.assertTrue(numbers.contains(3));
        Assertions.assertFalse(strings.contains("me"));
        Assertions.assertTrue(strings.contains("six"));
    }

    @Test
    void test5() {
        Assertions.assertEquals(numbers.containsAll(List.of(1,2,3)), true);
        Assertions.assertEquals(numbers.containsAll(List.of(1,2,3,4)), false);
        Assertions.assertEquals(numbers.containsAll(List.of(1)), true);
        Assertions.assertEquals(numbers.containsAll(List.of(1,2)), true);
        Assertions.assertEquals(numbers.containsAll(List.of()), false);
        Assertions.assertEquals(strings.containsAll(List.of("1")), false);
        Assertions.assertEquals(strings.containsAll(List.of("six", "one", "five")), true);
    }

    @Test
    void test6() {
        Assertions.assertEquals(numbers.poll(), Integer.valueOf(1));
        Assertions.assertEquals(numbers.size(), 3);
        Assertions.assertEquals(numbers.peek(), Integer.valueOf(2));
        Assertions.assertEquals(numbers.peekLast(), Integer.valueOf(3));
        Assertions.assertEquals(numbers.contains(1), false);
        numbers.push(8);
        Assertions.assertEquals(numbers.peekLast(), Integer.valueOf(8));
        Assertions.assertEquals(numbers.size(), 4);
        Assertions.assertEquals(numbers.toList(), List.of(8,3,3,2));
        Assertions.assertEquals(numbers.pollFirstOccurrence(8), true);
        Assertions.assertEquals(numbers.toList(), List.of(3,3,2));
        numbers.push(55);
        Assertions.assertEquals(numbers.contains(55), true);
        Assertions.assertEquals(numbers.toList(), List.of(55,3,3,2));
    }

    @Test
    void test7() {
        Assertions.assertEquals(numbers.pollLast(), Integer.valueOf(3));
        Assertions.assertEquals(numbers.toList(), List.of(3,2,1));
        Assertions.assertEquals(numbers.toString(), "[3, 2, 1]");
        strings.poll();
        strings.poll();
        strings.poll();
        Assertions.assertEquals(strings.size(), 3);
        Assertions.assertEquals(strings.pollFirstOccurrence("six"), false);
        Assertions.assertEquals(strings.size(), 3);
        Assertions.assertEquals(strings.isEmpty(), false);
        strings.clear();
        Assertions.assertEquals(strings.isEmpty(), true);
        Assertions.assertEquals(strings.size(), 0);
        Assertions.assertEquals(strings.toString(), "[]");
        strings.pushAll(List.of("Happy", "Birthday", "To", "You"));
        Assertions.assertEquals(strings.isEmpty(), false);
        Assertions.assertEquals(strings.toString(), "[You, To, Birthday, Happy]");
        Assertions.assertEquals(strings.size(), 4);
        Assertions.assertEquals(numbers.poll(), Integer.valueOf(1));
        Assertions.assertEquals(numbers.size(), 2);
        Assertions.assertEquals(numbers.poll(), Integer.valueOf(2));
        Assertions.assertEquals(numbers.size(), 1);
        Assertions.assertEquals(numbers.poll(), Integer.valueOf(3));
        Assertions.assertEquals(numbers.size(), 0);
        Assertions.assertEquals(numbers.poll(), null);
        Assertions.assertEquals(numbers.size(), 0);
    }
}

