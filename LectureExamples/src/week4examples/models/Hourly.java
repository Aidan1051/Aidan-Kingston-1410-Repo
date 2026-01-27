package week4examples.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Objects;

public class Hourly {

    public ArrayList<String> time;

    @JsonProperty("temperature_2m")
    public ArrayList<Double> temperature2m;

    @JsonProperty("relative_humidity_2m")
    public ArrayList<Integer> relativeHumidity2m;

    @JsonProperty("apparent_temperature")
    public ArrayList<Double> apparentTemperature;

    @JsonProperty("weather_code")
    public ArrayList<Integer> weatherCode;

    public ArrayList<Double> visibility;

    @JsonProperty("wind_speed_10m")
    public ArrayList<Double> wind_speed_10m;

    @JsonProperty("soil_temperature_0cm")
    public ArrayList<Double> soilTemperature0cm;

    public Hourly() {}

    public ArrayList<Double> getSoilTemperature0cm() {
        return soilTemperature0cm;
    }

    public void setSoilTemperature0cm(ArrayList<Double> soilTemperature0cm) {
        this.soilTemperature0cm = soilTemperature0cm;
    }

    public ArrayList<Double> getWind_speed_10m() {
        return wind_speed_10m;
    }

    public void setWind_speed_10m(ArrayList<Double> wind_speed_10m) {
        this.wind_speed_10m = wind_speed_10m;
    }

    public ArrayList<Double> getVisibility() {
        return visibility;
    }

    public void setVisibility(ArrayList<Double> visibility) {
        this.visibility = visibility;
    }

    public ArrayList<Integer> getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(ArrayList<Integer> weatherCode) {
        this.weatherCode = weatherCode;
    }

    public ArrayList<Double> getApparentTemperature() {
        return apparentTemperature;
    }

    public void setApparentTemperature(ArrayList<Double> apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public ArrayList<Integer> getRelativeHumidity2m() {
        return relativeHumidity2m;
    }

    public void setRelativeHumidity2m(ArrayList<Integer> relativeHumidity2m) {
        this.relativeHumidity2m = relativeHumidity2m;
    }

    public ArrayList<Double> getTemperature2m() {
        return temperature2m;
    }

    public void setTemperature2m(ArrayList<Double> temperature2m) {
        this.temperature2m = temperature2m;
    }

    public ArrayList<String> getTime() {
        return time;
    }

    public void setTime(ArrayList<String> time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Hourly hourly = (Hourly) o;
        return Objects.equals(time, hourly.time) && Objects.equals(temperature2m, hourly.temperature2m) && Objects.equals(relativeHumidity2m, hourly.relativeHumidity2m) && Objects.equals(apparentTemperature, hourly.apparentTemperature) && Objects.equals(weatherCode, hourly.weatherCode) && Objects.equals(visibility, hourly.visibility) && Objects.equals(wind_speed_10m, hourly.wind_speed_10m) && Objects.equals(soilTemperature0cm, hourly.soilTemperature0cm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, temperature2m, relativeHumidity2m, apparentTemperature, weatherCode, visibility, wind_speed_10m, soilTemperature0cm);
    }

    @Override
    public String toString() {
        return "Hourly{" +
                "time=" + time +
                ", temperature2m=" + temperature2m +
                ", relativeHumidity2m=" + relativeHumidity2m +
                ", apparentTemperature=" + apparentTemperature +
                ", weatherCode=" + weatherCode +
                ", visibility=" + visibility +
                ", wind_speed_10m=" + wind_speed_10m +
                ", soilTemperature0cm=" + soilTemperature0cm +
                '}';
    }
}

