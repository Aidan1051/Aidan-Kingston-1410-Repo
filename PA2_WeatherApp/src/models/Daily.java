package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Objects;

public class Daily {

        private ArrayList<String> time;

        @JsonProperty("weather_code")
        private ArrayList<Integer> weatherCode;

        @JsonProperty("temperature_2m_max")
        private ArrayList<Double> temperature2mMax;

        @JsonProperty("temperature_2m_min")
        private ArrayList<Double> temperature2mMin;

        private ArrayList<String> sunrise;
        private ArrayList<String> sunset;


        public Daily() {}


        public ArrayList<String> getTime() {
            return time;
        }

        public void setTime(ArrayList<String> time) {
            this.time = time;
        }

        public ArrayList<Integer> getWeatherCode() {
            return weatherCode;
        }

        public void setWeatherCode(ArrayList<Integer> weatherCode) {
            this.weatherCode = weatherCode;
        }

        public ArrayList<Double> getTemperature2mMax() {
            return temperature2mMax;
        }

        public void setTemperature2mMax(ArrayList<Double> temperature2mMax) {
            this.temperature2mMax = temperature2mMax;
        }

        public ArrayList<Double> getTemperature2mMin() {
            return temperature2mMin;
        }

        public void setTemperature2mMin(ArrayList<Double> temperature2mMin) {
            this.temperature2mMin = temperature2mMin;
        }

        public ArrayList<String> getSunrise() {
            return sunrise;
        }

        public void setSunrise(ArrayList<String> sunrise) {
            this.sunrise = sunrise;
        }

        public ArrayList<String> getSunset() {
            return sunset;
        }

        public void setSunset(ArrayList<String> sunset) {
            this.sunset = sunset;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Daily daily = (Daily) o;
            return Objects.equals(time, daily.time) && Objects.equals(weatherCode, daily.weatherCode) && Objects.equals(temperature2mMax, daily.temperature2mMax) && Objects.equals(temperature2mMin, daily.temperature2mMin) && Objects.equals(sunrise, daily.sunrise) && Objects.equals(sunset, daily.sunset);
        }

        @Override
        public int hashCode() {
            return Objects.hash(time, weatherCode, temperature2mMax, temperature2mMin, sunrise, sunset);
        }

        @Override
        public String toString() {
            return "Daily{" +
                    "time=" + time +
                    ", weatherCode=" + weatherCode +
                    ", temperature2mMax=" + temperature2mMax +
                    ", temperature2mMin=" + temperature2mMin +
                    ", sunrise=" + sunrise +
                    ", sunset=" + sunset +
                    '}';
        }
    }

