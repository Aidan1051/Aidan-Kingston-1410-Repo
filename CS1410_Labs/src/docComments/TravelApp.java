package docComments;

public class TravelApp {

    public static void main(String[] args) {

        Car m4 = new Car("BMW", "M4", 25);
        Car civic = new Car("Honda", "Civic", 42);

        System.out.println("Cars:");
        System.out.println(m4.getMake() + " " + m4.getModel() + " " + (int) m4.getMpg() + " mpg");
        System.out.println(civic.getMake() + " " + civic.getModel() + " " + (int) civic.getMpg() + " mpg");
        System.out.println();

        TripPlanner californiaTrip = new TripPlanner("SF", "LA", 382, m4);
        TripPlanner floridaTrip = new TripPlanner("Tampa", "Miami", 280, civic);

        System.out.println("California Trip:");
        System.out.println(californiaTrip);
        System.out.printf("fuel consumption: %.1f gallons%n%n",
                californiaTrip.fuelConsumption());

        System.out.println("Florida Trip:");
        System.out.println(floridaTrip);
        System.out.printf("fuel consumption: %.1f gallons%n",
                floridaTrip.fuelConsumption());
    }
}
