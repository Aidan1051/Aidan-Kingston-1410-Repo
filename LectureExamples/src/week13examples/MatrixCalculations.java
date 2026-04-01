//package week13examples;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.IntStream;
//
//import static week11examples.MatrixCalculations.*;
//
//public class MatrixCalculations {
//
//    /**
//     * Takes a matrix of numbers and returns the number at the given row and
//     * column "Pair".
//     */
//    public static int get(List<List<Integer>> numbers, Pair coordinates) {
//        return numbers.get(coordinates.getRow()).get(coordinates.getColumn());
//
//    }
//
//    /**
//     * Takes a matrix of numbers and returns the coordinate Pair list for each instance the given number was found.
//     */
//    public static List<Pair> findAll(List<List<Integer>> numbers, int givenNumber) {
//        List<Pair> pairs = new ArrayList<>();
//        IntStream.range(0, numbers.size()).forEach(r ->
//                IntStream.range(0,numbers.get(r).size()).forEach( c -> {
//                    if(numbers.get(r).get(c) == givenNumber) {
//                        pairs.add(Pair.builder().row(r).column(c).build());
//                    }
//                }));
//        return null;
//    }
//
//    /**
//     * Takes a matrix of numbers and returns the second largest even number in a given
//     * row or -1 if there are 0 or 1 integers on this row.
//     */
//    public static int getSecondLargestEvenNumberOfGivenRow(List<List<Integer>> numbers, int row) {
//        List<Integer> requestedRow = numbers.get(row);
//        int secondLargestEven = -1;
//        int largestEven = -1;
//        for (int c : requestedRow) {
//            if (c % 2 == 0 && c > secondLargestEven) {
//                if (c > largestEven) {
//                    secondLargestEven = largestEven;
//                    largestEven = c;
//                } else {
//                    secondLargestEven = c;
//                }
//            }
//        }
//        return -1;
//    }
//
//    /**
//     * Takes a matrix of numbers and returns the coordinate pair of the smallest number inside it.
//     */
//    public static Pair coordinatesOfSmallestNumber(List<List<Integer>> numbers) {
//            Pair coordinates = null;
//            for (int i = 0; i < numbers.size(); i++) {
//                for (int j = 0; j < numbers.get(i).size(); j++) {
//                    coordinates = Pair.builder().row(i).column(j).build();
//                }
//
//            }
//            return coordinates;
//        }
//
//    /**
//     * Takes a matrix of numbers and returns a given sorted row.
//     */
//    public static List<Integer> sortGivenRow(List<List<Integer>> numbers, int row) {
//
//        numbers.get(row).stream().sorted().toList();
//    }
//
//    /**
//     * Takes a matrix of numbers and returns the sum of the largest prime number in
//     * each row.
//     */
//    public static List<Integer> largestPrimeNumberInEachRow(List<List<Integer>> numbers) {
//        List<Integer> result = new ArrayList<>();
//        for (List<Integer> row : numbers) {
//
//        }
//
//        return null;
//    }
//
//    public static boolean isPrime(int number) {
//        if (number < 2) {
//            return false; // 0 and 1 are not prime
//        }
//
//        // Only check divisors up to sqrt(number)
//        for (int i = 2; i * i <= number; i++) {
//            if (number % i == 0) {
//                return false; // divisible, so not prime
//            }
//        }
//
//        return true; // no divisors found, it is prime
//    }
//
//    /**
//     * Takes a matrix of numbers and returns the sum of all numbers.
//     */
//    public static int sumOfAllNumbers(List<List<Integer>> numbers) {
//        int sum = 0;
//        for (List<Integer> row : numbers) {
//            for (Integer num : row) {
//                sum += num;
//            }
//        }
//
//        return sum;
//    }
//
//
//    /**
//     * Takes a matrix of numbers and returns a single dimensional list of the
//     * same data.
//     */
//    public static List<Integer> convertToSingleList(List<List<Integer>> numbers) {
//
//        return new ArrayList<>();
//    }
//
//    /**
//     * Returns the total number of times a given number is found in the given
//     * matrix.
//     */
//    public static int countFindings(List<List<Integer>> numbers, int findMe) {
//
//        return 0;
//    }
//
//    /**
//     * Returns the List that corresponds to the given pageNumber with a size of
//     * pageSize and given matrix of numbers.
//     *
//     * Hint: Use the results of the function "convertToSingleList()" and sort it.
//     */
//    public static List<Integer> pageData(List<List<Integer>> numbers, int pageSize, int
//            pageNumber) {
//        return null;
//    }
//
//    public static void main(String[] args) throws IOException {
//        Pair p1 = Pair.builder().row(1).column(2).build();
//
//        // File setup.  Read the integer matrix...
//        BufferedReader inputFile = new BufferedReader(new FileReader("LectureExamples/integers.txt"));
//        List<List<Integer>> matrix = new ArrayList<>();
//
//        for (String input = inputFile.readLine(); input != null; input = inputFile.readLine()) {
//            List<Integer> nextLine = new ArrayList<>();
//            String [] inputSplit = input.split(" ");
//            for (String s : inputSplit) {
//                nextLine.add(Integer.parseInt(s));
//            }
//
//            matrix.add(nextLine);
//        }
//        System.out.println(matrix.size());
//
//
//        // Call each function above using the integer matrix data.
//        week13examples.Pair c1 = Pair.builder().row(1).column(2).build();
//        System.out.println("With at this coordinate: " + c1 + ", you get " + get(matrix, c1));
//
//        System.out.println("List of pairs that 2 is found at: " + findAll(matrix, 2));
//
//        System.out.println("Second largest even number of given row (" +0+ "): " + getSecondLargestEvenNumberOfGivenRow(matrix, 0));
//
//        getSecondLargestEvenNumberOfGivenRow(matrix, 2);
//
//        coordinatesOfSmallestNumber(matrix);
//
//        sortGivenRow(matrix, 2);
//
//        largestPrimeNumberInEachRow(matrix);
//
//        isPrime(2);
//
//        sumOfAllNumbers(matrix);
//
//        convertToSingleList(matrix);
//
//        countFindings(matrix, 2);
//
//
//
//
//
//
//
//
//        // Print out the results of each function to the console and clearly label what each output is...
//
//
//        // No user direct user input is required for this program other than the "integers.txt" file.
//    }
//}
