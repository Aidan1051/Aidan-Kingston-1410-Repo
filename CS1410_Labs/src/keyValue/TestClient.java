package keyValue;

import java.util.*;

public class TestClient {

    public static <T> void printWithMargin(Collection<T> collection, int indentation) {
        String spaces = " ".repeat(indentation);
        for (T element : collection) {
            System.out.println(spaces + element);
        }
    }

    public static void main(String[] args) {

        System.out.println("Part 1:");
        System.out.println("----------");

        KeyValuePair<String, Integer> city1 = new KeyValuePair<>("SLC", 189899);
        KeyValuePair<String, Integer> city2 = new KeyValuePair<>("NY", 8244910);

        System.out.println("city1: " + city1);
        System.out.println("city2: " + city2);
        System.out.println("city1.equals(city2): " + city1.equals(city2));
        System.out.println();

        KeyValuePair<String, Integer> city3 = new KeyValuePair<>("NY", 8244910);
        System.out.println("city3: " + city3);
        System.out.println("city2.equals(city3): " + city2.equals(city3));
        System.out.println();

        System.out.println("Part 2:");
        System.out.println("----------");

        KeyValuePair<String, Integer> city4 = new KeyValuePair<>("LA", 3819702);
        KeyValuePair<String, Integer> city5 = new KeyValuePair<>("SF", 812826);

        List<KeyValuePair<String, Integer>> cities = new ArrayList<>();
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);

        System.out.println("Original List:");
        for (KeyValuePair<String, Integer> city : cities) {
            System.out.println(city);
        }
        System.out.println();

        Collections.sort(cities);
        System.out.println("Sorted List:");
        for (KeyValuePair<String, Integer> city : cities) {
            System.out.println(city);
        }
        System.out.println();

        System.out.println("Part 3:");
        System.out.println("--------");

        System.out.println("Cities with margin 5:");
        printWithMargin(cities, 5);
        System.out.println();

        Set<KeyValuePair<Integer, String>> countryCodes = new LinkedHashSet<>();
        countryCodes.add(new KeyValuePair<>(33, "France"));
        countryCodes.add(new KeyValuePair<>(43, "Austria"));
        countryCodes.add(new KeyValuePair<>(30, "Greece"));

        System.out.println("Country codes with margin 3:");
        printWithMargin(countryCodes, 3);
    }
}