package ioURL;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class DemoURLAccess {

    public static void main(String[] args) {

        String uriString = "https://www.gutenberg.org/files/46768/46768-0.txt";
        String fileName = System.getProperty("user.dir") + "/Resources/Content.txt";

        URI uri;
        URL url = null;

        try {
            uri = new URI(uriString);

            try {
                url = uri.toURL();
            } catch (MalformedURLException e) {
                System.out.println("We encountered a problem regarding " + url);
                e.printStackTrace();
            }

        } catch (URISyntaxException e) {
            System.out.println("Invalid URI syntax.");
            e.printStackTrace();
        }

        final int PAGE_LENGTH = 35;
        int lineCount = 0;

        try (
                Scanner scanner = new Scanner(System.in);
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))
        ) {

            // FIXED CONNECTION (important part)
            URLConnection connection = url.openConnection();
            connection.setConnectTimeout(15000);
            connection.setReadTimeout(15000);
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");

            try (InputStream stream = connection.getInputStream();
                 BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {

                String line;

                while ((line = reader.readLine()) != null) {

                    // Print to screen
                    System.out.println(line);

                    // Write to file
                    writer.write(line);
                    writer.newLine();

                    lineCount++;

                    // Pause every PAGE_LENGTH lines
                    if (lineCount % PAGE_LENGTH == 0) {
                        System.out.println();
                        System.out.println("- - - Press Enter to continue - - -");
                        scanner.nextLine();
                    }
                }

            } catch (IOException e) {
                System.out.println("Attempting to open a stream from the following URL:");
                System.out.println(uriString);
                System.out.println("caused a problem.");
                e.printStackTrace();
            }

        } catch (IOException e) {
            System.out.println("File writing or scanner issue occurred.");
            e.printStackTrace();
        }
    }
}