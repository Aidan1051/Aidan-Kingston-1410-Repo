package week4examples;

import com.fasterxml.jackson.databind.ObjectMapper;
import week4examples.models.GeoLocationRoot;

import java.io.IOException;
import java.net.URISyntaxException;

public class GeoLocaterApp {

        public static GeoLocationRoot getLocationData(String locationName) {
            locationName = !locationName.contains("&") ? locationName.replaceAll(" ", "+") : "";

            String urlString = "https://geocoding-api.open-meteo.com/v1/search?name=" + locationName + "&count=10&language=en&format=json";

            try {
                String resultJson = WebUtils.callUrl(urlString);
                if (resultJson.isEmpty()) return null;
                GeoLocationRoot myGeoLocationRootObject = new ObjectMapper().readValue(resultJson, GeoLocationRoot.class);
                return myGeoLocationRootObject;
            } catch(IOException | URISyntaxException e) {
                System.out.println("Error: Could not connect to API with this URL: " + urlString);
            }
            return null;

        }
}
