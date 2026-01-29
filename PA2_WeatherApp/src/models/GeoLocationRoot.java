package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoLocationRoot {
    private ArrayList<GeoLocationResult> geoLocationResults;

    @JsonProperty("generationtime_ms")
    private double generationtimeMs;

    public GeoLocationRoot() {}

    public ArrayList<GeoLocationResult> getResults() {
        return geoLocationResults;
    }

    public void setResults(ArrayList<GeoLocationResult> geoLocationResults) {
        this.geoLocationResults = geoLocationResults;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GeoLocationRoot geoLocationRoot = (GeoLocationRoot) o;
        return Double.compare(generationtimeMs, geoLocationRoot.generationtimeMs) == 0 && Objects.equals(geoLocationResults, geoLocationRoot.geoLocationResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(geoLocationResults, generationtimeMs);
    }

    @Override
    public String toString() {
        return "Root{" +
                "results=" + geoLocationResults +
                ", generationtimeMs=" + generationtimeMs +
                '}';
    }
}