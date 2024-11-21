package tutorial.ThreeDFigures;

import tutorial.ThreeDimensionalFigure;

public class Cylinder implements ThreeDimensionalFigure {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double calculateArea() {
        return (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);
    }

}
