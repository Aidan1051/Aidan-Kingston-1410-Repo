package week4examples.models;

import java.util.Objects;

public class WeatherOutDTO {

    private String time;
    private Double latitude;
    private Double longitude;
    private Double temperature;
    private Integer relativeHumidity;
    private Double apparentTemperature;
    private String weatherCondition;
    private Double visibility;
    private Double windSpeed;
    private Double soilTemperature;
    private String dailyWeatherConditions;
    private Double maxTemperature;
    private Double minTemperature;
    private String sunrise;
    private String sunset;


    public WeatherOutDTO() {}

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Integer getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(Integer relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public Double getApparentTemperature() {
        return apparentTemperature;
    }

    public void setApparentTemperature(Double apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public Double getVisibility() {
        return visibility;
    }

    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Double getSoilTemperature() {
        return soilTemperature;
    }

    public void setSoilTemperature(Double soilTemperature) {
        this.soilTemperature = soilTemperature;
    }

    public String getDailyWeatherConditions() {
        return dailyWeatherConditions;
    }

    public void setDailyWeatherConditions(String dailyWeatherConditions) {
        this.dailyWeatherConditions = dailyWeatherConditions;
    }

    public Double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(Double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public Double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(Double minTemperature) {
        this.minTemperature = minTemperature;
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
        WeatherOutDTO that = (WeatherOutDTO) o;
        return Objects.equals(time, that.time) && Objects.equals(latitude, that.latitude) && Objects.equals(longitude, that.longitude) && Objects.equals(temperature, that.temperature) && Objects.equals(relativeHumidity, that.relativeHumidity) && Objects.equals(apparentTemperature, that.apparentTemperature) && Objects.equals(weatherCondition, that.weatherCondition) && Objects.equals(visibility, that.visibility) && Objects.equals(windSpeed, that.windSpeed) && Objects.equals(soilTemperature, that.soilTemperature) && Objects.equals(dailyWeatherConditions, that.dailyWeatherConditions) && Objects.equals(maxTemperature, that.maxTemperature) && Objects.equals(minTemperature, that.minTemperature) && Objects.equals(sunrise, that.sunrise) && Objects.equals(sunset, that.sunset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, latitude, longitude, temperature, relativeHumidity, apparentTemperature, weatherCondition, visibility, windSpeed, soilTemperature, dailyWeatherConditions, maxTemperature, minTemperature, sunrise, sunset);
    }

    @Override
    public String toString() {
        return "WeatherOutDTO{" +
                "time='" + time + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", temperature=" + temperature +
                ", relativeHumidity=" + relativeHumidity +
                ", apparentTemperature=" + apparentTemperature +
                ", weatherCondition='" + weatherCondition + '\'' +
                ", visibility=" + visibility +
                ", windSpeed=" + windSpeed +
                ", soilTemperature=" + soilTemperature +
                ", dailyWeatherConditions='" + dailyWeatherConditions + '\'' +
                ", maxTemperature=" + maxTemperature +
                ", minTemperature=" + minTemperature +
                ", sunrise='" + sunrise + '\'' +
                ", sunset='" + sunset + '\'' +
                '}';
    }
}
