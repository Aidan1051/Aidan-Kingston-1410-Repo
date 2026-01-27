package week4examples;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class WebUtils {
    public static String callUrl(String urlString) throws URISyntaxException, IOException {
        URL url = new URI(urlString).toURL();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();

        if (conn.getResponseCode() != 200) {
            System.out.println("Error: Could not connect to API with this URL: " + urlString);
            return null;
        }

        StringBuilder resultJson = new StringBuilder();
        Scanner scanner = new Scanner(conn.getInputStream());

        while (scanner.hasNext()) {
            resultJson.append(scanner.nextLine());
        }

        scanner.close();
        conn.disconnect();
        return resultJson.toString();
    }
}
