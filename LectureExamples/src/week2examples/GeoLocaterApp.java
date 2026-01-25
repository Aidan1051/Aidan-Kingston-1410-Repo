package week2examples;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;


public class GeoLocaterApp {

    public static String getLocationData(String locationName) {
    locationName = !locationName.contains("&") ? locationName.replaceAll(" ", "+") : "";

    String urlString = "https://geocoding-api.open-meteo.com/v1/search?name=West+valley+city" + locationName + "&count=10&language=en&format=json";

    try {
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
    } catch(IOException | URISyntaxException e) {
        System.out.println("Error: Could not connect to API with thsi URL: " + urlString);


        }
    return null;

    }

    public static void main(String[] args) {
        String locationName = "west valley city";
        System.out.println(getLocationData(locationName));
    }

}
