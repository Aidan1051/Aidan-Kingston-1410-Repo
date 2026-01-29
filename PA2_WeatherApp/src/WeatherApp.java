import com.fasterxml.jackson.databind.ObjectMapper;
import week4examples.GeoLocaterApp;
import week4examples.WebUtils;
import week4examples.models.GeoLocationResult;
import week4examples.models.GeoLocationRoot;
import week4examples.models.WeatherOutDTO;
import week4examples.models.WeatherRoot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class WeatherApp {
    public static String getWeather(String locationName) throws URISyntaxException, IOException {

        GeoLocationRoot results = GeoLocaterApp.getLocationData(locationName);
        if (results == null || results.getResults() == null || results.getResults().isEmpty()) {
            System.out.println("No results found for location: " + locationName);
            return "";
        }
        GeoLocationResult locationData = results.getResults().getFirst();

        String urlString = "https://api.open-meteo.com/v1/forecast?latitude=" +
                locationData.getLatitude() + "&longitude=" + locationData.getLongitude() +
                "&daily=weather_code,temperature_2m_max,temperature_2m_min,sunrise,sunset&hourly=temperature_2m,relative_humidity_2m,apparent_temperature,weather_code,visibility,wind_speed_10m,soil_temperature_0cm&timezone=America%2FDenver";
        return WebUtils.callUrl(urlString);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to my Weather App! Enter your city for your weather!");
        try (BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter location name: ");
            for (String input = keyboard.readLine(); !input.isEmpty(); input = keyboard.readLine()) {
                String weatherJson = getWeather(input);
                if (!weatherJson.isEmpty()) {
                    WeatherRoot weatherData = new ObjectMapper().readValue(weatherJson, WeatherRoot.class);
                    System.out.println(packageWeatherData(weatherData));
                }else {
                    System.out.println("No results found for this location: " + input);
                }

                System.out.println("Enter location name: ");
            }
        } catch(IOException e) {
            System.out.println("There was an error in retrieving your location data.");
        } catch (URISyntaxException e) {
            System.out.println("Unable to parse JSON from required APIs.");
        }
    }

    public static WeatherOutDTO packageWeatherData(WeatherRoot weatherRoot) {
        WeatherOutDTO weatherOutDTO = new WeatherOutDTO();
        weatherOutDTO.setTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyy-MM-dd'T'HH':00'")));
        int index = indexOfCurrentTime(weatherRoot.getHourly().getTime(), weatherOutDTO.getTime());

        weatherOutDTO.setLatitude(weatherRoot.getLatitude());
        weatherOutDTO.setLongitude(weatherRoot.getLongitude());
        weatherOutDTO.setTemperature(weatherRoot.getHourly().getTemperature2m().get(index));
        weatherOutDTO.setRelativeHumidity(weatherRoot.getHourly().getRelativeHumidity2m().get(index));
        weatherOutDTO.setApparentTemperature(weatherRoot.getHourly().getApparentTemperature().get(index));
        weatherOutDTO.setWeatherCondition(convertWeatherCode(weatherRoot.getHourly().getWeatherCode().get(index)));
        weatherOutDTO.setVisibility(weatherRoot.getHourly().getVisibility().get(index));
        weatherOutDTO.setWindSpeed(weatherRoot.getHourly().getWind_speed_10m().get(index));
        weatherOutDTO.setSoilTemperature(weatherRoot.getHourly().getSoilTemperature0cm().get(index));
        weatherOutDTO.setDailyWeatherConditions(convertWeatherCode(weatherRoot.getDaily().getWeatherCode().getFirst()));
        weatherOutDTO.setMaxTemperature((weatherRoot.getDaily().getTemperature2mMax().getFirst()));
        weatherOutDTO.setMinTemperature((weatherRoot.getDaily().getTemperature2mMin().getFirst()));
        weatherOutDTO.setSunrise((weatherRoot.getDaily().getSunrise().getFirst()));
        weatherOutDTO.setSunset((weatherRoot.getDaily().getSunset().getFirst()));
        return weatherOutDTO;
    }

    private static int indexOfCurrentTime(ArrayList<String> timeList, String currentTime) {
        for(int i = 0; i < timeList.size(); i++) {
            if(timeList.get(i).equalsIgnoreCase(currentTime)) {
                return i;

            }
        }
        return -1;
    }

    private static String convertWeatherCode(int weatherCode){
        String weatherCondition;
        if(weatherCode == 0){
            weatherCondition = "Clear";
        }else if(weatherCode > 45 && weatherCode <= 48) {
            weatherCondition = "Fog";
        }else if(weatherCode > 0 && weatherCode <= 3){
            weatherCondition = "Cloudy";
        }else if((weatherCode >= 51 && weatherCode <= 67)
                || (weatherCode >= 80 && weatherCode <=82)){
            weatherCondition = "Rain";
        }else if(weatherCode >= 71 && weatherCode <= 77){
            weatherCondition = "Snow";
        }else if(weatherCode >= 95 && weatherCode <= 99){
            weatherCondition = "Thunderstorm";
        }else {
            weatherCondition = "Unknown";
        }

        return weatherCondition;

    }
}