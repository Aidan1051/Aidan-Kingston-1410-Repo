package week3examples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;


public class GeoLocaterApp {

    public static Root getLocationData(String locationName) {
        locationName = !locationName.contains("&") ? locationName.replaceAll(" ", "+") : "";

        String urlString = "https://geocoding-api.open-meteo.com/v1/search?name=" + locationName + "&count=10&language=en&format=json";

        try {
            StringBuilder resultJson = callUrl(urlString);
            if (resultJson == null) return null;
            Root myRootObject = new ObjectMapper().readValue(resultJson.toString(), Root.class);
            return myRootObject;
        } catch(IOException | URISyntaxException e) {
            System.out.println("Error: Could not connect to API with this URL: " + urlString);
        }
        return null;

    }

    public static StringBuilder callUrl(String urlString) throws URISyntaxException, IOException {
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
        return resultJson;
    }

    public static void main(String[] args) throws JsonProcessingException {
        String locationName = "west valley city";
        Root myRootObject = getLocationData(locationName);
        System.out.println(myRootObject);
    }

}
