package tutorial.ThreeDFigures;

import tutorial.ThreeDimensionalFigure;

public class Sphere implements ThreeDimensionalFigure {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return 4.0/3 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateArea() {
        return 3 * Math.PI * Math.pow(radius, 2);
    }

}