package week4examples.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class HourlyUnits {
    private String time;

    @JsonProperty("temperature_2m")
    private String temperature2m;

    @JsonProperty("relative_humidity_2m")
    private String relativeHumidity2m;

    @JsonProperty("apparent_temperature")
    private String apparentTemperature;

    @JsonProperty("weather_code")
    private String weatherCode;

    private String visibility;

    @JsonProperty("wind_speed_10m")
    private String windSpeed10m;

    @JsonProperty("soil_temperature_0cm")
    private String soilTemperature0cm;

    public HourlyUnits() {}

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperature2m() {
        return temperature2m;
    }

    public void setTemperature2m(String temperature2m) {
        this.temperature2m = temperature2m;
    }

    public String getRelativeHumidity2m() {
        return relativeHumidity2m;
    }

    public void setRelativeHumidity2m(String relativeHumidity2m) {
        this.relativeHumidity2m = relativeHumidity2m;
    }

    public String getApparentTemperature() {
        return apparentTemperature;
    }

    public void setApparentTemperature(String apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
    }

    public String getWindSpeed10m() {
        return windSpeed10m;
    }

    public void setWindSpeed10m(String windSpeed10m) {
        this.windSpeed10m = windSpeed10m;
    }

    public String getSoilTemperature0cm() {
        return soilTemperature0cm;
    }

    public void setSoilTemperature0cm(String soilTemperature0cm) {
        this.soilTemperature0cm = soilTemperature0cm;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HourlyUnits that = (HourlyUnits) o;
        return Objects.equals(time, that.time) && Objects.equals(temperature2m, that.temperature2m) && Objects.equals(relativeHumidity2m, that.relativeHumidity2m) && Objects.equals(apparentTemperature, that.apparentTemperature) && Objects.equals(weatherCode, that.weatherCode) && Objects.equals(visibility, that.visibility) && Objects.equals(windSpeed10m, that.windSpeed10m) && Objects.equals(soilTemperature0cm, that.soilTemperature0cm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, temperature2m, relativeHumidity2m, apparentTemperature, weatherCode, visibility, windSpeed10m, soilTemperature0cm);
    }


    @Override
    public String toString() {
        return "HourlyUnits{" +
                "time='" + time + '\'' +
                ", temperature2m='" + temperature2m + '\'' +
                ", relativeHumidity2m='" + relativeHumidity2m + '\'' +
                ", apparentTemperature='" + apparentTemperature + '\'' +
                ", weatherCode='" + weatherCode + '\'' +
                ", visibility='" + visibility + '\'' +
                ", windSpeed10m='" + windSpeed10m + '\'' +
                ", soilTemperature0cm='" + soilTemperature0cm + '\'' +
                '}';
    }
}
