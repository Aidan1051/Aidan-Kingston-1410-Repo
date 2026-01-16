package docComments;

public class Car {

    private String make;
    private String model;
    private double mpg;

    public Car(String make, String model, double mpg) {
        this.make = make;
        this.model = model;
        this.mpg = mpg;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getMpg() {
        return mpg;
    }
}
