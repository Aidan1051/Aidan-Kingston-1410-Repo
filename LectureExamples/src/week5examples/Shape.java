package week5examples;

public interface Shape {
    public double calculateArea();
    public double calculatePerimeter();
    public default double calculateVolume() {
        return calculateArea() * calculatePerimeter();
    }

}
