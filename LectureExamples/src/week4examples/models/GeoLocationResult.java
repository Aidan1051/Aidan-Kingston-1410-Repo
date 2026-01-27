package week4examples.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoLocationResult {

    private int id;
    private String name;
    private double latitude;
    private double longitude;
    private double elevation;
    @JsonProperty("feature_code")
    private String featureCode;

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("admin1_id")
    private int admin1Id;

    @JsonProperty("admin2_id")
    private int admin2Id;
    private String timezone;
    private int population;

    @JsonProperty("country_id")
    private int countryId;
    private String country;
    private String admin1;
    private String admin2;

    public GeoLocationResult() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    public String getFeatureCode() {
        return featureCode;
    }

    public void setFeatureCode(String featureCode) {
        this.featureCode = featureCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public int getAdmin1Id() {
        return admin1Id;
    }

    public void setAdmin1Id(int admin1Id) {
        this.admin1Id = admin1Id;
    }

    public int getAdmin2Id() {
        return admin2Id;
    }

    public void setAdmin2Id(int admin2Id) {
        this.admin2Id = admin2Id;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAdmin1() {
        return admin1;
    }

    public void setAdmin1(String admin1) {
        this.admin1 = admin1;
    }

    public String getAdmin2() {
        return admin2;
    }

    public void setAdmin2(String admin2) {
        this.admin2 = admin2;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GeoLocationResult geoLocationResult = (GeoLocationResult) o;
        return id == geoLocationResult.id && Double.compare(latitude, geoLocationResult.latitude) == 0 && Double.compare(longitude, geoLocationResult.longitude) == 0 && Double.compare(elevation, geoLocationResult.elevation) == 0 && admin1Id == geoLocationResult.admin1Id && admin2Id == geoLocationResult.admin2Id && population == geoLocationResult.population && countryId == geoLocationResult.countryId && Objects.equals(name, geoLocationResult.name) && Objects.equals(featureCode, geoLocationResult.featureCode) && Objects.equals(countryCode, geoLocationResult.countryCode) && Objects.equals(timezone, geoLocationResult.timezone) && Objects.equals(country, geoLocationResult.country) && Objects.equals(admin1, geoLocationResult.admin1) && Objects.equals(admin2, geoLocationResult.admin2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, latitude, longitude, elevation, featureCode, countryCode, admin1Id, admin2Id, timezone, population, countryId, country, admin1, admin2);
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", elevation=" + elevation +
                ", featureCode='" + featureCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", admin1Id=" + admin1Id +
                ", admin2Id=" + admin2Id +
                ", timezone='" + timezone + '\'' +
                ", population=" + population +
                ", countryId=" + countryId +
                ", country='" + country + '\'' +
                ", admin1='" + admin1 + '\'' +
                ", admin2='" + admin2 + '\'' +
                '}';
    }
}
