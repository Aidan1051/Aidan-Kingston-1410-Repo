import java.io.*;
import java.util.*;

public class DictionaryApp {

    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String fileName = "PA9/dictionary.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains(":")) {
                    String[] parts = line.split(": ", 2);
                    dictionary.put(parts[0], parts[1]);
                }
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        System.out.println("Welcome to the Dictionary Program!");

        while (true) {
            System.out.print("Enter a word to add (or press Enter to stop): ");
            String word = input.nextLine();

            if (word.isBlank()) {
                break;
            }

            System.out.print("Enter the definition: ");
            String definition = input.nextLine();

            if (definition.isBlank()) {
                break;
            }

            dictionary.put(word, definition);
        }

        while (true) {
            System.out.print("Enter a word to look up (or press Enter to stop): ");
            String search = input.nextLine();

            if (search.isBlank()) {
                break;
            }

            if (dictionary.containsKey(search)) {
                System.out.println("Definition: " + dictionary.get(search));
            } else {
                System.out.println("Word not found.");
            }
        }

        System.out.println("\nFull Dictionary:");
        for (String key : dictionary.keySet()) {
            System.out.println(key + ": " + dictionary.get(key));
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            for (String key : dictionary.keySet()) {
                writer.write(key + ": " + dictionary.get(key));
                writer.newLine();
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        System.out.println("\nDictionary saved. Program exiting.");
    }
}