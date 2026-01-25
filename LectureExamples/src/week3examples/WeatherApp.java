package week3examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

public class WeatherApp {

    public static String getWeather(String locationName) throws URISyntaxException, IOException {
        Result locationData = GeoLocaterApp.getLocationData(locationName).getResults().get(0);

        String urlString = "https://api.open-meteo.com/v1/forecast?latitude=" +
        locationData.getLatitude() + "&longitude=" + locationData.getLongitude() +
        "&daily=weather_code,temperature_2m_max,temperature_2m_min,sunrise,sunset&hourly=temperature_2m,relative_humidity_2m,apparent_temperature,weather_code,visibility,wind_speed_10m,soil_temperature_0cm&timezone=America%2FDenver";
        return GeoLocaterApp.callUrl(urlString).toString();
    }

    public static void main(String[] args) {
        try (BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter location name: ");
            for (String input = keyboard.readLine(); !input.isEmpty(); input = keyboard.readLine()) {
                System.out.println(getWeather(input));
            }
        } catch(IOException e) {
            System.out.println("There was an error in retrieving your location data.");
        } catch (URISyntaxException e) {
            System.out.println("Unable to parse JSON from required APIs.");
        }


    }

}
