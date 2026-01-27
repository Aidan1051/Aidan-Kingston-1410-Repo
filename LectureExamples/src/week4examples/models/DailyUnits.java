package week4examples.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class DailyUnits {

    private String time;

    @JsonProperty("weather_code")
    private String weatherCode;

    @JsonProperty("temperature_2m_max")
    private String temperature2mMax;

    @JsonProperty("temperature_2m_min")
    private String temperature2mMin;

    private String sunrise;
    private String sunset;

    public DailyUnits() {}

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
    }

    public String getTemperature2mMax() {
        return temperature2mMax;
    }

    public void setTemperature2mMax(String temperature2mMax) {
        this.temperature2mMax = temperature2mMax;
    }

    public String getTemperature2mMin() {
        return temperature2mMin;
    }

    public void setTemperature2mMin(String temperature2mMin) {
        this.temperature2mMin = temperature2mMin;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DailyUnits that = (DailyUnits) o;
        return Objects.equals(time, that.time) && Objects.equals(weatherCode, that.weatherCode) && Objects.equals(temperature2mMax, that.temperature2mMax) && Objects.equals(temperature2mMin, that.temperature2mMin) && Objects.equals(sunrise, that.sunrise) && Objects.equals(sunset, that.sunset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, weatherCode, temperature2mMax, temperature2mMin, sunrise, sunset);
    }

    @Override
    public String toString() {
        return "DailyUnits{" +
                "time='" + time + '\'' +
                ", weatherCode='" + weatherCode + '\'' +
                ", temperature2mMax='" + temperature2mMax + '\'' +
                ", temperature2mMin='" + temperature2mMin + '\'' +
                ", sunrise='" + sunrise + '\'' +
                ", sunset='" + sunset + '\'' +
                '}';
    }
}
