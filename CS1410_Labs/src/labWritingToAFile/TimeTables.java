package labWritingToAFile;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class TimeTables {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("TimeTables.txt")) {
            for (int table = 1; table <= 9; table += 2) {
                for (int i = 1; i <= 10; i++) {
                    String left = String.format("%2d * %d = %-3d", i, table, i * table);
                    String right = String.format("%2d * %d = %-3d", i, table + 1, i * (table + 1));
                    writer.println(left + "           " + right);
                }
                writer.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}