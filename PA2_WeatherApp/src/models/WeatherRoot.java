package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class WeatherRoot {
        private double latitude;
        private double longitude;

        @JsonProperty("generationtime_ms")
        private double generationTimeMs;

        @JsonProperty("utc_offset_seconds")
        private int utcOffsetSeconds;
        private String timezone;

        @JsonProperty("timezone_abbreviation")
        private String timezoneAbbreviation;
        private double elevation;

        @JsonProperty("hourly_units")
        private HourlyUnits hourlyUnits;
        private Hourly hourly;

        @JsonProperty("daily_units")
        private DailyUnits dailyUnits;
        private Daily daily;

        public WeatherRoot() {}

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getUtcOffsetSeconds() {
        return utcOffsetSeconds;
    }

    public void setUtcOffsetSeconds(int utcOffsetSeconds) {
        this.utcOffsetSeconds = utcOffsetSeconds;
    }

    public double getGenerationTimeMs() {
        return generationTimeMs;
    }

    public void setGenerationTimeMs(double generationTimeMs) {
        this.generationTimeMs = generationTimeMs;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTimezoneAbbreviation() {
        return timezoneAbbreviation;
    }

    public void setTimezoneAbbreviation(String timezoneAbbreviation) {
        this.timezoneAbbreviation = timezoneAbbreviation;
    }

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    public HourlyUnits getHourlyUnits() {
        return hourlyUnits;
    }

    public void setHourlyUnits(HourlyUnits hourlyUnits) {
        this.hourlyUnits = hourlyUnits;
    }

    public Hourly getHourly() {
        return hourly;
    }

    public void setHourly(Hourly hourly) {
        this.hourly = hourly;
    }

    public DailyUnits getDailyUnits() {
        return dailyUnits;
    }

    public void setDailyUnits(DailyUnits dailyUnits) {
        this.dailyUnits = dailyUnits;
    }

    public Daily getDaily() {
        return daily;
    }

    public void setDaily(Daily daily) {
        this.daily = daily;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        WeatherRoot that = (WeatherRoot) o;
        return Double.compare(latitude, that.latitude) == 0 && Double.compare(longitude, that.longitude) == 0 && Double.compare(generationTimeMs, that.generationTimeMs) == 0 && utcOffsetSeconds == that.utcOffsetSeconds && Double.compare(elevation, that.elevation) == 0 && Objects.equals(timezone, that.timezone) && Objects.equals(timezoneAbbreviation, that.timezoneAbbreviation) && Objects.equals(hourlyUnits, that.hourlyUnits) && Objects.equals(hourly, that.hourly) && Objects.equals(dailyUnits, that.dailyUnits) && Objects.equals(daily, that.daily);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, generationTimeMs, utcOffsetSeconds, timezone, timezoneAbbreviation, elevation, hourlyUnits, hourly, dailyUnits, daily);
    }

    @Override
    public String toString() {
        return "WeatherRoot{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", generationTimeMs=" + generationTimeMs +
                ", utcOffsetSeconds=" + utcOffsetSeconds +
                ", timezone='" + timezone + '\'' +
                ", timezoneAbbreviation='" + timezoneAbbreviation + '\'' +
                ", elevation=" + elevation +
                ", hourlyUnits=" + hourlyUnits +
                ", hourly=" + hourly +
                ", dailyUnits=" + dailyUnits +
                ", daily=" + daily +
                '}';
    }
}

