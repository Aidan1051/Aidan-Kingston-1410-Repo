package labFileInput;

import java.util.*;
import java.io.*;

/**
 * Reads in data records from the csv file and prints the lakes.
 *
 * @author Aidan K
 *
 */
public class LakeApp {
    public static void main(String[] args) {

        List<Lake> lakes = new ArrayList<>();

        try (Scanner scanner = new Scanner(
                LakeApp.class.getResourceAsStream("Lakes.csv"))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                Lake lake = getLake(line);

                if (lake != null) {
                    lakes.add(lake);
                }
            }

        }

        for (Lake lake : lakes) {
            System.out.println(lake);
        }
    }

    /**
     * Creates a Lake object based on the data record passed as an argument.
     * The data record is expected to be of the following format: <br/>
     * {name of the lake},{depth},{has marina}<br/>
     * <p>
     * If the argument <code>line</code> doesn't match the expected format
     * and the instance of Lake cannot be created, then the string "Error: "
     * followed by the line should be printed to the standard error stream
     * (<code>System.err</code>) and the method should return null.
     *
     * @param line a line from a csv file that includes data about a lake
     * @return Lake object corresponding to the argument <code>line</code>
     * or null if <code>line</code> didn't match the expected format.
     */
    private static Lake getLake(String line) {
        try {
            String[] parts = line.split(",");

            String name = parts[0];
            int depth = Integer.parseInt(parts[1]);
            boolean hasMarina = Boolean.parseBoolean(parts[2]);

            return new Lake(name, depth, hasMarina);

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: " + line);
            return null;
        }
    }
}