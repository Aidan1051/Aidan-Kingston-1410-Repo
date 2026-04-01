import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MatrixCalculations {

    /**
     * Takes a matrix of numbers and returns the number at the given row and
     * column "Pair".
     */
    public static int get(List<List<Integer>> numbers, Pair coordinates) {
        return numbers.get(coordinates.getRow()).get(coordinates.getColumn());

    }

    /**
     * Takes a matrix of numbers and returns the coordinate Pair list for each instance the given number was found.
     */
    public static List<Pair> findAll(List<List<Integer>> numbers, int givenNumber) {
        List<Pair> pairs = new ArrayList<>();
        for (int r = 0; r < numbers.size(); r++) {
            for (int c = 0; c < numbers.get(r).size(); c++) {
                if (numbers.get(r).get(c) == givenNumber) {
                    pairs.add(Pair.builder().row(r).column(c).build());
                }
            }
        }
        return pairs;
    }

    /**
     * Takes a matrix of numbers and returns the second largest even number in a given
     * row or -1 if there are 0 or 1 integers on this row.
     */
    public static int getSecondLargestEvenNumberOfGivenRow(List<List<Integer>> numbers, int row) {
        List<Integer> requestedRow = numbers.get(row);

        int largestEven = -1;
        int secondLargestEven = -1;

        for (int c : requestedRow) {
            if (c % 2 == 0) {
                if (c > largestEven) {
                    secondLargestEven = largestEven;
                    largestEven = c;
                } else if (c > secondLargestEven && c != largestEven) {
                    secondLargestEven = c;
                }
            }
        }

        return secondLargestEven;
    }

    /**
     * Takes a matrix of numbers and returns the coordinate pair of the smallest number inside it.
     */
    public static Pair coordinatesOfSmallestNumber(List<List<Integer>> numbers) {
        int smallest = Integer.MAX_VALUE;
        Pair coordinates = null;

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.get(i).size(); j++) {
                if (numbers.get(i).get(j) < smallest) {
                    smallest = numbers.get(i).get(j);
                    coordinates = Pair.builder().row(i).column(j).build();
                }
            }
        }

        return coordinates;
    }

    /**
     * Takes a matrix of numbers and returns a given sorted row.
     */
    public static List<Integer> sortGivenRow(List<List<Integer>> numbers, int row) {
        List<Integer> sorted = new ArrayList<>(numbers.get(row));
        Collections.sort(sorted);
        return sorted;
    }

    /**
     * Takes a matrix of numbers and returns the sum of the largest prime number in
     * each row.
     */
    public static List<Integer> largestPrimeNumberInEachRow(List<List<Integer>> numbers) {
        List<Integer> result = new ArrayList<>();

        for (List<Integer> row : numbers) {
            int largestPrime = -1;
            for (int num : row) {
                if (isPrime(num) && num > largestPrime) {
                    largestPrime = num;
                }
            }
            result.add(largestPrime);
        }

        return result;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // 0 and 1 are not prime
        }

        // Only check divisors up to sqrt(number)
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // divisible, so not prime
            }
        }

        return true; // no divisors found, it is prime
    }

    /**
     * Takes a matrix of numbers and returns the sum of all numbers.
     */
    public static int sumOfAllNumbers(List<List<Integer>> numbers) {
        int sum = 0;
        for (List<Integer> row : numbers) {
            for (Integer num : row) {
                sum += num;
            }
        }

        return sum;
    }


    /**
     * Takes a matrix of numbers and returns a single dimensional list of the
     * same data.
     */
    public static List<Integer> convertToSingleList(List<List<Integer>> numbers) {
        List<Integer> result = new ArrayList<>();
        for (List<Integer> row : numbers) {
            for (int num : row) {
                result.add(num);
            }
        }
        return result;
    }

    /**
     * Returns the total number of times a given number is found in the given
     * matrix.
     */
    public static int countFindings(List<List<Integer>> numbers, int findMe) {
        int count = 0;
        for (List<Integer> row : numbers) {
            for (int num : row) {
                if (num == findMe) count++;
            }
        }
        return count;
    }

    /**
     * Returns the List that corresponds to the given pageNumber with a size of
     * pageSize and given matrix of numbers.
     * <p>
     * Hint: Use the results of the function "convertToSingleList()" and sort it.
     */
    public static List<Integer> pageData(List<List<Integer>> numbers, int pageSize, int pageNumber) {
        List<Integer> list = convertToSingleList(numbers);
        Collections.sort(list);

        int start = pageNumber * pageSize;
        int end = Math.min(start + pageSize, list.size());

        List<Integer> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            result.add(list.get(i));
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader("integers.txt"));
        List<List<Integer>> matrix = new ArrayList<>();

        for (String input = inputFile.readLine(); input != null; input = inputFile.readLine()) {
            List<Integer> nextLine = new ArrayList<>();
            String[] inputSplit = input.split(" ");
            for (String s : inputSplit) {
                nextLine.add(Integer.parseInt(s));
            }
            matrix.add(nextLine);
        }

        inputFile.close();

        Pair c1 = Pair.builder().row(1).column(2).build();

        System.out.println("Value at coordinate " + c1 + ": " + get(matrix, c1));
        System.out.println("All coordinates of number 2: " + findAll(matrix, 2));
        System.out.println("Second largest even in row 0: " + getSecondLargestEvenNumberOfGivenRow(matrix, 0));
        System.out.println("Coordinates of smallest number: " + coordinatesOfSmallestNumber(matrix));
        System.out.println("Sorted row 2: " + sortGivenRow(matrix, 2));
        System.out.println("Largest prime in each row: " + largestPrimeNumberInEachRow(matrix));
        System.out.println("Sum of all numbers: " + sumOfAllNumbers(matrix));
        System.out.println("Matrix as single list: " + convertToSingleList(matrix));
        System.out.println("Count of number 2: " + countFindings(matrix, 2));
        System.out.println("Page data (page size 5, page 0): " + pageData(matrix, 5, 0));
    }
}

