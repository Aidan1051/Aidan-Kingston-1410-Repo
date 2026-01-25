package week3examples;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Root{
    private ArrayList<Result> results;

    @JsonProperty("generationtime_ms")
    private double generationtimeMs;

    public Root() {}

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Root root = (Root) o;
        return Double.compare(generationtimeMs, root.generationtimeMs) == 0 && Objects.equals(results, root.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, generationtimeMs);
    }

    @Override
    public String toString() {
        return "Root{" +
                "results=" + results +
                ", generationtimeMs=" + generationtimeMs +
                '}';
    }
}