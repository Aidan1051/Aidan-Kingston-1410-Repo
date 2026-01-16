package docComments;

public class TripPlanner {

    private String departure;
    private String arrival;
    private double distance;
    private Car car;

    public TripPlanner(String departure, String arrival, double distance, Car car) {
        this.departure = departure;
        this.arrival = arrival;
        this.distance = distance;
        this.car = car;
    }

    public double fuelConsumption() {
        return distance / car.getMpg();
    }

    @Override
    public String toString() {
        return "TripPlanner [departure=" + departure +
                ", arrival=" + arrival +
                ", distance=" + (int) distance +
                ", car=" + car.getModel() + "]";
    }
}
