package week5examples;

public class Triangle implements Shape {
    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return Shape.super.calculateVolume();
    }
}










