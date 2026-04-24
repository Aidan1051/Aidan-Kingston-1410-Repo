package week16examples;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class PA9_Examples {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> myDictionary = new HashMap<>();
        File file = new File("dictionary.txt");
        if (!file.exists()) {
            Files.createFile(Paths.get(file.getPath()));
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                String[] lineSplit = line.split(" ");
                myDictionary.put(lineSplit[0], lineSplit[1]);
            }
        } catch (IOException e) {
            System.out.println("Could not open file: " + file.getPath());
        }
        System.out.println(myDictionary);
    }
}
